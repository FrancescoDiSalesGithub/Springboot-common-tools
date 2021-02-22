package com.example.dummy.model;

import javax.persistence.*;


@Entity
@Table(name = "Employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="idEmployee")
    private int idEmployee;

    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;

    @Column(name="age")
    private int age;
    @Column(name = "salary")
    private int salary;

    @Column(name="departement")
    private int departement;


    public int getDepartement() {
        return departement;
    }

    public void setDepartement(int departement) {
        this.departement = departement;
    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
