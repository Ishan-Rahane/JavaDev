package com.example.Crud.repo;

import com.example.Crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Employee findByEmpName(String empName);
}
