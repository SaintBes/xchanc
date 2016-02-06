package chanc.dao;

import chanc.domain.Country;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
public interface CountryDAO {

    Country createCountry(Country country);
    Country readDociument(int countryId);
    void uppdateCountry(Country country);
    void deleteCountry(Country country);
    List<Country> findAllCountrys();
}
