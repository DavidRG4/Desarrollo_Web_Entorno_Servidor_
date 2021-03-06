package org.iesalixar.servidor.hibernate.service;

import java.util.List;

import org.iesalixar.servidor.hibernate.model.Order;

public interface OrderService {

	public void insertNewOrder(final Order order);

	public void updateOrder(final Order order);

	public void deleteOrder(final Order order);

	public Order searchById(final Long orderId);

	public List<Order> searchAll();

}
