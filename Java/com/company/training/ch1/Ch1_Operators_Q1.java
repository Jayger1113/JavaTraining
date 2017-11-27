package com.company.training.ch1;

public class Ch1_Operators_Q1 {
     int x = 1, y = 2, z = 3;
     int a = x + y - 2/2 + z;
     int b = x + (y - 2)/(2 + z);

    public static void main(String[] args) {
        Ch1_Operators_Q1 instance = new Ch1_Operators_Q1();
        System.out.println(instance.a);
        System.out.println(instance.b);
    }
}
