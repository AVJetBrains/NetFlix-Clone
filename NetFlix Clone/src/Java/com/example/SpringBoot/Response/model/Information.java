package com.example.SpringBoot.Response.model;

public class Information {
    private String Name;

    public Information(){

    }

    public Information(String Name){
        this.Name = Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}
