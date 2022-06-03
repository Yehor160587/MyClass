package com.company;

public class Student extends Human implements IStudentInfo {
    public void doSomething() {
        System.out.println("Learn");
    }
public static void main(String [] args){
        Student y = new Student();
        y.doSomething();

}
}
