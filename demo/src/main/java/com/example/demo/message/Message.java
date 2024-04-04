package com.example.demo.message;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Message {
    @GetMapping("/welcome") 
    public String message()
    {
        return "Hello good afternoon";
    }
}
