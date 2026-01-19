package com.malcolm.WebApp.service;
import com.malcolm.WebApp.model.Product;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(101, "Phone", 50000),
         new Product(102, "Canon Camera", 70000),
         new Product(103,"Microphone",10000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId)
    {
        return products.stream()
            .filter(p->p.getProdId()==prodId)
            .findFirst().orElse(new Product(100,"No Item",0));
    }

    public void addProduct(Product prod)
    {
        products.add(prod); 
    }
}
