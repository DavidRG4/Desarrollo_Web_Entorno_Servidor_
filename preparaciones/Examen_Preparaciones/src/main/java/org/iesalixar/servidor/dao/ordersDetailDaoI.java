package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.model.ordersDetail;

public interface ordersDetailDaoI {
	public ArrayList<ordersDetail> getDetailsFromOrder(int orderNumber);

}
