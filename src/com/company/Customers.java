package com.company;

import java.util.HashMap;

public class Customers {
    public static void main(String[] args){
        HashMap<String, String> customers = new HashMap<>();
        customers.put("1","Alfreds Futterkiste");
        customers.put("2","Ana Trujillo Emparedados y helados");
        customers.put("3","Antonio Moreno Taquería");
        customers.put("4","Around the Horn");
        customers.put("5","Berglunds snabbköp");
        System.out.println(customers);
        String y = customers.get("5");
        System.out.println();
        System.out.println(y);
        System.out.println();
        customers.remove("1");
        System.out.println(customers);
    }
}