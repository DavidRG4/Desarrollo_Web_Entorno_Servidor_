package org.iesalixar.servidor.hibernate.Dao;

import org.hibernate.Session;
import org.iesalixar.servidor.hibernate.Utils.GenericDAOImpl;
import org.iesalixar.servidor.hibernate.model.Order;

public class OrderDAOImpl extends GenericDAOImpl<Order> implements OrderDAOI {

	private Session session;
	
	public OrderDAOImpl(Session session) {
		super(session);
		this.session = session;
	}
}
