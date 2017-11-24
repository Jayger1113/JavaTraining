package com.company.training.ch3;


class Language{
    void print(){
        System.out.println("Language print");
    }
}

class Java extends Language {
    void print(){
        System.out.println("java print");
    }
    void javaMethod(){
        System.out.println("javaMethod");
    }
}

class C extends Language {
    void print(){
        System.out.println("c print");
    }
    void cMethod(){
        System.out.println("cMethod");
    }
}

public class Ch3_Polymorphism_Q1 {
    public static void main(String[] args) {
        //Downcasting is dangerous!
        //EX1: Downcasting
        /*Language language = new Java();
        ((Java)language).print();
        ((Java)language).javaMethod();*/
        //EX2: Downcasting compile success, Runtime exception
        /*Language language = new Language();
        ((Java) language).javaMethod();*/
        //EX3: No matter Upcasing or Downcasting, Make sure you know reference to before you call the method
        /*Language language = new Java();//Upcasting
        ((Java)language).print();//Downcasting
        ((Java)language).javaMethod();//Downcasting
        ((Language) language).print();//Upcasting
        ((Language) language).javaMethod();//Upcasting*/
        //EX4: using instanceof keyword to do Upcasting or Downcasting in sibling class case
        /*Language language = new C();
        if(language instanceof C){
            language.print();
        }else{
            System.out.println("Not a C type instance");
        }
        //Downcasting to Java ,but not a Java type
        //((Java)language).print() <= run time Exception
        if(language instanceof Java){
            ((Java)language).print();
        }else{
            System.out.println("Not a Java type instance");
        }*/
    }
}
