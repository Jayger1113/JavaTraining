package com.company.training.ch1;


class Bird3{
    boolean b;
    int i;
    String s;
    Bird3(){
        System.out.println("print no arg constructor filed b = "+ b);
        System.out.println("print no arg constructor filed i = "+ i);
        System.out.println("print no arg constructor filed s = "+ s);
    }
    Bird3(int i){
        this.i = i;
    }
    Bird3(String s){
        this.s = s;
    }
    Bird3(int i ,String s){
        this(i);
        //this(s); //can't compile , only allow "this" constructor called once
        i = 6;
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(this.s);
    }
}

public class CH1_Class_Object_initialize_finalize_Q3 {
    public static void main(String[] args) {
        Bird3 bird3_1 = new Bird3();
        Bird3 bird3_2 = new Bird3(5,"I can fly higher");
    }
}
