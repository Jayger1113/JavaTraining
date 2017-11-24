package com.company.training.ch3;

/*
interface must follow the rule:
1. field is "final static" if you don't define
2. field encapsulation: public,default
2. field need to assign default value
3. function can't have implementation block

public interface Ch3_Interface_Q2 {
    protected String str1; //invalid encapsulation
    private String str2;//invalid encapsulation
    String str3;//invalid, no default value
    String str4=""; //valid, smae with "static final String str4"
    void IMethod1(){}; //invalid, implementation block here
    private void IMethod2(); //invalid encapsulation
    protected void IMethod3();//invalid encapsulation
    void IMethod4();//valid
    public void IMethod5();//valid
}*/

public interface Ch3_Interface_Q2 {
    String str = "default"; //valid, smae with "static final String str4"
    void IMethod(); //invalid, implementation block here

}