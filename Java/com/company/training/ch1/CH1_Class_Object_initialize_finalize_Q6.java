package com.company.training.ch1;

class Animal{
    Animal(int n){
        System.out.println("animal "+n);
    }
}


public class CH1_Class_Object_initialize_finalize_Q6 {
    Animal a1 = new Animal(1);
    Animal a4;

    CH1_Class_Object_initialize_finalize_Q6(){
        System.out.println("CH1_Class_Object_initialize_finalize_Q6 constructor complete");
    }

    Animal a3 = new Animal(3);

    {
        a4 = new Animal(4);
        System.out.println("CH1_Class_Object_initialize_finalize_Q6 initialize block complete");
    }

    Animal a2 = new Animal(2);

    public static void main(String[] args) {
        CH1_Class_Object_initialize_finalize_Q6 instance  = new CH1_Class_Object_initialize_finalize_Q6();
    }

}
