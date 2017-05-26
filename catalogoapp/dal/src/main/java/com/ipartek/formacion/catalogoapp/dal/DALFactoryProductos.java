package com.ipartek.formacion.catalogoapp.dal;


public class DALFactoryProductos {

	public static ProductosDal getProductosDAL() {//

		return new ProductosDALColeccion();
	}

}// DALFactory.
