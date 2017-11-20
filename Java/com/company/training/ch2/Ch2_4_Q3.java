package com.company.training.ch2;

class Cloth{
    protected String size = "unknown";
    Cloth(String size){
        System.out.println("Cloth size =" +this.size);
    }
}

class TShirt extends Cloth{
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
