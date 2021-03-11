package com.sanjay.bean3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class CategoryBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;
	@NotBlank
	private String categoryName;
	
	public CategoryBean() {
	}

	public CategoryBean(Integer categoryid, String categoryname) {
		super();
		this.categoryId = categoryid;
		this.categoryName = categoryname;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryid) {
		this.categoryId = categoryid;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryname) {
		this.categoryName = categoryname;
	}

	@Override
	public String toString() {
		return "CategoryBean [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
	

}
