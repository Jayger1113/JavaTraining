package com.company.training.ch1;

class Book{
    boolean checkin = false;
    String name = "";
    Book(String name){
        checkin = true;
        this.name = name;
    }
    void checkout(){
        checkin = false;
    }

    @Override
    protected void finalize(){
        System.out.println(name + " finalize called");
        if(checkin == false) {
            System.out.println(name + " is cleanup");
            try {
                super.finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
}
public class CH1_3_Q5 {
    public static void main(String[] args) {
        Book harryPotter = new Book("harryPotter");
        harryPotter.checkout();
        harryPotter = null;
        System.gc();
        //System.gc() only "suggest" GC we have no more using object reference, so you must clean somewhere else not
        //in the finalize()
    }
}
