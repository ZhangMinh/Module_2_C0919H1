package com.codegym.quanlytinh_jpa.controllers;

import com.codegym.quanlytinh_jpa.models.Province;
import com.codegym.quanlytinh_jpa.repository.ProvinceRepository;
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
public class ProvinceController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/provinces")
    public ModelAndView listProvinces() {
        return new ModelAndView ( "/province/list", "provinces", provinceService.findAll () );
    }

    @GetMapping("/create-province")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView ( "/province/create" );
        modelAndView.addObject ( "province", new Province () );
        return modelAndView;
    }

    @PostMapping("/create-province")
    public ModelAndView saveProvince(@ModelAttribute("province") Province province) {
        provinceService.save ( province );

        ModelAndView modelAndView = new ModelAndView ( "/province/create" );
        modelAndView.addObject ( "province", new Province () );
        modelAndView.addObject ( "message", "New province created successfully" );
        return modelAndView;
    }

    @GetMapping("/edit-province/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Province province = provinceService.findById ( id );
        if (province != null) {
            ModelAndView modelAndView = new ModelAndView ( "/province/edit" );
            modelAndView.addObject ( "province", province );
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView ( "/error.404" );
            return modelAndView;
        }
    }

    @PostMapping("/edit-province")
    public ModelAndView updateProvince(@ModelAttribute("province") Province province) {
        provinceService.save ( province );
        ModelAndView modelAndView = new ModelAndView ( "/province/edit" );
        modelAndView.addObject ( "province", province );
        modelAndView.addObject ( "message", "Province updated successfully" );
        return modelAndView;
    }

    @GetMapping("/delete-province/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Province province = provinceService.findById ( id );
        if (province != null) {
            ModelAndView modelAndView = new ModelAndView ( "/province/delete" );
            modelAndView.addObject ( "province", province );
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView ( "/error.404" );
            return modelAndView;
        }
    }

    @PostMapping("/delete-province")
    public String deleteProvince(@ModelAttribute("province") Province province) {
        provinceService.delete ( province.getId () );
        return "redirect:provinces";
    }
}
