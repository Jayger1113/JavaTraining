package com.company.training.ch3;

class MyOuterClassEx1{
    static String outerStaticString = "outerStaticString";
    int outerNonStaticInt = 0;

    public void outerClassMethod(){
        new MyInnerClassEx1().innerClassMethod();
    }

    class MyInnerClassEx1{
        //static String innerStaticString = "innerStaticString";//invalid , non-static inner class can't define static member
        int innerNonStaticInt = 1;
        public void innerClassMethod(){
            System.out.println("innerClassMethod get outerStaticString ="+ outerStaticString);// non-static inner class can access outer class static member
            System.out.println("innerClassMethod get outerNonStaticInt ="+ outerNonStaticInt);// non-static inner class can also access outer class non-static member
        }
    }
}

public class Ch3_InnerClass_Q1 {
    public static void main(String[] args) {
        new MyOuterClassEx1().outerClassMethod();
    }
}
