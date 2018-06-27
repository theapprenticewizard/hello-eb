package io.github.theapprenticewizard.ebdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/health")
    public String health() {
        return "ok";
    }

    @ResponseBody
    @GetMapping("/running")
    public String running() {
        return "Hello, I am running!";
    }

    @ResponseBody
    @GetMapping("/env")
    public String env() { return System.getenv("potato"); }

    @ResponseBody
    @GetMapping("/changes")
    public String changes() { return "ch ch ch changes - this changed"; }
}
