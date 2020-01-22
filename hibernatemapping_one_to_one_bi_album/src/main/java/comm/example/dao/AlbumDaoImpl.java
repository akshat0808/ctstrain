package comm.example.dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Album;
import comm.example.entity.MyImage;

public class AlbumDaoImpl implements AlbumDao{
	

	@Override
	public Album createAlbum(Album album) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class)
				.addAnnotatedClass(MyImage.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		Album tempAlbum = null;

		try {

			Album tempAlbum1 = new Album("songs",LocalDate.now());

			MyImage myimg = new MyImage("https://www.google.com/search?q=image");

			tempAlbum1.setImage(myimg);

			session.beginTransaction();

			System.out.println("Saving the album: " + tempAlbum);
			session.save(tempAlbum);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
		
		return tempAlbum;
	}

	@Override
	public Album deleteAlbum(Album album) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Album findById(Album album) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Album updateById(Album album) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<Album> getAllAlbum() {
		// TODO Auto-generated method stub
		return null;
	}

}

	
