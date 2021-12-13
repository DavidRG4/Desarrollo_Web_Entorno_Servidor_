package org.iesalixar.servidor.model;

public class ordersDetail {
	private products product;
	private int quantityOrdered;
	private double priceEach;
	private int orderLineNumber;

	public ordersDetail() {
		// TODO Auto-generated constructor stub
	}
	


	public ordersDetail(products product, int quantityOrdered, double priceEach, int orderLineNumber) {
		super();
		this.product = product;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}



	public products getProduct() {
		return product;
	}



	public void setProduct(products product) {
		this.product = product;
	}



	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public int getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
}
