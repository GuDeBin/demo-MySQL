package com.example.demoMySQL.payroll;

public class EmployeeNotFoundException extends RuntimeException{
    EmployeeNotFoundException(Long id){
        super("未找到该员工 " + id);
    }
}
