package com.ipartek.formacion.catalogoapp.dal;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.formacion.catalogoapp.tipos.Usuario;

public class UsuariosDALColeccion implements UsuariosDAL {// TE COLOCAS EN USUARIOSDAL COLECCION Y LE DA IMPLEMENTAR METODOS.

	private Map<String, Usuario> usuarios = new HashMap<String, Usuario>();// usuarios es una coleccion:crear una lista grande para meter varios usuarios.

	public void alta(Usuario usuario) {
		if (usuarios.containsKey(usuario.getNombre()))// si el usuario que me ha dado ya exite
			throw new UsuarioYaExistenteDALException("Ya existe el usuario " + usuario.getNombre());// te sale este excepcion.

		usuarios.put(usuario.getNombre(), usuario);// Indice: para el usuario que me has pasado he cogido el get nombre que es la clave y te doy todo los datos.
	}

	public boolean validar(Usuario usuario) {
		return usuarios.containsValue(usuario);
	}

	public void modificar(Usuario usuario) {
		if (!usuarios.containsKey(usuario.getNombre()))
			throw new DALException("Intento de modificar usuario no existente " + usuario);

		usuarios.put(usuario.getNombre(), usuario);//
	}

	public void borrar(Usuario usuario) {
		usuarios.remove(usuario.getNombre());
	}

	public Usuario buscarPorId(String id) {
		return usuarios.get(id);
	}

	public Usuario[] buscarTodosLosUsuarios() {

		return usuarios.values().toArray(new Usuario[usuarios.size()]);// coge todos los usuarios (values)y los valores los mete en un array.
		// usuarios.size: te dice cuantos usuarios hay y te los mete en un array de ese tama�o.
		// te va al indice "usuarios"y te los mete en un array.
	}

}
