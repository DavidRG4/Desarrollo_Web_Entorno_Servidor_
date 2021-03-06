package org.iesalixar.servidor.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.hibernate.Dao.ProductDAOI;
import org.iesalixar.servidor.hibernate.Dao.ProductDAOImpl;
import org.iesalixar.servidor.hibernate.model.Product;

public class ProductServiceImpl implements ProductService{

	// El servicio encapsulará el uso del DAO
	// y añadirá la lógica de negocio
	private ProductDAOI productDao;

	public ProductServiceImpl(final Session session) {

		this.productDao = new ProductDAOImpl(session);
	}

	@Override
	public void insertNewProduct(final Product product) {

		// Compruebo que no es nulo y que aún no existe
		// es decir no tiene ID
		if (product != null && product.getId() == null) {
			// Inserción del producto
			productDao.insert(product);
		}

	}

	@Override
	public void updateProduct(final Product product) {

		// Compruebo que no es nulo y que ya existe (tiene ID)
		if (product != null && product.getId() != null) {

			// Actualizo el producto
			productDao.update(product);
		}

	}

	@Override
	public void deleteProduct(final Product product) {

		// Compruebo que no es nulo y que ya existe (tiene ID)
		if (product != null && product.getId() != null) {

			// Actualizo el producto
			productDao.delete(product);
		}

	}

	@Override
	public Product searchById(final Long productId) {
		
		Product product = null;

		if (productId != null) {

			product = productDao.searchById(productId);
		}

		return product;
	}

	@Override
	public List<Product> searchAll() {
		
		List<Product> productList = new ArrayList<Product>();

		productList = productDao.searchAll();

		return productList;
	}
	

	@Override
	public Product searchProductByBarCode(final String barCode) {
		
		Product product = null;

		if (barCode != null) {
			
			product = productDao.searchByBarCode(barCode);
		}

		return product;
	}
}
