package comm.example.service;

import java.util.List;

import comm.example.entity.Album;

public interface AlbumService {
	public Album updateAlbum(Album album);
	public Album  deleteAlbum(Integer id);
	public List<Album> getAllAlbums;
	

}
