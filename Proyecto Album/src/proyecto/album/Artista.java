
package proyecto.album;

public class Artista extends Persona {
    
    private int id;
    private String NombreArtistico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreArtistico() {
        return NombreArtistico;
    }

    public void setNombreArtistico(String NombreArtistico) {
        this.NombreArtistico = NombreArtistico;
    }

    @Override
    public String toString() {
        return "Artista{" + "id=" + id + ", NombreArtistico=" + NombreArtistico + '}';
    }
    
    
    
}
