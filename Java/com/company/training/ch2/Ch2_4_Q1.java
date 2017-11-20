package com.company.training.ch2;

class Animal{
    Animal(){
        System.out.println("new Animal");
    }
}

class Cat extends Animal{
    Cat(){
        System.out.println("new Cat");
    }
}

class BadCat extends Cat{
    BadCat(){
        System.out.println("new BadCat");
    }
}

public class Ch2_4_Q1 {
    public static void main(String[] args) {
        BadCat badCat = new BadCat();
    }
}
