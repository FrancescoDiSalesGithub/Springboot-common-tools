package com.example.dummy.controller;

import com.example.dummy.model.Employee;
import com.example.dummy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee/save")
    public void SaveEmployee(@RequestBody Employee employee)
    {
        try
        {
           employeeService.saveEmployee(employee);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

    }

    @GetMapping("/employee/show")
    public List<Employee> showEmployee()
    {
        return employeeService.findAllEmployee();
    }

    @PostMapping("/employee/delete")
    public void deleteEmployee(@RequestBody Employee e)
    {
        employeeService.deleteEmployee(e);
    }


}
