package com.wilson.first_spring_app.controller;

import com.wilson.first_spring_app.domain.User;
import com.wilson.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// STATELESS -> (token) a cada nova requisição eu recebo todas as informações que eu preciso para aquela funcionalidade que o cliente esta pedindo
// STATEFULL -> o estado de cada cliente é mantido no servidor

@RequestMapping("/hello-world")
@Profile("dev")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    /*
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
     */

    //GET / hello-world
    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Wilson");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body){
        return "hello world Post " + body.getName() + id + filter;
    }
}
