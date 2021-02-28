package com.example.dummy.model;

import javax.persistence.*;

@Entity
@Table
public class Project
{
    @Id
    private String idProject;
    private String nameProject;

    @ManyToOne
    @JoinColumn(name = "idEmployee")
    private Employee idEmployee;

    public void setIdEmployee(Employee idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Employee getIdEmployee() {
        return idEmployee;
    }

    public String getIdProject() {
        return idProject;
    }

    public void setIdProject(String idProject) {
        this.idProject = idProject;
    }

    public String getNameProject()
    {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }


}
