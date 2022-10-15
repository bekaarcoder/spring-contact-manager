package com.blitzstriker.projectmanagement.controllers;

import com.blitzstriker.projectmanagement.dto.Message;
import com.blitzstriker.projectmanagement.entities.User;
import com.blitzstriker.projectmanagement.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String showCustomLogin(Model model) {
        model.addAttribute("title", "Login");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "auth/login";
        }
        return "redirect:/users/dashboard";
    }

    @GetMapping("/register")
    public String displayRegisterPage(Model model) {
        model.addAttribute("title", "Register");

        User user = new User();
        model.addAttribute("user", user);
        return "auth/register";
    }

    @PostMapping("/createUser")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult errors, Model model, HttpSession httpSession) {
        model.addAttribute("title", "Register");
        try {
            if (errors.hasErrors()) {
                System.out.println("Error Occurred!!");
                model.addAttribute("user", user);
                return "auth/register";
            }

            if (user.getPassword().length() < 8) {
                System.out.println("Password must be at least 8 characters.");
                throw new Exception("Password must be at least 8 characters.");
            }

            userService.createUser(user);
            model.addAttribute("user", new User());
            httpSession.setAttribute("message", new Message("Your account has been created successfully.", "alert-success"));
            return "redirect:/users/register";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("user", user);
            httpSession.setAttribute("message", new Message(e.getMessage(), "alert-danger"));
            return "auth/register";
        }
    }

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("title", "Dashboard");
        return "main/dashboard";
    }
}
