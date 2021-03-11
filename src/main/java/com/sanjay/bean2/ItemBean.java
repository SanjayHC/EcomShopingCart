package com.sanjay.bean2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

import com.sanjay.bean.Product;

@Entity
public class ItemBean {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long itemid;
	@NotBlank
	private int quantity;
	@NotBlank
	private double total;
	
	@ManyToMany(cascade=CascadeType.ALL) 
	private List<Product>product;
	
	
	public ItemBean() {
	
	}

	public ItemBean(Long item_id, @NotBlank int quantity, @NotBlank double total) {
		super();
		this.itemid = item_id;
		this.quantity = quantity;
		this.total = total;
	}
	
	
	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Long getItem_id() {
		return itemid;
	}

	public void setItem_id(Long item_id) {
		this.itemid = item_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ItemBean [item_id=" + itemid + ", quantity=" + quantity + ", total=" + total + "]";
	}

	
	
}
