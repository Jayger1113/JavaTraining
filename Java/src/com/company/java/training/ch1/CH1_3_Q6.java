package com.company.java.training.ch1;

class Animal{
    Animal(int n){
        System.out.println("animal "+n);
    }
}


public class CH1_3_Q6 {
    Animal a1 = new Animal(1);

    CH1_3_Q6(){
        System.out.println("CH1_3_Q6 constructor complete");
    }

    Animal a3 = new Animal(3);

    {
        System.out.println("CH1_3_Q6 initialize block complete");
    }
    Animal a2 = new Animal(2);

    public static void main(String[] args) {
        CH1_3_Q6 c  = new CH1_3_Q6();
    }

}
