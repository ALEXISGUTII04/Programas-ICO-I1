
package mx.album.FACADE;

import servicios.*;
import mx.album.dao.*;
import proyecto.album.*;

public  abstract class ArtistaFACADE implements Servicios {
    ArtistaDAO artistaDao = new ArtistaDAO();
	
//	@Override
	public void agregarArtista(Artista artista) {
	artistaDao.agregarArtista(artista);
}

//	@Override
	public void actualizarArtista(Artista artista) {
	artistaDao.actualizarArtista(artista);
}

//	@Override
	public void mostrarArtista() {
	artistaDao.MostrarListaDeArtistas();
}

//	@Override
	public void eliminarArtista(Artista artista) {
	artistaDao.eliminarArtista(artista);
}
}

