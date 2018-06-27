package io.github.theapprenticewizard.ebdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/health")
    public String health() {
        return "ok";
    }

    @GetMapping("/running")
    public String running() {
        return "Hello, I am running!";
    }
}
