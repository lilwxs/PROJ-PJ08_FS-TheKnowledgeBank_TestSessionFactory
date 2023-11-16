package com.all.knowledge;

import com.all.knowledge.Entity.User;
import com.all.knowledge.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//@RestController
//@RequestMapping("/users")
//public class MainController {
//    @Autowired
//    private UserService userService;
//
//    @GetMapping
//    public List<User> getAllUsers() {
//        return userService.findAll();
//    }
//}

@Controller
public class MainController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showHomePage(Model model) {
        List<User> users = userService.findAllUser();
        model.addAttribute("users", users);
        model.addAttribute("title", "Home");
        return "pages/index";
    }

}
