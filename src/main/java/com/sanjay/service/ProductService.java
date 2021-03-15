package com.sanjay.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.sanjay.Dao.ProductRepository;
import com.sanjay.bean.Product;



@Service
public class ProductService  {
	
	@Autowired
	private  ProductRepository productrepository;
	
	/*when request comes for product (get) findAll method will be called and all products will be shown*/
	public List<Product> getAllProducts() {
		List<Product> pro = new ArrayList<Product>();
		productrepository.findAll()
		.forEach(pro::add);
		return pro;	
	}

	/*when request comes for product (post) addProduct method will be called and a new product will be added*/
	public void addProduct(Product product) {
		 productrepository.save(product);
	}
	
	/*when request comes for product/id(get) getproduct method will be called and particular product will be shown*/
	public Optional<Product> getproduct(int id) {
	return productrepository.findById(id);
	}
	
	/*when request comes for product/id(get) deleteproduct method will be called and particular product will be deleted*/
	public void deleteproduct(int id) {
		productrepository.deleteById(id);  
	}

	/*when request comes for product/id with (put) updateproduct method will be called & particular product will be shown to update*/
	public void updateproduct(Product p) {
		productrepository.save(p);
	}
	
	/*when request comes for product/price this findbyprice method will be called & particular product with that price will be shown*/
	public List<Product> findbyprice(double price){
		return productrepository.findAllByPrice(price);
	}
	
	/*when request comes for product/name this findbyname method will be called & particular product with that name will be shown*/
	public List<Product> findbyname(String name){
		return productrepository.findAllByName(name);
	}
	
	/*when request comes for product/sort this getallproduct method will be called & all products will be sorted based on their name*/
	 public List<Product> getAllProductsort()
	    {
		 Sort sortOrder = Sort.by("name"); 
		 
		 List<Product> list = productrepository.findAll(sortOrder);
		return list;
	    }
	 
	/*when request comes for product/sort/id this sortbyid method will be called & all products will be sorted based on their id*/
	 public List<Product> sortbyid()
	    {
		 Sort sortOrder = Sort.by("productid"); 
		 
		 List<Product> list = productrepository.findAll(sortOrder);
		return list;
	    }
	 
		/*when request comes for product/sort/id this sortbyprice method will be called & all products will be sorted based on their price*/
	 public List<Product> sortbyprice()
	    {
		 Sort sortOrder = Sort.by("price"); 
		 
		 List<Product> list = productrepository.findAll(sortOrder);
		return list;
	    }
}
