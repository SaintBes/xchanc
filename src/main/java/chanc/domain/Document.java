package chanc.domain;

import javax.persistence.*;
import java.io.File;
import java.sql.Date;
import java.util.List;

/**
 * Created by admssa on 02.02.2016.
 */
@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int docId;

    private Date creationDate;

    private Date overDate;

    private int inputNumber;

    private String reestrNumber;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "countryId")
    private Country country;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "cityId")
    private City city;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "companyId")
    private Company company;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "employeeId")
    private Employee employee;

    private String documentText;

    private String resolutionText;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "depId")
    private Department department;

    @ManyToMany
    @JoinTable(name="docs_users",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="doc_id"))
            private List<User> users;

    @Enumerated(EnumType.STRING)
    private DocumentStatus documentStatus;

    @OneToMany(mappedBy = "document", fetch = FetchType.LAZY)
    private List<Image> images;

    private File otherFile;

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getOverDate() {
        return overDate;
    }

    public void setOverDate(Date overDate) {
        this.overDate = overDate;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public String getReestrNumber() {
        return reestrNumber;
    }

    public void setReestrNumber(String reestrNumber) {
        this.reestrNumber = reestrNumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getDocumentText() {
        return documentText;
    }

    public void setDocumentText(String documentText) {
        this.documentText = documentText;
    }

    public String getResolutionText() {
        return resolutionText;
    }

    public void setResolutionText(String resolutionText) {
        this.resolutionText = resolutionText;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public DocumentStatus getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(DocumentStatus documentStatus) {
        this.documentStatus = documentStatus;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public File getOtherFile() {
        return otherFile;
    }

    public void setOtherFile(File otherFile) {
        this.otherFile = otherFile;
    }
}
