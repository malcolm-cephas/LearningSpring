package com.malcolm.WebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.malcolm.WebApp.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
