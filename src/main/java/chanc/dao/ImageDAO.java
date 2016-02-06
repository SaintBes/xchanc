package chanc.dao;

import chanc.domain.Image;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
public interface ImageDAO {
    Image createImage(Image image);
    Image readDociument(int imageId);
    void uppdateImage(Image image);
    void deleteImage(Image image);
    List<Image> findAllImages();
}
