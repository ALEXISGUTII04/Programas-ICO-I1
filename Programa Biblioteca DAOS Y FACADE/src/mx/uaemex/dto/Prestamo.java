
package mx.uaemex.dto;

import java.util.Date;
import java.util.List;

public class Prestamo {
    
    private int id;
    private int folio;
    private Date fechaInicio;
    private Date fechaEntrega;
    private String status;
    private List<Libro> libros;
    private Persona persona;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", folio=" + folio + ", fechaInicio=" + fechaInicio + ", fechaEntrega=" + fechaEntrega + ", status=" + status + ", libros=" + libros + ", persona=" + persona + '}';
    }
    
    
}
