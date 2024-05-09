package com.example.Crud.controller;

import com.example.Crud.model.Employee;
import com.example.Crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee emp){
        return employeeService.saveEmployee(emp);
    }

    @PostMapping("/addemps")
    public List<Employee> addEmployeeList(@RequestBody List<Employee> emp){
        return employeeService.saveEmployees(emp);
    }

    @GetMapping("/getemps")
    public List<Employee> findAllEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/getemp/{id}")
    public Employee findEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/getemp/{name}")
    public Employee findEmployeeByName(@PathVariable String name){
        return employeeService.getEmployeeByName(name);
    }

    @PutMapping("/updateemp")
    public Employee updateEmployee(@RequestBody Employee emp){
        return employeeService.updateEmployee(emp);
    }

    @DeleteMapping("/deleteemp/{id}")
    public String deleteEmp(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }

}
