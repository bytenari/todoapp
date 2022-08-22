package com.example.ToDoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class toDoAppController {
    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application !";
    }
}
