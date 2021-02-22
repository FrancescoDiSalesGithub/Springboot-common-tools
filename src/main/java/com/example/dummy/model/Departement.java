package com.example.dummy.model;

import javax.persistence.*;

@Entity
@Table
public class Departement
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdDepartement;

    private String name;

    public int getIdDepartement() {
        return IdDepartement;
    }

    public void setIdDepartement(int idDepartement)
    {
        this.IdDepartement=idDepartement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
