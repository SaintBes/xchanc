package chanc.dao;

import chanc.domain.Image;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Repository
public class ImageDAOImpl implements ImageDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Image createImage(Image image) {
        sessionFactory.getCurrentSession().save(image);
        return (Image) sessionFactory.getCurrentSession().get(Image.class, image.getImageId());
    }

    @Override
    public Image readDociument(int imageId) {
        return (Image) sessionFactory.getCurrentSession().get(Image.class, imageId);
    }

    @Override
    public void uppdateImage(Image image) {
        sessionFactory.getCurrentSession().update(image);
    }

    @Override
    public void deleteImage(Image image) {
        sessionFactory.getCurrentSession().delete(image);
    }

    @Override
    public List<Image> findAllImages() {
        return sessionFactory.getCurrentSession().createCriteria(Image.class).list();
    }
}
