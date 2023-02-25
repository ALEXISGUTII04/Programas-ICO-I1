
package proyecto.album;

import java.util.List;

public class Album  {
    
    private int id;
    private String nombre;
    private List<Cancion> Canciones;
    private String cancion;
    private int FechaLanzamiento;

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

    public List<Cancion> getCanciones() {
        return Canciones;
    }

    public void setCanciones(List<Cancion> Canciones) {
        this.Canciones = Canciones;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public int getFechaLanzamiento() {
        return FechaLanzamiento;
    }

    public void setFechaLanzamiento(int FechaLanzamiento) {
        this.FechaLanzamiento = FechaLanzamiento;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", nombre=" + nombre + ", Canciones=" + Canciones + ", cancion=" + cancion + ", FechaLanzamiento=" + FechaLanzamiento + '}';
    }
    
}

    
    