package com.company;

public class Car {
    String model;

    public Car (String model){
        this.model = model;
    }

    public void showModel(){
        System.out.println("This is an " + model);
    }
}
