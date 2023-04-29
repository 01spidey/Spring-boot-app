package com.vcorp.backend.service.controller;

import com.vcorp.backend.service.Service.ProductService;
import com.vcorp.backend.service.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductControl {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
         return productService.getProducts();
    }

    @GetMapping("/init")
    public void initProducts(){
        productService.createProducts();
    }





}
