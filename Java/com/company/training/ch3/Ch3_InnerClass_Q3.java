package com.company.training.ch3;

interface IMyInterface{
    void iMethod1();
    void iMethod2();
}

public class Ch3_InnerClass_Q3 {

    //mMyInterface demonstrate Anonymous Inner Class
    private IMyInterface mMyInterface = new IMyInterface() {
        @Override
        public void iMethod1() {
            System.out.println("IMyInterface iMethod1 implement");
        }

        @Override
        public void iMethod2() {
            System.out.println("IMyInterface iMethod2 implement");
        }
    };

    public static void main(String[] args) {
        new Ch3_InnerClass_Q3().mMyInterface.iMethod1();
        new Ch3_InnerClass_Q3().mMyInterface.iMethod2();
    }
}
