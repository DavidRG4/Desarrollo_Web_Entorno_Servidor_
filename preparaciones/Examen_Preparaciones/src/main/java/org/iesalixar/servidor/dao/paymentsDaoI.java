package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.model.payments;

public  interface paymentsDaoI {
	public List<payments> getAllPayments();

	public payments getPayments(int customerNumber, String checkNumber);

	public boolean removePayments(int customerNumber, String checkNumber);

	public boolean updatePayments(payments payment);

	public boolean insertPayments(payments payment);
}
