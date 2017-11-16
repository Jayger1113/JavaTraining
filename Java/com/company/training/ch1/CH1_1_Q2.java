package com.company.training.ch1;

public class CH1_1_Q2 {

    Integer n1 = new Integer(5566);
    Integer n2 = new Integer(5566);
    public static void main(String[] args) {
        CH1_1_Q2 obj = new CH1_1_Q2();
        System.out.println(obj.n1 == obj.n2);
        System.out.println(obj.n1 != obj.n2);
    }
}
