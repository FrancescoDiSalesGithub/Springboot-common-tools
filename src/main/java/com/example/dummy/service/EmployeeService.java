package com.example.dummy.service;

import com.example.dummy.model.Employee;
import com.example.dummy.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee) throws SQLException
    {
        employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployee()
    {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(Employee e)
    {
        employeeRepository.delete(e);
    }



}
