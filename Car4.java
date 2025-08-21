package com.xworkz.inheritance;

public class Car4 extends Vehicle4 {
    String name;
    String colour;
    public Car4(){

    }
    public Car4(String name, String colour){
        this.name = name;
        this.colour = colour;
    }
    public void getCarDetails(){
        System.out.println("Car Name : "+name + " Car colour : "+colour);
    }
}
