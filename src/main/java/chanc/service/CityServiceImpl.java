package chanc.service;

import chanc.dao.CityDAO;
import chanc.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Service
@Transactional
public class CityServiceImpl implements CityService {

    @Autowired
    CityDAO cityDAO;

    @Override
    public City createCity(City city) {
        return cityDAO.createCity(city);
    }

    @Override
    @Transactional(readOnly = true)
    public City readCity(int cityId) {
        return cityDAO.readCity(cityId);
    }

    @Override
    public void uppdateCity(City city) {
        cityDAO.uppdateCity(city);
    }

    @Override
    public void deleteCity(City city) {
        cityDAO.deleteCity(city);
    }

    @Override
    @Transactional(readOnly = true)
    public List<City> findAllCitys() {
        return cityDAO.findAllCitys();
    }
}
