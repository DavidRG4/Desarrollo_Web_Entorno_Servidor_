package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.model.orders;

public interface ordersDaoI {
	public List<orders> getAllOrders();

	public orders getOrders(int orderNumber);

	public boolean removeOrders(int orderNumber);

	public boolean updateOrders(orders orders);

	public boolean insertOrders(orders orders);
}
