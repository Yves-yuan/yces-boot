package app.controller;

import app.entity.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping("/saveUser")
    public String saveUser(User user) {
        service.save(user);
        return String.format("User %s saved", user.getAccount());
    }

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return service.getUser(id);
    }

    @RequestMapping("/user/list")
    public String listUser(Model model) {
        Iterable<User> userList = service.getAll();
        model.addAttribute("users", userList);
        return "/user/list";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        return "/user/login";
    }
}
