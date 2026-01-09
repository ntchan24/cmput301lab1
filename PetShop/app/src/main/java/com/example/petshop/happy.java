package com.example.petshop;

import java.util.Date;

public class happy extends Mood{


    //need to create two constructors inherited from the mood class
    happy(){
        super();
    }

    happy(Date realdate){
        super(realdate);
    }

    @Override
    public String getMoodString() {
        return "happy";
    }
}
