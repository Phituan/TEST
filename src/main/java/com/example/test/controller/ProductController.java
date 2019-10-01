package com.example.test.controller;

import com.example.test.repository.ProductRepository;
import com.example.test.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;
    @RequestMapping(method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "Product/list";
    }
}
