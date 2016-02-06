package chanc.service;


import chanc.dao.CountryDAO;
import chanc.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Service
@Transactional
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryDAO countryDAO;

    @Override
    public Country createCountry(Country country) {
        return countryDAO.createCountry(country);
    }

    @Override
    @Transactional(readOnly = true)
    public Country readCountry(int countryId) {
        return countryDAO.readCountry(countryId);
    }

    @Override
    public void uppdateCountry(Country country) {
        countryDAO.uppdateCountry(country);
    }

    @Override
    public void deleteCountry(Country country) {
        countryDAO.deleteCountry(country);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Country> findAllCountrys() {
        return countryDAO.findAllCountrys();
    }
}
