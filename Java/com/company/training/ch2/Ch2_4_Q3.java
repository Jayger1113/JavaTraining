package com.company.training.ch2;

class Cloth{
    protected String size = "unknown";
    Cloth(String size){
        System.out.println("Cloth size =" +this.size);
    }
}

class TShirt extends Cloth{
    /*
    Tshirt extends Cloth member size ,
    However, derived class can also have it's own same naming field.
    And then make it's own field encapsulation
    Ex:
    private String size = "TShirt defualt size";
    protected String size = "TShirt defualt size";
    public String size = "TShirt defualt size";
    String size = "TShirt defualt size";
    */
    TShirt(String size){
        super(size);
        this.size = size;
        System.out.println("Cloth size = "+ super.size);
        System.out.println("TShirt size = "+ this.size);
    }
}

public class Ch2_4_Q3 {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt("XXXS");
    }
}
