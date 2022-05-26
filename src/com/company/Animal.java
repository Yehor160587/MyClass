package com.company;
class Animal {
    void voice() {
        System.out.println("Голос!");}
}
class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Гав-гав!");
    }
}
 class Cat extends Animal {
     @Override
     void voice() {
         System.out.println("Мяу!");
     }

     public static void main(String[] args) {
         Animal dog = new Dog();
         Animal cat = new Cat();
         dog.voice();
         cat.voice();
     }
 }

/*package com.company;

 abstract class Animal {
    void voice() {
        System.out.println("Голос");}
 }

     class Dog extends Animal {
         @Override
         void voice() {
             super.voice();
             System.out.println("Гав-гав!");
         }
     }
     class Cat extends Animal {
     @Override
         void voice() {
         super.voice();
             System.out.println("Мяу!");
         }

     public static void main(String[] args) {
         Dog myDog = new Dog();
         myDog.voice();
         Cat myCat = new Cat();
         myCat.voice();
     }
 }*/