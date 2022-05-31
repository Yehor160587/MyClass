package com.company;

public class Main1 {
    static void identifyElement(IElement element) {
        System.out.println(element.getElementName());
    };
    public static void main (String[] args) {
        WIND wind = new WIND();
        RIVER river = new RIVER();
        Main1.identifyElement(wind);
        Main1.identifyElement(river);
    }

}
