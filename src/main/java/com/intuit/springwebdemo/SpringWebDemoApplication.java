package com.intuit.springwebdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//this annotation tells Spring to scan for beans
// in the current package (com.intuit.springwebdemo) and any subpackaages as well
// the problem is that our controller and model classes
@SpringBootApplication
public class SpringWebDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebDemoApplication.class, args);
    }

}
