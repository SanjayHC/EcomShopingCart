package com.sanjay.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjay.bean3.CategoryBean;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryBean,Integer> {

}
