package chanc.dao;

import chanc.domain.City;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Repository
public class CityDAOImpl implements CityDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public City createCity(City city) {
        sessionFactory.getCurrentSession().save(city);
        return (City) sessionFactory.getCurrentSession().get(City.class, city.getCityId());
    }

    @Override
    public City readDociument(int cityId) {
        return (City) sessionFactory.getCurrentSession().get(City.class, cityId);
    }

    @Override
    public void uppdateCity(City city) {
        sessionFactory.getCurrentSession().update(city);
    }

    @Override
    public void deleteCity(City city) {
        sessionFactory.getCurrentSession().delete(city);
    }

    @Override
    public List<City> findAllCitys() {
        return sessionFactory.getCurrentSession().createCriteria(City.class).list();
    }
}
