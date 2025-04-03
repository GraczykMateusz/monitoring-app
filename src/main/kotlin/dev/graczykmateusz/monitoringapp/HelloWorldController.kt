package dev.graczykmateusz.monitoringapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
  @GetMapping("/hello")
  fun helloWorld(): String {
    println("Hello World")
    return "{\"hello\": \"world\"}"
  }
}
