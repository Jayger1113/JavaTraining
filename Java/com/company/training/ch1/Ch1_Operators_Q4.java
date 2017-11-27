package com.company.training.ch1;

public class Ch1_Operators_Q4 {
    int n= 0x0011;
    int bit= 0x1111;
    public static void main(String[] args) {
        Ch1_Operators_Q4 instance = new Ch1_Operators_Q4();

        System.out.println(Integer.toHexString(instance.n & instance.bit));
        System.out.println(Integer.toHexString(instance.n ^ instance.bit));
        System.out.println(Integer.toHexString(instance.n | instance.bit));
    }
}
