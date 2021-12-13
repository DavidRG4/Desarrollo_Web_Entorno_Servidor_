package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.model.customers;

public interface customersDaoI {
	public List<customers> getAllCustomers();
	public customers getCustomers(int customerNumber,String customerName);
	public boolean removeCustomers(int customerNumber,String customerName);
	public boolean updateCustomers(customers customers);
	public boolean insertCustomers(customers customers);
}
