package io.agilehandy.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hxm3459 on 8/9/16.
 */
@RestController
public class FantaController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello from Concourse demo app";
    }
}
