package org.iesalixar.servidor.hibernate.Dao;

import org.iesalixar.servidor.hibernate.Utils.GenericDAO;
import org.iesalixar.servidor.hibernate.model.Product;

public interface ProductDAOI extends GenericDAO<Product> {

	public Product searchByBarCode(final String barCode);
}
