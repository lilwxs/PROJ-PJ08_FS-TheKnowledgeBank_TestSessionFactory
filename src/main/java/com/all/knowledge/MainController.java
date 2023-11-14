package com.all.knowledge;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("title", "Home");
        return "pages/index";
    }
}
