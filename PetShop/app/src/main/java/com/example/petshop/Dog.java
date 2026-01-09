package com.example.petshop;

import java.util.Date;

//still need to implement interface
public class Dog extends Pet implements Pettable {
    public Dog(String name){
        super(name);
    }
    public Dog(String name, Date birthDate){
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "bark"; // dogs bark
    }

    @Override
    public void pet() {
        System.out.println(getName() + " woofs");
    }

}