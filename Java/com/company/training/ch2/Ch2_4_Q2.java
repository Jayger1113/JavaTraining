package com.company.training.ch2;

class People{
    People(int i){
        System.out.println("number "+ i + " people");
    }

}

class BadGuy extends People{
    BadGuy(){
        super(5); //can't compile super class don't have no arg constructor
        System.out.println("This is BadGuy");
    }
}

public class Ch2_4_Q2 {
    public static void main(String[] args) {
        BadGuy badgGuy = new BadGuy();
    }
}
