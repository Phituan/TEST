package com.example.test.controller;

import com.example.test.entity.Sale;
import com.example.test.repository.ProductRepository;
import com.example.test.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/sale")
public class SaleController {
    @Autowired
    SaleRepository saleRepository;
    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String showForm(Model model) {
        model.addAttribute("sales", new Sale());
        return "Sale/form";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String create(Sale sale) {
        saleRepository.save(sale);
        return "Sale/list";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("sales", saleRepository.findAll());
        return "Sale/list";
    }
}
