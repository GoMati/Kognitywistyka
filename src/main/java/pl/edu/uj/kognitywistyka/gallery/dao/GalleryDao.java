package pl.edu.uj.kognitywistyka.gallery.dao;

import java.util.List;

import pl.edu.uj.kognitywistyka.gallery.model.Gallery;

public interface GalleryDao {
	Gallery getGallery(long galleryID);

	List<Gallery> findAllGalleries();

}
