package com.marvellous.StudentController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("hello")
    public String Display()
    {
        return "Welcome to Marvellous student API";
    }

    @GetMapping("/students/{id}")
    public String getStudentById(@PathVariable int id)
    {
        return "Student id: " + id;
    }
}
