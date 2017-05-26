package com.ipartek.formacion.catalogoapp.dal;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.formacion.catalogoapp.tipos.Productos1;

public class ProductosDALColeccion implements ProductosDal {// DalColeccion esta obligado a hacer la funciones de ProductosDal.

	// crear la coleccion (bolsa grande para meter varios productos)llamada productosColeccion:
	private Map<String, Productos1> productosColeccion = new HashMap<String, Productos1>();

	public void alta(Productos1 conjunto) {
		if (productosColeccion.containsKey(conjunto.getId()))// si en la coleccion"productosColeccion" del conjunto de metodos de "productosDal" el Id que me pones ya esixte:
			throw new ProductosYAExistenteDALException("El producto ya existe." + conjunto.getId());// sale este mensaje.
		// me falta esto de hacer.
		productosColeccion.put(conjunto.getId(), conjunto);// Indice: para el id(clave) de producto que me has metido y te doy toda la informacion.
	}

	public void modificar(Productos1 conjunto) {
		productosColeccion.put(conjunto.getId(), conjunto);

	}

	public void baja(Productos1 conjunto) {
		//
		productosColeccion.remove(conjunto.getId());
	}

	public Productos1 buscarPorId(String id) {

		return productosColeccion.get(id);
	}

	public Productos1[] buscarTodos() {
		// que todos los productos los meta en un array:
		return productosColeccion.values().toArray(new Productos1[productosColeccion.size()]);// y te mide lo que ocupa procutosColeccion.

	}
}
