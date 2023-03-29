
package mx.album.FACADE;

import servicios.*;
import mx.album.dao.*;
import proyecto.album.*;

public abstract class CancionFACADE implements Servicios {
    CancionDAO cancionDao = new CancionDAO();
	
//	@Override
	public void agregarCancion(Cancion cancion) {
	cancionDao.agregarCancion(cancion);
	}

//	@Override
	public void actualizarCancion(Cancion cancion) {
	cancionDao.actualizarCancion(cancion);
	}

//	@Override
	public void mostrarCancion() {
	cancionDao.MostrarListaDeCanciones();
}

//	@Override
	public void eliminarCancion(Cancion cancion) {
	cancionDao.eliminarCancion(cancion);
}
}

