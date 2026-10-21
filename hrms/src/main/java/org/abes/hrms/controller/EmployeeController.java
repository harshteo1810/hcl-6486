package org.abes.hrms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/") // we are using the GET Method of HTTP Protocol
    public String welcome(){
        return "<h2 style='color:red'>Welcome to HRMS App</h2>";
    }
}
