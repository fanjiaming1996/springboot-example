package com.example.thymeleaf.controller;

import com.example.thymeleaf.domin.User;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author Fan
 */
@Controller
public class UserController {
    @GetMapping("user")
    public String user(Model model) {
        Map<String, String> map = Maps.newHashMap();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "B");
        User user = new User();
        user.setUsername("Fan");
        user.setList(Lists.newArrayList("1", "2", "3"));
        user.setMap(map);
        model.addAttribute(user);
        return "user";
    }
}
