package chanc.service;

import chanc.domain.Document;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
public interface DocumentService {

    Document createDocument(Document document);
    Document readDocument(int documentId);
    void uppdateDocument(Document document);
    void deleteDocument(Document document);
    List<Document> findAllDocuments();
}
