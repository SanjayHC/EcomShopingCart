package com.sanjay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.bean3.CategoryBean;
import com.sanjay.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategryController {
	
	@Autowired
	private CategoryService categoryservice;
	
	@PostMapping()
	public void addProduct(@RequestBody CategoryBean item) {
		categoryservice.addcategory(item);
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<CategoryBean> show() {	
		return categoryservice.getAllcategory();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update")
	public void update(@RequestBody CategoryBean item) {
		categoryservice.updatcategory(item);
	}
	
	/*when request comes for product/id particular product will be deleted*/
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deletecategory(@PathVariable Integer id) {
		categoryservice.deletecategory(id);
	}

}
