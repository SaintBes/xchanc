package chanc.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admssa on 02.02.2016.
 */
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cityId;

    private String cityName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "countryId", nullable = false)
    private Country country;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private List<Company> companyList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
    private List<Document> documents;

    public City() {

    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
