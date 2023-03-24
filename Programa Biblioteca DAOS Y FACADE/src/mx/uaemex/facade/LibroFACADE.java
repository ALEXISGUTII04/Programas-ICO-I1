
package mx.uaemex.facade;

import mx.uaemex.dto.dao.*;
import mx.uaemex.dto.*;


public class LibroFACADE {
    LibroDAO libroDao= new LibroDAO();
	
	public void agregarLibro(Libro libro) {
		libroDao.AgregarLibro(libro);
	}
	
	public void leerLibro() {
		libroDao.MostrarLista();
	}
	
	public void actualizarLibro(Libro libro) {
		libroDao.ActualizarLibro(libro);
	}
	public void eliminarLibro(Libro libro) {
		libroDao.EliminarLibro(libro);
	}
}

