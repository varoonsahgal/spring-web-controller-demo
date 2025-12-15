package com.intuit.springwebdemo.example.controller;



import java.util.concurrent.atomic.AtomicLong;

import com.intuit.example.models.Greeting;
import com.intuit.example.models.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Some DEFAULT") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("Hello, %s!", name));
    }

    @GetMapping("/hi")
    public String sayHiQueryParam234(@RequestParam String name) {
        return "Hi " + name;
    }


    @GetMapping("/hi/{name}")
    public String sayHiPathParam(@PathVariable String name) {
        return "Hi " + name;
    }

    @GetMapping("/hi2")
    public String sayHiRestBody(@RequestBody String name) {
        return "this is the request body: " + name;
    }

    @GetMapping("/hiPerson")
    public String sayHiPersonRestBody(@RequestBody Person p) {
        return "Hi, this is output from an object of Person class: " + p.getName();
    }


}
