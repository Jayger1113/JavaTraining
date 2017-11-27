package com.company.training.ch3;

class MyOuterClassEx2{
    static String outerStaticString = "outerStaticString";
    int outerNonStaticInt = 0;

    public void outerClassMethod(){
        new MyInnerClassEx2().innerClassMethod();
    }

    static class MyInnerClassEx2{
        static String innerStaticString = "innerStaticString";
        int innerNonStaticInt = 1;
        public void innerClassMethod(){
            System.out.println("innerClassMethod get outerStaticString ="+ outerStaticString);// non-static inner class can access outer class static member
            //System.out.println("innerClassMethod get outerNonStaticInt ="+ outerNonStaticInt);//invalid ,static inner class can not access outer class non-static member
        }
    }
}

public class Ch3_InnerClass_Q2 {
    public static void main(String[] args) {
        new MyOuterClassEx2().outerClassMethod();
    }
}
