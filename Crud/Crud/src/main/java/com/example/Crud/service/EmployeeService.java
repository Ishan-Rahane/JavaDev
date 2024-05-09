package com.example.Crud.service;

import com.example.Crud.model.Employee;
import com.example.Crud.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    //POST single epmloyee info
    public Employee saveEmployee(Employee emp){
        return employeeRepo.save(emp);
    }

    //POST multiple employee info
    public List<Employee> saveEmployees(List<Employee> emp){
        return employeeRepo.saveAll(emp);
    }

    //GET list of employee
    public List<Employee> getEmployees(){
        return employeeRepo.findAll();
    }

    //GET employee by id
    public Employee getEmployeeById(int id){
        return employeeRepo.findById(id).orElse(null); //here we use optional so that if there is no value, return null
    }

    //GET by name, then you have to customise your query
    public Employee getEmployeeByName(String empName){
        return employeeRepo.findByEmpName(empName);
    }

    //DELETE employee info by id
    public String deleteEmployee(int id){
        employeeRepo.deleteById(id);
        return "Employee information has been deleted successfully!";
    }

    //UPDATE
    public Employee updateEmployee(Employee emp){
        Employee existingEmp = employeeRepo.findById(emp.getEmpId()).orElse(null);
        existingEmp.setEmpName(emp.getEmpName());
        existingEmp.setEmpAdd(emp.getEmpAdd());
        existingEmp.setEmpDept(emp.getEmpDept());
        existingEmp.setEmpCtc(emp.getEmpCtc());

        return employeeRepo.save(existingEmp);
    }
}
