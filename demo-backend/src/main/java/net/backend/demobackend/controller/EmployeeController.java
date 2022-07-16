package net.backend.demobackend.controller;


import net.backend.demobackend.entity.Employee;
import net.backend.demobackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/message")
//@CrossOrigin("http://localhost:8081/")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    private List<Employee> fetchEmpolyees(){

        return employeeRepository.findAll();
    }

    @GetMapping("/hello")
    public String Hello(){
        return "Hello000";
    }
}
