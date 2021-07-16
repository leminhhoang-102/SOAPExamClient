package com.example.soapexamclient;

import com.example.soapexamclient.service.Product;
import com.example.soapexamclient.service.ProductService;
import com.example.soapexamclient.service.ProductServiceService;

public class TestAddProduct {
    public static void main(String[] args) {
        ProductServiceService productServiceService = new ProductServiceService();
        ProductService productService = productServiceService.getProductServicePort();
        Product product = new Product();
        product.setId(1);
        product.setName("may tinh");
        product.setPrice(100);
        product.setQuantity(50);
        productService.addProduct(product);
    }
}
