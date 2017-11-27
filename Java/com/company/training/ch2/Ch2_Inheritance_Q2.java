package com.company.training.ch2;

class People {
    People(int i) {
        System.out.println("number " + i + " people");
    }
}

class BadGuy extends People {
    /*
    //can't compile super class don't have no arg constructor
    BadGuy(){
        System.out.println("This is BadGuy");
    }*/
    BadGuy() {
        super(5);//if super class don't have default constructor,must initiated "super" keyword to call super class constructor;
        System.out.println("This is BadGuy");
    }
}

public class Ch2_Inheritance_Q2 {
    public static void main(String[] args) {
        BadGuy badGuy = new BadGuy();
    }
}
