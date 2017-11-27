package com.company.training.ch2;

class CompositionExample{
    void justAMethod(){
        System.out.println("this is an example of composition "+ this.getClass().getSimpleName());
    }
}

public class Ch2_Composition_Q1 {
    static CompositionExample mCompositionExample = null; //this is composition
    public static void main(String[] args) {
        CompositionExample mCompositionExample = new CompositionExample();
    }
}
