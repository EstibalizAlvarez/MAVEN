package com.ipartek.formacion.catalogoapp.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.ipartek.formacion.catalogoapp.dal.DALFactory;
import com.ipartek.formacion.catalogoapp.dal.DALFactoryProductos;
import com.ipartek.formacion.catalogoapp.dal.ProductosDal;
import com.ipartek.formacion.catalogoapp.dal.UsuariosDAL;
import com.ipartek.formacion.catalogoapp.tipos.Productos1;
import com.ipartek.formacion.catalogoapp.tipos.Usuario;

@WebListener
public class ArranqueAplicacion implements ServletContextListener {

	public void contextInitialized(ServletContextEvent arg0) {
		// cuando arranque la aplicacion que salga el siguiente mensaje:
		System.out.println("ARRANQUE DE APLICACION");
		// crear la bolsa comun.
		ServletContext application = arg0.getServletContext();
		// esto es para productos:
		ProductosDal accionesProductos = DALFactoryProductos.getProductosDAL();// cambiame todos los datos de ProductosDAL y guardamelo en acciones.
		accionesProductos.alta(new Productos1("1", "Boligrafo", "Utensilio para escribir", 25));// dando de alta un producto. de la clase Productos1 siguiendo el constructor.
		accionesProductos.alta(new Productos1("2", "Mesa", "Moviliario para la cocina", 250));// el precio es un int(numero)nunca va entre comillas.

		application.setAttribute("accionesProductos", accionesProductos);// tarjeta de visita. Que siempre sea el mismo bibliotecario.
		// esto es para usuarios:
		UsuariosDAL dalUsuarios = DALFactory.getUsuariosDAL();//

		dalUsuarios.alta(new Usuario("usuario1", "pass1"));// dar de alta a un usuario. con el nombre "usuario1" y contrase�a "pass1"
		dalUsuarios.alta(new Usuario("usuario2", "pass2"));//

		application.setAttribute("dalUsuarios", dalUsuarios);// tarjeta visita. siemptre al mismo.

	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

}
