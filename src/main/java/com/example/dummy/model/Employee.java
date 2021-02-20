package com.example.dummy.model;

import javax.persistence.*;


@Entity
@Table(name = "Employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int idEmployee;

    private String name;
    private String surname;
    private int age;
    private float salary;


    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
