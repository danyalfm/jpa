package com.uabc.database.example.examplejpa.jpa.controllers;

import com.uabc.database.example.examplejpa.jpa.constant.ViewConstant;
import com.uabc.database.example.examplejpa.jpa.model.UserModel;
import com.uabc.database.example.examplejpa.jpa.services.SecurityService;
import com.uabc.database.example.examplejpa.jpa.services.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @Autowired
    @Qualifier("securityServiceImpl")
    private SecurityService securityService;

    private static final Log log = LogFactory.getLog(UserController.class);

    @GetMapping("/cancel")
    public String cancel() {
        return "redirect:/users/showUsers";
    }

    @GetMapping("/userForm")
    public String redirectUserForm(Model model, @RequestParam(name = "username", required = false) String username) {
        UserModel userModel = new UserModel();
        if(!username.equals("none"))
            userModel = userService.findUserByUsernameModel(username);
        model.addAttribute("userModel",userModel);
        return ViewConstant.USER_FORM;
    }

    @PostMapping("/adduser")
    public String addUser(@ModelAttribute(name = "userModel")UserModel userModel, Model model) {
        log.info("Method: addUser() -- Params: " + userModel.toString());
        if (userService.addUser(userModel) != null)
            model.addAttribute("result", 1);
        else
            model.addAttribute("result", 0);
        return "redirect:/users/showUsers";
    }

    @GetMapping("/showUsers")
    public ModelAndView showUsers() {
        ModelAndView mav = new ModelAndView(ViewConstant.USERS);
        mav.addObject("users",userService.listAllUsers());
        return mav;
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @GetMapping("/removeuser")
    public ModelAndView removeUser(@RequestParam(name = "username", required = true) String username) {
        userService.removeUser(username);
        return showUsers();
    }
}
