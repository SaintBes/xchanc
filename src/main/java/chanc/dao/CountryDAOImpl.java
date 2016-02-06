package chanc.dao;

import chanc.domain.Country;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Repository
public class CountryDAOImpl implements CountryDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Country createCountry(Country country) {
        sessionFactory.getCurrentSession().save(country);
        return (Country) sessionFactory.getCurrentSession().get(Country.class, country.getCountryId());
    }

    @Override
    public Country readDociument(int countryId) {
        return (Country) sessionFactory.getCurrentSession().get(Country.class, countryId);
    }

    @Override
    public void uppdateCountry(Country country) {
        sessionFactory.getCurrentSession().update(country);
    }

    @Override
    public void deleteCountry(Country country) {
        sessionFactory.getCurrentSession().delete(country);
    }

    @Override
    public List<Country> findAllCountrys() {
        return sessionFactory.getCurrentSession().createCriteria(Country.class).list();
    }
}