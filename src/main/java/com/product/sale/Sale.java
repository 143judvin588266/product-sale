package com.product.sale;

	import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="sale_table")
	public class Sale {
	@Id
	private int id;
	@Column
	private int productId; 
	@Column
	private int quantity;
	@Column
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


