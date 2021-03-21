package com.example.dummy.dto;

public class User
{
    private int id;
    private String username;
    private String password;
    private String email;


    public User()
    {
        super();
    }

    public User(int id,String username,String password,String email)
    {
        super();

        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setId(int id)
    {
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUsername()
    {
        return username;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

}
