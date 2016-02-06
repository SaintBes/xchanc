package chanc.service;

import chanc.dao.DocumentDAO;
import chanc.domain.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Service
@Transactional
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentDAO documentDAO;

    @Override
    public Document createDocument(Document document) {
        return documentDAO.createDocument(document);
    }

    @Override
    @Transactional(readOnly = true)
    public Document readDocument(int documentId) {
        return documentDAO.readDocument(documentId);
    }

    @Override
    public void uppdateDocument(Document document) {
        documentDAO.uppdateDocument(document);
    }

    @Override
    public void deleteDocument(Document document) {
        documentDAO.deleteDocument(document);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Document> findAllDocuments() {
        return documentDAO.findAllDocuments();
    }
}
