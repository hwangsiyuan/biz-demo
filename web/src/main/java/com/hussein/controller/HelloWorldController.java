package com.hussein.controller;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Controller
public class HelloWorldController {

    @Value("${spring.profiles.active}")
    private String environment;

    @Value("${name}")
    private String username;

    @GetMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("environment", environment);
        model.addAttribute("username", username);
        log.info("{},{}", environment, username);
        return "index";
    }
}
