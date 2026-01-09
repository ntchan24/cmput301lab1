package com.example.petshop;
//still need to implement interface
public class Cat extends Pet implements Pettable{
    public Cat(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "meow"; // Cats meow
    }

    @Override
    public void pet() {
        System.out.println(getName() + "meows");
    }
}