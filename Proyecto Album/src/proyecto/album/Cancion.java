
package proyecto.album;

import java.util.List;

public class Cancion {
    
    private int id;
    private String nombre;
    private int FechaLanzamiento;
    private String compositor;
    private String genero;
    List<Persona> persona;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento() {
        return FechaLanzamiento;
    }

    public void setFechaLanzamiento(int FechaLanzamiento) {
        this.FechaLanzamiento = FechaLanzamiento;
    }

    

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Cancion{" + "id=" + id + ", nombre=" + nombre + ", FcehaLanzamiento=" + FechaLanzamiento + ", compositor=" + compositor + ", genero=" + genero + ", persona=" + persona + '}';
    }
    
    
            
    
}
