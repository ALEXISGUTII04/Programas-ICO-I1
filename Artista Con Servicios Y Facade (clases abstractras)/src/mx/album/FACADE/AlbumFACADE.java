
package mx.album.FACADE;

import servicios.*;
import mx.album.dao.*;
import proyecto.album.*;

public abstract class AlbumFACADE implements Servicios {
    AlbumDAO albumDao= new AlbumDAO();
	
//	@Override
	public void agregarAlbum(Album album) {
		albumDao.agregarAlbum(album);
	}
	
//	@Override
		public void actualizarAlbum(Album album) {
		albumDao.actualizarAlbum(album);
	}
	
//	@Override
		public void mostrarAlbum() {
		albumDao.MostrarListaDeAlbums();
	}
	
//	@Override
		public void eliminarAlbum(Album album) {
		albumDao.eliminarAlbum(album);
	}
}

