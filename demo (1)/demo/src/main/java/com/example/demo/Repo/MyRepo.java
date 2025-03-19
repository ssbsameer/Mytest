package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.example.demo.Model.Product;


public interface MyRepo extends JpaRepository<Product, Integer>{


}
