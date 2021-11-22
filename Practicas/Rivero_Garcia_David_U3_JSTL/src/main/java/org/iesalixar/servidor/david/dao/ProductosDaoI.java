package org.iesalixar.servidor.david.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.david.model.Oficinas;
import org.iesalixar.servidor.david.model.Productos;

public interface ProductosDaoI {
	public ArrayList<Productos> getAllProducts();
	public Productos getProduct(String productCode);

}
