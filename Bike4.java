package com.xworkz.inheritance;

public class Bike4 extends Vehicle4 {
    String name;
    boolean isStand;
    public  void transportDetails() {
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(this.name);
        name = "KTM";
        System.out.println(name);
        System.out.println(this.name);
        super.name = "Scooter";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }
}
