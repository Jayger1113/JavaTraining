package com.company.training.ch2;

//final class can't be extended
/*final class FinalClassExmaple{
    protected void testFunction(){
        System.out.println("FinalClassExmaple testFunction");
    }
}*/

class FinalClassExmaple{
    protected void testFunction(){
        System.out.println("FinalClassExmaple testFunction");
    }
}

class Example extends FinalClassExmaple{
    public void testFunction(){
        super.testFunction();
    }
}

public class Ch2_4_Q9 {

    public static void main(String[] args) {
        Example example = new Example();
        example.testFunction();
    }
}
