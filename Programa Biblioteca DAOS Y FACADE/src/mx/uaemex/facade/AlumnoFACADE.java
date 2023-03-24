
package mx.uaemex.facade;

import mx.uaemex.dto.dao.*;
import mx.uaemex.dto.*;

public class AlumnoFACADE {
    AlumnoDAO alumnoDao= new AlumnoDAO();
	
	public void agregarAlumno(Alumno alumno) {
		alumnoDao.agregarAlumno(alumno);
	}
	
	public void leerAlumno(){
		alumnoDao.MostrarListaDeALumnos();
		
	} 
	
	public void actualizarAlumno(Alumno alumno) {
		alumnoDao.actualizarAlumno(alumno);
	}
	
	public void eliminarAlumno(Alumno alumno) {
		alumnoDao.eliminarAlumno(alumno);
	}
	
	
}

