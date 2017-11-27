package com.company.training.ch1;

public class Ch1_Operators_Q2 {

    Integer n1 = new Integer(5566);
    Integer n2 = new Integer(5566);
    public static void main(String[] args) {
        Ch1_Operators_Q2 instance = new Ch1_Operators_Q2();
        System.out.println(instance.n1 == instance.n2);
        System.out.println(instance.n1 != instance.n2);
    }
}
