package com.sanjay.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.bean2.ItemBean;
import com.sanjay.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemservice;
	
	@PostMapping()
	public void addProduct(@RequestBody ItemBean item) {
		itemservice.addItem(item);
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ItemBean> show() {	
		return itemservice.getAllItems();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update")
	public void update(@RequestBody ItemBean item) {
	itemservice.updateitem(item);
	}
	
	/*when request comes for product/id particular product will be deleted*/
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteproduct(@PathVariable Long id) {
		itemservice.deleteitem(id);
	}
	
}
