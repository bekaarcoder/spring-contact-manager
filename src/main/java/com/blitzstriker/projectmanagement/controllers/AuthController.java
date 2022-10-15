package com.blitzstriker.projectmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/signin")
    public String showCustomLogin(Model model) {
        model.addAttribute("title", "Login");
        return "auth/login";
    }
}
