package com.example.soapexamclient;

import com.example.soapexamclient.service.Product;
import com.example.soapexamclient.service.ProductService;
import com.example.soapexamclient.service.ProductServiceService;

import java.util.List;

public class TestListAllProduct {
    public static void main(String[] args) {
        ProductServiceService productServiceService = new ProductServiceService();
        ProductService productService = productServiceService.getProductServicePort();
        List<Product> list = productService.listAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
            System.out.println(";");
        }
    }
}
