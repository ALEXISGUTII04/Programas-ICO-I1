
package proyecto.album.testalbum;

import java.util.List;
import java.util.ArrayList;
import proyecto.album.*;

public class TestAlbum {
    
    public static void main(String []args) {
        
        Persona Artista1 = new Persona ();
        Artista1.setNombreartista("Bruno Mars");
        Artista1.setNombre("Peter");
        Artista1.setApellidoPaterno("Gene");
        Artista1.setApellidoMaterno("Hernández");
        Artista1.setFechaNacimiento(1985);
        Artista1.setId(1);
        
        Cancion cancion1 = new Cancion ();
        cancion1.setCompositor("Bruno Mars");
        cancion1.setFechaLanzamiento(2012);
        cancion1.setGenero("Pop");
        cancion1.setNombre("Locked Out of Heaven");
        cancion1.setId(2);
                   
        Album album1 = new Album();
        album1.setId(1);
        album1.setNombre("24K Magic");
        album1.setFechaLanzamiento(2016);
        album1.setCancion("That's What I Like");
        
        List<Artista> listaArtistas = new ArrayList<>();
//        listaArtistas.add(Artista1);
                
        List<Cancion> listaCancion = new ArrayList<>();
        listaCancion.add(cancion1);
        
        System.out.println(Artista1);
        System.out.println (listaCancion);
        System.out.println (album1);
        
        
        
        
    }
    
}
