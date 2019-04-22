package com.hussein.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>Title: HelloWorldController</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 */
@Controller
public class HelloWorldController {

    @Value("${spring.profiles.active}")
    private String environment;

    @Value("${username}")
    private String username;

    @GetMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("environment", environment);
        model.addAttribute("username", username);
        return "index";
    }
}
