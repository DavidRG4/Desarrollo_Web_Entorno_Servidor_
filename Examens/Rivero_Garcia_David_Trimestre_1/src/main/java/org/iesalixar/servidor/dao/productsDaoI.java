package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.model.products;

public interface productsDaoI {
	public List<products> getAllProducts();

	public List<products>  getProducts(String productLines);

}
