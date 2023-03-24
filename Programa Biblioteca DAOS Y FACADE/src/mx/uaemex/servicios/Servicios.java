
package mx.uaemex.servicios;

import mx.uaemex.dto.*;
import mx.uaemex.facade.*;

public class Servicios {
    AlumnoFACADE alumnoServicio= new AlumnoFACADE();
	LibroFACADE libroServicio= new LibroFACADE();
	ProfesorFACADE profesorServicio= new ProfesorFACADE();
	PrestamoFACADE prestamoServicio= new PrestamoFACADE();
	
	
	public void agregarAlumno(Alumno alumno) {
		alumnoServicio.agregarAlumno(alumno);
	}
	public void mostrarAlumno() {
		alumnoServicio.leerAlumno();
	}
	public void actualizarAlumno(Alumno alumno) {
		alumnoServicio.actualizarAlumno(alumno);
	}
	public void eliminarAlumno(Alumno alumno) {
		alumnoServicio.eliminarAlumno(alumno);
	}
	
	
	public void agregarProfesor(Profesor profesor) {
		profesorServicio.agregarProfesor(profesor);
	}
	public void mostrarProfesor() {
		profesorServicio.leerProfesor();
	}
	public void actualizarProfesor(Profesor profesor) {
		profesorServicio.actualizarProfesor(profesor);
	}
	public void eliminarProfesor(Profesor profesor) {
		profesorServicio.eliminarProfesor(profesor);
	}
	
	
	public void agregarLibro(Libro libro) {
		libroServicio.agregarLibro(libro);
	}
	public void mostrarLibro() {
		libroServicio.leerLibro();
	}
	public void actualizarLibro(Libro libro) {
		libroServicio.actualizarLibro(libro);
	}
	public void eliminarLibro(Libro libro) {
		libroServicio.eliminarLibro(libro);
	}
	
	
	
	public void agregarPrestamo(Prestamo prestamo) {
		prestamoServicio.agregarPrestamo(prestamo);
	}
	public void mostrarPrestamo() {
		prestamoServicio.leerPrestamo();
	}
	public void actualizarPrestamo(Prestamo prestamo) {
		prestamoServicio.actualizarPrestamo(prestamo);
	}
	public void eliminarPrestamo(Prestamo prestamo) {
		prestamoServicio.eliminarPrestamo(prestamo);
	}
}

