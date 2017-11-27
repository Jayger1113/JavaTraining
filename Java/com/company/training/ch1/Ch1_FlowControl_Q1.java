package com.company.training.ch1;


public class Ch1_FlowControl_Q1 {
    public static void main(String[] args) {
        testSwitchCase(0);
        testSwitchCase(1);
        testSwitchCase(2);
        testSwitchCase(3);
        testForLoop();
        testNestedForLoopCase1();
        testNestedForLoopCase2();
    }

    static void testSwitchCase(int aSwitch){
        switch(aSwitch){
            case 0:
            case 1:
                System.out.println("same case result aSwitch="+aSwitch);
                break;
            case 2:
                System.out.println("same case result aSwitch="+aSwitch);
                break;
            default:
                System.out.println("you got me!");
                break;
        }
    }

    static void testForLoop(){
        for(int i = 0; i< 10; i++){
            if(i==3) continue;
            if(i==7) break;
            System.out.println("i="+i);
        }
    }

    static void testNestedForLoopCase1(){
        outer: for(int i = 0; i< 5; i++){
            inner: for(int j = 0 ;j < 5;j++){
                if(j==3) break outer;
                System.out.println("j="+j);
            }
            System.out.println("i="+i);
        }
    }

    static void testNestedForLoopCase2(){
        outer: for(int i = 0; i< 5; i++){
            inner: for(int j = 0 ;j < 5;j++){
                if(j==3) continue outer;
                System.out.println("j="+j);
            }
            System.out.println("i="+i);
        }
    }

}
