package com.malcolm.WebApp.service;
import com.malcolm.WebApp.model.Product;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "Phone", 50000), new Product(102, "Canon Camera", 70000),new Product(103,"Microphone",10000));

    public List<Product> getProducts() {
        return products;
    }
}
