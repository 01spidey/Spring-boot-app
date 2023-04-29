package com.vcorp.backend.service.Service;

import com.vcorp.backend.service.entity.Product;
import com.vcorp.backend.service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public void createProducts(){
        Product product = Product.builder().price(100.00).name("Soap").build();
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product);
        productRepository.saveAll(productList);
    }

}
