package de.fred4jupiter.githubactionexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping
    public String greeting() {
        return "Hello World";
    }
}
