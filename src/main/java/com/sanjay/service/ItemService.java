package com.sanjay.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjay.Dao.ItemRepository;
import com.sanjay.bean2.ItemBean;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemrepository;
	@Autowired
	private ProductService productservice;
	
	public List<ItemBean> getAllItems() {
		List<ItemBean> bean = new ArrayList<ItemBean>();
		itemrepository.findAll()
		.forEach(bean::add);
		productservice.getAllProducts();
		return bean;
	}
	
	public void addItem(ItemBean item) {
		itemrepository.save(item);
	}
	
	public void deleteitem(Long id) {
		itemrepository.deleteById(id);  
	}
	public void updateitem(ItemBean p) {
		itemrepository.save(p);
	}
}
