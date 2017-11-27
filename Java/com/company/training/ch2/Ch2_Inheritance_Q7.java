package com.company.training.ch2;


class TestFinalKeyWordExample{
    private final String testString;
    TestFinalKeyWordExample(){
        testString = "test1";
        //testString = "test2";
        //final field can only be initialized once
        System.out.println(testString);
    }
    protected void testFunction(final String str){
        //str = "test";
        //final argu can't be assign again
        System.out.println(str);
    }
}

public class Ch2_Inheritance_Q7 {
    public static void main(String[] args) {
        TestFinalKeyWordExample instance = new TestFinalKeyWordExample();
        instance.testFunction("Test Final keyword success");

    }
}
