package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    private String name;
    private Date birthDate;

    Pet(String name){
        //not sure what to do with the default date thing
        this.name = name;
        this.birthDate = new Date();
    }
    Pet(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();
}







