package com.sanjay.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.bean.Product;
import com.sanjay.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value ="/product")
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	/*when request comes for product a new product will be added*/
	@PostMapping()
	public void addProduct(@RequestBody Product product) {
		productservice.addProduct(product);
	}
	
	/*when request comes for product all product will be shown*/
	@RequestMapping(method = RequestMethod.GET)
	public List<Product> show(ModelMap modelmap) {	
		return productservice.getAllProducts();
	}
	
	/*when request comes for product/id particular product will be shown*/
	@RequestMapping(method =RequestMethod.GET, value ="/{id}")
	public Optional<Product> getProduct(@PathVariable int id) {
		return productservice.getproduct(id);
	}
	
	/*when request comes for product/id with put method particular product will be shown to update*/
	@RequestMapping(method = RequestMethod.PUT, value = "/update")
	public void update(@RequestBody Product p) {
		productservice.updateproduct(p);
	}
	
	/*when request comes for product/id particular product will be deleted*/
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteproduct(@PathVariable int id) {
		productservice.deleteproduct(id);
	}
	
	/*when request comes for product/price particular product with that price will be shown*/
	@RequestMapping(method = RequestMethod.GET, value = "/price")
	public List<Product> findbyprice(@RequestParam double price){
		return productservice.findbyprice(price);	
	}
	
	/*when request comes for product/name particular product with that name will be shown */
	@RequestMapping(method = RequestMethod.GET, value = "/name")
	public List<Product> findbypname(@RequestParam String name){
		return productservice.findbyname(name);
	}
	
	/*when request comes for product/sort that products will be sorted by the names*/
	@RequestMapping(method = RequestMethod.GET, value = "/sort")
	 public List<Product> getAllsortname()
	 {
		return productservice.getAllProductsort();
	 }
	
	/*when request comes for product/sort/id all the products will be sorted based on their id*/
	@RequestMapping(method = RequestMethod.GET, value = "/sort/id")
	 public List<Product> getAllsortid()
	 {
		return productservice.sortbyid();
	 }
	
	/*when request comes for product/sort/price all the product will be sorted based on their price*/
	@RequestMapping(method = RequestMethod.GET, value = "/sort/price")
	 public List<Product> getAllsortprice()
	 {
		return productservice.sortbyprice();
	 }
}
