package com.company.training.ch2;

class Father{
    private void foo(){
        System.out.println("Father foo");
    }
    private final void goo(){
        System.out.println("Father goo");
    }
    protected final void too(){
        System.out.println("Father too");
    }
}

class Son extends Father{
    public void foo(){
        System.out.println("Son foo");
    }
    public final void goo(){
        System.out.println("Son goo");
    }
}

public class Ch2_4_Q8 {
    public static void main(String[] args) {
        Son son = new Son();
        son.foo();
        son.goo();
        son.too();
        Father father = ((Father) son);
        //Son class does not override father function, because it is private function. Actually, private and private final function is same thing
        //father.foo();
        //father.goo();
        father.too();
    }
}
