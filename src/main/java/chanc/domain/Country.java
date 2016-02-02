package chanc.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admssa on 02.02.2016.
 */
@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int countryId;

    private String countryName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private List<City> cityList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
    private List<Document> documents;

    public Country() {
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
