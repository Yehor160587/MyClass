package com.company;

import java.util.ArrayList;

public class CFH {
    static boolean list(String i, ArrayList<String> strList) {
        for (String str : strList) {
            if (str.equals(i))
                return true;
        }
        return false;
    }
        public static void main (String[]args){
            String str = "five";
            ArrayList<String> strList = new ArrayList<>();
            strList.add("two");
            strList.add(str);
            System.out.println(list("five", strList));
            System.out.println(list("two", strList));
            System.out.println(list("six", strList));
            System.out.println(list(str, strList));
        }
    }

