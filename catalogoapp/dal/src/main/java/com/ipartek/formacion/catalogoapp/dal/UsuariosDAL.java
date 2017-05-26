package com.ipartek.formacion.catalogoapp.dal;

import com.ipartek.formacion.catalogoapp.tipos.Usuario;

public interface UsuariosDAL {
	public void alta(Usuario usuario);// para dar de alta al usuario.Creas una variable llamara usuario de la Clase Usuario.

	public boolean validar(Usuario usuario);// para validar un usuario existente.

	// lo a�adido:
	public void modificar(Usuario usuario);// para modificar un usuario existente.

	public void borrar(Usuario usuario);// para borrar un usuario existente.

	public Usuario buscarPorId(String id);// para buscar por Id un usuario existente.

	public Usuario[] buscarTodosLosUsuarios();// para todoslos usuarios existentes.

}
