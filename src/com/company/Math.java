package com.company;

public class Math {
    public static void main(String[] args) {
        Math math = new Math();
        math.culc(2,3);
        math.culc(15,22);
        math.culc(33, 54);
        System.out.println(math.culc(2,3));
        System.out.println(math.culc(15,22));
        System.out.println(math.culc(33,54));
}
    static int culc (int a, int b) {
        return a+b;
    }

    static float culc (int a, float b){
        return a+b;
    }

    static double culc(double a, double b) {
        return a+b;
    }
}

