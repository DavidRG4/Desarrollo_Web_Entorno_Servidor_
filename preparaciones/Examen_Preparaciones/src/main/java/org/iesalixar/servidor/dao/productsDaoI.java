package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.model.products;

public interface productsDaoI {
	public List<products> getAllProducts();

	public products getProducts(String productCode);

	public boolean removeProducts(String productCode);

	public boolean updateProducts(products products);

	public boolean insertProducts(products products);
}
