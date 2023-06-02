package com.example.web_lab4.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class HelloWorldController {
    @GetMapping
    fun helloWorld(): String = "Hello, this is a REST endpoint!"
}