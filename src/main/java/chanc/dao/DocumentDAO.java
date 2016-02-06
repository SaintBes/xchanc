package chanc.dao;

import chanc.domain.Document;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
public interface DocumentDAO {

    Document createDocument(Document document);
    Document readDociument(int docId);
    void uppdateDocument(Document document);
    void deleteDocument(Document document);
    List<Document> findAllDocuments();
}
