package com.sanjay.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjay.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository < UserModel, Long > {
    UserModel findByname(String name);
}