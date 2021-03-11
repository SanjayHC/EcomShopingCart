package com.sanjay.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sanjay.bean2.ItemBean;

@Repository
public interface ItemRepository extends JpaRepository<ItemBean,Long>{

}
