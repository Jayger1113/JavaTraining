package com.company.training.ch3;

/*abstract class TestAbstractClass {
    public abstract void abstractMethod(){}; //invalid, abstract function can't have implementation block
}*/

/*abstract class TestAbstractClass {
    public void Method(){}; //valid, if a class have no abstract function,
}*/

/*class TestAbstractClass{
    public abstract void abstractMethod(); // invalid, class need to define as a abstract class
}*/

abstract class TestAbstractClass {
    public void Method(){}; //valid, if a class have no abstract function,
}

public class Ch3_AbstractClass_Q1 {
    public static void main(String[] args) {
        //TestAbstractClass testAbstractClass = new TestAbstractClass(); //abstract class can't be instantiated directly
    }
}
