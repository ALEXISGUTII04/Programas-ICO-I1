
package mx.uaemex.dto.test;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.uaemex.Servicios.*;
import mx.uaemex.dto.*;

public class TestPrestamo {
    
    public static void main(String []args) {
                Alumno alumno1 = new Alumno();		
		alumno1.setId(1);
		alumno1.setNombre("Raul");		
		alumno1.setApellidoPaterno("Jimenez");
		alumno1.setApellidoMaterno("Perez");
		alumno1.setNumerodeCuenta(20227102);
		
		Libro Libro1 = new Libro();
		Libro1.setId(1);
		Libro1.setNombre("Calculo");
		Libro1.setCategoria("Matematicas");
		Libro1.setEditorial("Alfaomega");
		Libro1.setIsbn(344);
		Libro1.setStock(2);
		
		Libro Libro2 = new Libro();
		Libro2.setId(1);
		Libro2.setNombre("Fundamentos de Programacion");
		Libro2.setCategoria("Programacion");
		Libro2.setEditorial("Alfaomega");
		Libro2.setIsbn(2324);
		Libro2.setStock(5);
		
		List<Libro> listalibros=new ArrayList<>();
		listalibros.add(Libro1);
		listalibros.add(Libro2);
		
		Prestamo prestamo1= new Prestamo();
		Date fechaInt= new Date();
		prestamo1.setId(1);
		prestamo1.setFolio(345);
		prestamo1.setFechaInicio(fechaInt);
		prestamo1.setLibros(listalibros);
		prestamo1.setPersona(alumno1);

		System.out.println(prestamo1);
                
                System.out.println ("\t");
                
//                Nuevo Prestamo
                
                Alumno alumno2 = new Alumno();		
		alumno2.setId(1);
		alumno2.setNombre("Max");		
		alumno2.setApellidoPaterno("Verstappen");
		alumno2.setApellidoMaterno("Landa");
		alumno2.setNumerodeCuenta(1189756);
		
		Libro Libro3 = new Libro();
		Libro3.setId(2);
		Libro3.setNombre("Formula 1");
		Libro3.setCategoria("Automovilismo");
		Libro3.setEditorial("Fox Sports");
		Libro3.setIsbn(2007);
		Libro3.setStock(4);
		
		Libro Libro4 = new Libro();
		Libro4.setId(3);
		Libro4.setNombre("Historia del automovilismo");
		Libro4.setCategoria("Automovilismo");
		Libro4.setEditorial("DAZN SPAIN");
		Libro4.setIsbn(9867);
		Libro4.setStock(9);
		
		List<Libro> listadlibros=new ArrayList<>();
		listadlibros.add(Libro3);
		listadlibros.add(Libro4);
		
		Prestamo prestamo2 = new Prestamo();
		Date fechadInt= new Date();
		prestamo2.setId(2);
		prestamo2.setFolio(516);
		prestamo2.setFechaInicio(fechadInt);
		prestamo2.setLibros(listadlibros);
		prestamo2.setPersona(alumno2);

		System.out.println(prestamo2);
                               
//                Nuevo Prestamo
                
                Alumno alumno3 = new Alumno();		
		alumno3.setId(1);
		alumno3.setNombre("David");		
		alumno3.setApellidoPaterno("Treviño");
		alumno3.setApellidoMaterno("Gonzalez");
		alumno3.setNumerodeCuenta(2290817);
		
		Libro Libro5 = new Libro();
		Libro5.setId(3);
		Libro5.setNombre("Historia Universal");
		Libro5.setCategoria("Historia");
		Libro5.setEditorial("Almuzara");
		Libro5.setIsbn(2005);
		Libro5.setStock(12);
		
		Libro Libro6 = new Libro();
		Libro6.setId(3);
		Libro6.setNombre("Enfermeria");
		Libro6.setCategoria("Medicina");
		Libro6.setEditorial("Biblos");
		Libro6.setIsbn(2345);
		Libro6.setStock(7);
		
		List<Libro> listadelibros=new ArrayList<>();
		listadelibros.add(Libro5);
		listadelibros.add(Libro6);
		
		Prestamo prestamo3 = new Prestamo();
		Date fechadeInt= new Date();
		prestamo3.setId(3);
		prestamo3.setFolio(190);
		prestamo3.setFechaInicio(fechadeInt);
		prestamo3.setLibros(listadelibros);
		prestamo3.setPersona(alumno3);

		System.out.println(prestamo3);
                
//                Nuevo Prestamo
                
                Alumno alumno4 = new Alumno();		
		alumno4.setId(4);
		alumno4.setNombre("Andrea");		
		alumno4.setApellidoPaterno("Vazquez");
		alumno4.setApellidoMaterno("Arellano");
		alumno4.setNumerodeCuenta(278381);
		
		Libro Libro7 = new Libro();
		Libro7.setId(4);
		Libro7.setNombre("Latidos que no dije");
		Libro7.setCategoria("Amor");
		Libro7.setEditorial("Aguilar");
		Libro7.setIsbn(2016);
		Libro7.setStock(9);
		
		Libro Libro8 = new Libro();
		Libro8.setId(3);
		Libro8.setNombre("El espia que surgio del frio");
		Libro8.setCategoria("Suspenso");
		Libro8.setEditorial("Alba");
		Libro8.setIsbn(6573);
		Libro8.setStock(23);
		
		List<Libro> listadealibros=new ArrayList<>();
		listadealibros.add(Libro7);
		listadealibros.add(Libro8);
		
		Prestamo prestamo4 = new Prestamo();
		Date fechadeaInt= new Date();
		prestamo4.setId(4);
		prestamo4.setFolio(870);
		prestamo4.setFechaInicio(fechadeaInt);
		prestamo4.setLibros(listadealibros);
		prestamo4.setPersona(alumno4);

		System.out.println(prestamo4);
}
}
