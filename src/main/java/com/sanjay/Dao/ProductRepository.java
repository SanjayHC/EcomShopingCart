package com.sanjay.Dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjay.bean.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
	
	List<Product> findAllByPrice(double price);
	List<Product> findAllByName(String name);
}
