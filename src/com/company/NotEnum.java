package com.company;

public class NotEnum {
    static final class TrafficLight {
        static final Color RED = new Color("Red");
        static final Color YELLOW = new Color("Yellow");
        static final Color GREEN = new Color("Green");

    }

    public static void main(String[] args) {
        Color currentColor = TrafficLight.RED;
        Color currentColor1 = TrafficLight.YELLOW;
        Color currentColor3 = TrafficLight.GREEN;
        System.out.println(currentColor);
        System.out.println(currentColor1);
        System.out.println(currentColor3);
    }
}
