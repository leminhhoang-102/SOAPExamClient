package com.example.soapexamclient;

import com.example.soapexamclient.service.Product;
import com.example.soapexamclient.service.ProductService;
import com.example.soapexamclient.service.ProductServiceService;

import java.util.List;

public class TestSellProduct {
    public static void main(String[] args) {
        ProductServiceService productServiceService = new ProductServiceService();
        ProductService productService = productServiceService.getProductServicePort();
        productService.sellProduct(1,5);
    }
}
