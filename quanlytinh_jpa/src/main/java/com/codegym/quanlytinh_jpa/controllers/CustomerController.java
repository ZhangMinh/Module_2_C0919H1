package com.codegym.quanlytinh_jpa.controllers;

import com.codegym.quanlytinh_jpa.models.Customer;
import com.codegym.quanlytinh_jpa.models.Province;
import com.codegym.quanlytinh_jpa.services.CustomerService;
import com.codegym.quanlytinh_jpa.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces() {
        return provinceService.findAll ();
    }

    @GetMapping("listCustomer")
    public ModelAndView listCustomer() {
        return new ModelAndView ( "list", "customers", customerService.findAll () );
    }

    @GetMapping("create-customer")
    public ModelAndView showFormCreate() {
        return new ModelAndView ( "create", "customer", new Customer () );
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save ( customer );
        ModelAndView modelAndView = new ModelAndView ( "/create" );
        modelAndView.addObject ( "customer", new Customer () );
        modelAndView.addObject ( "message", "New customer create successfull" );
        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showFormEdit(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView ( "/edit" );
        Customer customer = customerService.findById ( id );
        modelAndView.addObject ( "customer", customer );
        return modelAndView;
    }

    @PostMapping("/edit-customer")
    public ModelAndView editCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save ( customer );
        ModelAndView modelAndView = new ModelAndView ( "/edit" );
        modelAndView.addObject ( "customer", new Customer () );
        modelAndView.addObject ( "message", "Customer update successfull" );
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView showFormDelete(@PathVariable Long id) {
        customerService.delete ( id );
        return new ModelAndView ( "list", "customers", customerService.findAll () );
    }
}
