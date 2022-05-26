package com.company;

public class Car { private String Brand;
    public Car(String Brand) {
        this.Brand = Brand;}
    public Car() {}
    public String getBrand() {return Brand;}
    public void setBrand(String Brand) {this.Brand = Brand;}
    public String toString() {return Brand;}

    public Object clone() {
        return new Car(Brand);}

 public static void main(String[] args) {
        Car car = new Car();
       car.setBrand("BMW");
       car.getBrand();
       car.toString();
       System.out.print(car.Brand);
    }
}


