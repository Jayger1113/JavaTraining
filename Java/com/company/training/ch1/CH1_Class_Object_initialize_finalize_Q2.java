package com.company.training.ch1;

class Bird2 {
    Bird2(int i){
        System.out.println(i);
    }
    Bird2(String s){
        System.out.println(s);
    }
}

public class CH1_Class_Object_initialize_finalize_Q2 {

    public static void main(String[] args) {
        //Bird2 bird2 = new Bird2();//can't compile because you don't have no arg constructor
        Bird2 bird2_1 = new Bird2(5);
        Bird2 bird2_2 = new Bird2("I don't fly");
    }
}