package chanc.service;

import chanc.domain.City;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
public interface CityService {

    City createCity(City city);
    City readCity(int cityId);
    void uppdateCity(City city);
    void deleteCity(City city);
    List<City> findAllCitys();
}
