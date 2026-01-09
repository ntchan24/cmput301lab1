package com.example.petshop;

import java.util.Date;

public abstract class Mood {


    private Date realdate;

    Mood(){
        this.realdate = new Date();
    }
    Mood(Date realdate){

        this.realdate = realdate;
    }
    public Date getRealdate() {
        return realdate;
    }

    public void setRealdate(Date realdate) {
        this.realdate = realdate;
    }



    public abstract String getMoodString();
}
