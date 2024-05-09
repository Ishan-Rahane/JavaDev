package com.example.Crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "EmployeeInfo")
public class Employee {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Employee ID")
    private int empId;

    @Column(name = "Employee Name")
    private String empName;

    @Column(name = "Employee Dept")
    private String empDept;

    @Column(name = "Employee Address")
    private String empAdd;

    @Column(name = "Employee CTC")
    private String empCtc;

    public Employee() {
    }

    public Employee(int employeeId, String empName, String empDept, String empAdd, String empCtc) {
        empId=employeeId;
        this.empName = empName;
        this.empDept = empDept;
        this.empAdd = empAdd;
        this.empCtc = empCtc;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }

    public String getEmpCtc() {
        return empCtc;
    }

    public void setEmpCtc(String empCtc) {
        this.empCtc = empCtc;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName=" + empName +
                ", empDept=" + empDept +
                ", empAdd=" + empAdd +
                ", empCtc=" + empCtc +
                '}';
    }
}
