package com.jotapem.youraccount

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloWorldController {

    @GetMapping("/{name}")
    fun helloWorld(@PathVariable name: String): String {
        return "Hello $name"
    }



























}