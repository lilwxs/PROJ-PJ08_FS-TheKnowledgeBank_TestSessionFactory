package com.all.knowledge.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @RequestMapping(value = {"/signin", "/login"}, method = RequestMethod.GET)
    public String showSignInPage(Model model) {
        model.addAttribute("title", "Đăng nhập");
        return "pages/auth/signIn";
    }

    @RequestMapping(value = {"/signup", "/register"}, method = RequestMethod.GET)
    public String showSignUpPage(Model model) {
        model.addAttribute("title", "Đăng ký");
        return "pages/auth/signUp";
    }
}
