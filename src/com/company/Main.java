 /* package com.company;

public class Main {
    public static void main(String[] args)
    {
        int a = 10, b = 20, c = 20;
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        if ((a < b) && (b == c)) {
            System.out.println("True Conditions");
        }
        else
            System.out.println("False conditions");
    }
}*/

/*package com.company;

 public class Main {
     void displayPersonalData(String name, String surname, String dateOfBirth) {
         System.out.println(name + " " + surname + " " + dateOfBirth);
     }

     public static void main(String[] args) {
Main main = new Main();
main.displayPersonalData( "Egor", "Styagin", "160587");
     }
 }*/

 /*package com.company;

 public class Main {
     void displayPersonalData(String name, String surname, String dateOfBirth) {
         System.out.println(name + " " + surname + " " + dateOfBirth);
     }
int showStringLength(String str) {
         return str.length();
}
     public static void main(String[] args) {
         Main main = new Main();
         System.out.println(main.showStringLength("Good day"));

         //main.displayPersonalData( "Egor", "Styagin", "160587");
     }
 }*/
/* package com.company;
 public class Main {
     void transferMyMassive(int[] myMassive) {
         for (int a = myMassive.length; a > 0; a--) {
             System.out.println(a + ": я выполняюсь перед сontinue!");
             if (a > 5) {
                 System.out.println("    " + a + ":  я выполняюсь всего два раза;!(");
                 continue;
             }
         }
     }
     public static void main(String[] args) {
        Main main = new Main();
       main.transferMyMassive(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

             }
         }

            /* int [] myMassive = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

             // Вывести на экран все элементы массива
             for (int a = 0; a < myMassive.length; a++) {
                 System.out.println(myMassive[a] + " ");
             }
     }
 }*/

//Описать метод, принимающий на вход массив целых чисел, и возвращающий массив целых чисел, упорядоченных по возрастанию.
 /*package com.company;
 public class Main {
     public static void transferMyMassive() {int[] myMassive = new int[]{1, 2, 3, 4, 5};
         for (int a = 0; a < myMassive.length; a++) {
             System.out.println(a);
                 continue;
             }
         }
     public static void main(String[] args) {
         transferMyMassive();
     }
 }*/

/*package com.company;
 public class Main {
     private static int factorial(int n) {
         int result = 1;
         if (n == 1 || n == 0) {
             return result;
         }
         result = n * factorial(n-1);
         return result;

     }
     public static void main(String[] args) {
         System.out.println(factorial(0));
         System.out.println(factorial(1));
         System.out.println(factorial(2));
         System.out.println(factorial(3));
         System.out.println(factorial(4));
         System.out.println(factorial(5));
         System.out.println(factorial(6));
     }
 }
 /*package com.company;
 public class Main {enum TrafficLightColor {RED, YELLOW, GREEN}
     public static class TLEnum {
     private TrafficLightColor color = TrafficLightColor.GREEN;

         void changeTLColor() {switch (color) {
             case GREEN:color = TrafficLightColor.RED; System.out.print("STOP:"); break;
                 case RED:color = TrafficLightColor.YELLOW; System.out.print("PREPARING:"); break;
                 case YELLOW: color = TrafficLightColor.GREEN; System.out.print("GO:"); break;
                 default: System.out.println("Oooops!");}}

         public String toString() {return "TrafficLightColor is " + color.name();}

         public static void main(String[] args) {
             TLEnum tlEnum = new TLEnum();
             for (int i = 0; i < 3; i++) {
                 tlEnum.changeTLColor();
                 System.out.println(tlEnum);
             }
         }
     }
 }*/

/*package com.company;
 public class Main {
         public static void main(String[] args) {
         Human human1 = new Human();
         human1.setName("Volodya");
         human1.print();
     }
 }
 class Human{
     String name;
     public String getName() {
         return name;
     }
     public void setName(String name){
         this.name = name;
     }
     void print(){
         System.out.println(name);
     }
 }*/
/*  public class A { }
        public interface I1 { }
        public interface I2 { }
        public class B extends A implements I1, I2 { }
 }*/

/*package com.company;
 public class Main {
         String name;

     public Main() {

     }

     public String getName() {
             return name;
         }
         public Main (String name) {
             this.name = name;
         }
         public void display() {

             System.out.println("Name: " + name);
         }

     public static void main(String[] args) {
         Main main = new Main();
         main.getName();
         main.display();
         System.out.println();
     }
 }*/
 /*package com.company;
 public class Main {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
    }
}
 class Person {
     String name;
     public String getName() { return name; }
     public Person(String name){
         this.name=name;
     }
     public void display(){
         System.out.printf("Person %s \n", name);
     }
 }
 class Employee extends Person{
     String company;
     public Employee(String name, String company) {
         super(name);
         this.company = company;
     }
     public void display(){
         System.out.printf("Employee %s works in %s \n", super.getName(), company);
     }
 }*/