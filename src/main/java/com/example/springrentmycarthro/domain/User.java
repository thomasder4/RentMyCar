package com.example.springrentmycarthro.domain;

import javax.persistence.*;


@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    private String firstName;
    private String lastName;

    public User(){

    }

    public User(String firstName,String lastName){

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}