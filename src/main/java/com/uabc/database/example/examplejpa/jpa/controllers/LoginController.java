package com.uabc.database.example.examplejpa.jpa.controllers;

import com.uabc.database.example.examplejpa.jpa.constant.ViewConstant;
import com.uabc.database.example.examplejpa.jpa.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        UserModel userModel = new UserModel();
        model.addAttribute("userModel",userModel);

        if (error != null){
            model.addAttribute("error", "Your username and password is invalid.");
        }

        if (logout != null){
            model.addAttribute("message", "You have been logged out successfully.");
        }

        return ViewConstant.LOGIN;
    }

    @GetMapping({"/"})
    public String welcome(Model model) {
        return "redirect:/login";
    }
}
