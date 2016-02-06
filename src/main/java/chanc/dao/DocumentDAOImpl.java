package chanc.dao;

import chanc.domain.Document;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Repository
public class DocumentDAOImpl implements DocumentDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Document createDocument(Document document) {
        sessionFactory.getCurrentSession().save(document);
        return (Document) sessionFactory.getCurrentSession().get(Document.class, document.getDocId());
    }

    @Override
    public Document readDocument(int docId) {
        return (Document) sessionFactory.getCurrentSession().get(Document.class, docId);
    }

    @Override
    public void uppdateDocument(Document document) {
        sessionFactory.getCurrentSession().update(document);
    }

    @Override
    public void deleteDocument(Document document) {
        sessionFactory.getCurrentSession().delete(document);
    }

    @Override
    public List<Document> findAllDocuments() {
        return sessionFactory.getCurrentSession().createCriteria(Document.class).list();
    }
}
