
package mx.uaemex.facade;

import mx.uaemex.dto.dao.*;
import mx.uaemex.dto.*;

public class ProfesorFACADE {
    ProfesorDAO profesorDao= new ProfesorDAO();
	
	public void agregarProfesor(Profesor profesor) {
		profesorDao.AgregarProfesor(profesor);
	}
	
	public void leerProfesor() {
		profesorDao.MostrarLista();
	}
	
	public void actualizarProfesor(Profesor profesor) {
		profesorDao.ActualizarProfesor(profesor);
	}
	
	public void eliminarProfesor(Profesor profesor) {
		profesorDao.EliminarProfesor(profesor);
	}
}

