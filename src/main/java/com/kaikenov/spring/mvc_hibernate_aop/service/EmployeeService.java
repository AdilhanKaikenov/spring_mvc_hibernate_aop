package com.kaikenov.spring.mvc_hibernate_aop.service;

import com.kaikenov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee getEmployee(int id);

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
}
