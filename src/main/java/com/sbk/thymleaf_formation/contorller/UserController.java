package com.sbk.thymleaf_formation.contorller;

import com.sbk.thymleaf_formation.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user = new User("khalil","khalil@gmail.com","ADMIN","Male");
        model.addAttribute("user",user);
        return "variable-expression";
    }
    @GetMapping("message-expression")
    public String messageExpression(){
        return "message-expression";
    }
    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("ido", 1);
        return "link-expression";
    }
    @GetMapping("fragment-expression")
    public  String fragmentExpresion(){
        return "fragment-expression";
    }
    @GetMapping("/users")
    public String users(Model model){
        User user1 = new User("Alice", "alice@example.com", "ADMIN", "Female");
        User user2 = new User("Bob", "bob@example.com", "USER", "Male");
        User user3 = new User("Charlie", "charlie@example.com", "MODERATOR", "Male");
        User user4 = new User("Diana", "diana@example.com", "USER", "Female");
        User user5 = new User("Eve", "eve@example.com", "ADMIN", "Female");
        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        model.addAttribute("users", users);
        return"users";
    }
}
