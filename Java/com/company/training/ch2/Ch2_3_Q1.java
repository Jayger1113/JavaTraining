package com.company.training.ch2;

class Dog{
    void bark(){
        System.out.println("My good dog can bark");
    }
}

class DelegationExample{
    Dog goodDog = new Dog();
    public void tellMyDogBarking(){
        goodDog.bark();
    }
}

public class Ch2_3_Q1 {
    DelegationExample mDelegationExample = null;
    public static void main(String[] args) {
        DelegationExample mDelegationExample = new DelegationExample();
        mDelegationExample.tellMyDogBarking(); // Delegate through DelegationExample not using Dog directly
    }
}
