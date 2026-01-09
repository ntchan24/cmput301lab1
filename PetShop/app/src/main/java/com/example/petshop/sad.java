package com.example.petshop;

import java.util.Date;

public class sad extends Mood{
    sad(){
        super();
    }

    sad(Date realdate){
        super(realdate);
    }
    static void myMethod() {
    System.out.println("sad");
}
    @Override
    public String getMoodString() {
        return "sad";
    }
}
