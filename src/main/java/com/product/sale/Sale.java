package com.product.sale;

	import java.util.Date;

	public class Sale {
	private int id;
	private int productId; 
	private int quantity;
	private Date saleDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	Sale(){
		
	}
	public Sale(int id, int productId, int quantity, Date saleDate) {
		super();
		this.id = id;
		this.productId = productId;
		this.quantity = quantity;
		this.saleDate = saleDate;
	}
	

	}


