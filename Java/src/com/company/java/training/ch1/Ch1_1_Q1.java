package com.company.java.training.ch1;

public class Ch1_1_Q1 {
     int x = 1, y = 2, z = 3;
     int a = x + y - 2/2 + z;
     int b = x + (y - 2)/(2 + z);

    public static void main(String[] args) {
        Ch1_1_Q1 obj = new Ch1_1_Q1();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
