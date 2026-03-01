package com.wilson.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// STATELESS -> token, SATEFULL -> o estado de cada cliente é mantido no servidor
@Controller
@ResponseBody
public class HelloWorldController {
}
