
package Servicios;

import proyecto.album.Album;
import proyecto.album.Artista;
import proyecto.album.Cancion;
import proyecto.album.Grupo;

public interface Servicios {
    
    void agregarAlbum(Album album);
	void actualizarAlbum(Album album);
	void mostrarAlbum();
	void eliminarAlbum(Album album);
	
	void agregarArtista(Artista artista);
	void actualizarArtista(Artista artista);
	void mostrarArtista();
	void eliminarArtista(Artista artista);
	
	void agregarCancion(Cancion cancion);
	void actualizarCancion(Cancion cancion);
	void mostrarCancion();
	void eliminarCancion(Cancion cancion);
	
	void agregarGrupo(Grupo grupo);
	void actualizarGrupo(Grupo grupo);
	void mostrarGrupo();
	void eliminarGrupo(Grupo grupo);
}
