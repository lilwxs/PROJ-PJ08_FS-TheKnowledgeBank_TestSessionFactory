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

import java.sql.Timestamp;
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

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String showCreatePage(Model model) {
//        model.addAttribute("title", "Create");
//        return "pages/index";
//    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createUser(@RequestParam("firstName") String firstName,
                             @RequestParam("lastName") String lastName,
                             @RequestParam("username") String username,
                             @RequestParam("email") String email,
                             @RequestParam("password") String password,
                             @RequestParam("role") String role,
                             @RequestParam("dateJoin") Timestamp dateJoin) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);
        user.setDateJoin(dateJoin);
        userService.createUser(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteUser(@RequestParam("id") Integer id) {
        userService.deleteUserById(id);
        return "redirect:/";
    }

}
