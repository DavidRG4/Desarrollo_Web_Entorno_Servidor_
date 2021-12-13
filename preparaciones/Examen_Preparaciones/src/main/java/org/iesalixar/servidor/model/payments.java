package org.iesalixar.servidor.model;

public class payments {

	private int customerNumber;
	private String checkNumber;
	private String date;
	private Double amount;

	public payments() {
		// TODO Auto-generated constructor stub
	}

	public payments(int customerNumber, String checkNumber, String date, Double amount) {
		super();
		this.customerNumber = customerNumber;
		this.checkNumber = checkNumber;
		this.date = date;
		this.amount = amount;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}