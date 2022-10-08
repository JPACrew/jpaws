package com.jj.jpaws.web.controller;

import com.jj.jpaws.web.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
    @GetMapping("/sayHello")
    public String sayHello(Model model) {
        String greeting = "hi?";
        model.addAttribute("message",greeting);
        return "views/home";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public Map<String, User> getUser(@RequestBody User user) {
        HashMap<String, User> data = new HashMap<>();
        data.put("user", user);
        return data;
    }
}
