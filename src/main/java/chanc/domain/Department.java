package chanc.domain;

import javax.persistence.*;
import javax.swing.text.StringContent;
import java.util.List;

/**
 * Created by admssa on 27.01.2016.
 */
@Entity
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int depId;

    private String depName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "department")
    private List<User> users;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    private List<Document> documents;

    public Department() {
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
