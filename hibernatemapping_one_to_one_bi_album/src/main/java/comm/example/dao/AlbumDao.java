package comm.example.dao;

import java.util.List;

import comm.example.entity.Album;

public interface AlbumDao {
	public Album createAlbum(Album album);
	public Album findById(Album album);
	public Album updateById(Album album);
	public Album deleteAlbum(Album album);
	public  List<Album> getAllAlbum();
	

}
