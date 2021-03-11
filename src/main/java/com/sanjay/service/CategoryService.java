package com.sanjay.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjay.Dao.CategoryRepository;

import com.sanjay.bean3.CategoryBean;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryrepository;

	public List<CategoryBean> getAllcategory() {
		List<CategoryBean> bean = new ArrayList<CategoryBean>();
		categoryrepository.findAll()
		.forEach(bean::add);
		return bean;
	}

	public void addcategory(CategoryBean item) {
		categoryrepository.save(item);
	}

	public void deletecategory(Integer id) {
		categoryrepository.deleteById(id);
	}

	public void updatcategory(CategoryBean p) {
		categoryrepository.save(p);
	}
}