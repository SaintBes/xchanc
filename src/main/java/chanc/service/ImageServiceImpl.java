package chanc.service;

import chanc.dao.ImageDAO;
import chanc.domain.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Service
@Transactional
public class ImageServiceImpl implements ImageService {

    @Autowired
    ImageDAO imageDAO;

    @Override
    public Image createImage(Image image) {
        return imageDAO.createImage(image);
    }

    @Override
    @Transactional(readOnly = true)
    public Image readImage(int imageId) {
        return imageDAO.readImage(imageId);
    }

    @Override
    public void uppdateImage(Image image) {
        imageDAO.uppdateImage(image);
    }

    @Override
    public void deleteImage(Image image) {
        imageDAO.deleteImage(image);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Image> findAllImages() {
        return imageDAO.findAllImages();
    }
}
