package com.sanjay.bean;

import javax.persistence.GeneratedValue;

import javax.validation.constraints.NotBlank;

import com.sanjay.bean3.CategoryBean;

import java.util.List;

import javax.persistence.*;

@Entity
public class Product {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int productid;
	@NotBlank
	private String name;
	@NotBlank
	private String colour;
	@NotBlank
	private String size;
	@NotBlank
	private double price;
	@ManyToMany
	private List<CategoryBean> category;
	public Product() {
		
	}
	
	public Product(int id, String name,String colour,String size,double price) {
		super();
		this.productid = id;
		this.name = name;
		this.colour = colour;
		this.size = size;
		this.price = price;
	}
	
	public List<CategoryBean> getCategory() {
		return category;
	}

	public void setCategory(List<CategoryBean> category) {
		this.category = category;
	}

	public int getProduct_id() {
		return productid;
	}

	public void setProduct_id(int id) {
		this.productid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + productid + ", name=" + name + ", colour=" + colour
				+ ", size=" + size + ", price=" + price + "]";
	}

	


}
