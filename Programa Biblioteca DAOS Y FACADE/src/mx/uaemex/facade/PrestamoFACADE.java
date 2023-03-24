
package mx.uaemex.facade;

import mx.uaemex.dto.dao.*;
import mx.uaemex.dto.*;


public class PrestamoFACADE {
    PrestamoDAO prestamoDao= new PrestamoDAO();
	
	public void agregarPrestamo(Prestamo prestamo) {
		prestamoDao.AgregarPrestamo(prestamo);
	}
	
	public void leerPrestamo() {
		prestamoDao.MostrarLista();
		
	}
	
	public void actualizarPrestamo(Prestamo prestamo) {
		prestamoDao.ActualizarPrestamos(prestamo);
	}
	public void eliminarPrestamo(Prestamo prestamo) {
		prestamoDao.EliminarPrestamo(prestamo);
	}
}


