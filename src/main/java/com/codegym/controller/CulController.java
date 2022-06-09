package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CulController {

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

   @PostMapping("/cul")
    public String Cul(@RequestParam double a, Model model){
        double b = a * 22000;
        model.addAttribute("result",b);
      return "result";
    }




}
