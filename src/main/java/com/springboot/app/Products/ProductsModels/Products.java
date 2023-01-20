package com.springboot.app.Products.ProductsModels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_quality")
	private String productQuality;
	
	@Column(name="product_made_in")
	private String productMadeIn;
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int id, String productName, String productQuality, String productMadeIn) {
		super();
		this.id = id;
		this.productName = productName;
		this.productQuality = productQuality;
		this.productMadeIn = productMadeIn;
	}

	public Products(String productName, String productQuality, String productMadeIn) {
		super();
		this.productName = productName;
		this.productQuality = productQuality;
		this.productMadeIn = productMadeIn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQuality() {
		return productQuality;
	}

	public void setProductQuality(String productQuality) {
		this.productQuality = productQuality;
	}

	public String getProductMadeIn() {
		return productMadeIn;
	}

	public void setProductMadeIn(String productMadeIn) {
		this.productMadeIn = productMadeIn;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ Product ID : "+this.id+" ] [ Product Name : "+this.productName+" ] [ Product Quality : "+this.productQuality+" ] [ Product Made In : "+this.productMadeIn+" ]";
	}
	
}
