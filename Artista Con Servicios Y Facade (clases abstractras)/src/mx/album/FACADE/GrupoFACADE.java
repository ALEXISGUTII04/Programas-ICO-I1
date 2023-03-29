
package mx.album.FACADE;

import servicios.*;
import mx.album.dao.*;
import proyecto.album.*;

public abstract class GrupoFACADE implements Servicios {
    GrupoDAO grupoDao= new GrupoDAO();
	
//	@Override
	public void agregarGrupo(Grupo grupo) {
	grupoDao.agregarGrupo(grupo);
	}
	
//	@Override
		public void actualizarGrupo(Grupo grupo) {
	grupoDao.actualizarGrupo(grupo);
	}
	
//	@Override
		public void mostrarGrupo() {
	grupoDao.MostrarListaDeGrupos();
	}
	
//	@Override
		public void eliminarGrupo(Grupo grupo) {
	grupoDao.eliminarGrupo(grupo);
	}
}

