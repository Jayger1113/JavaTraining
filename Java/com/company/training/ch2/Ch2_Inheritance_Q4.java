package com.company.training.ch2;


class Machine {
    private String name = Machine.class.getSimpleName();
    protected void working(){
        System.out.println(name+ " is working");
    }
}

class SlaveMachine extends Machine{
    String name = SlaveMachine.class.getSimpleName();
    //extended function can not downgrade the encapsulation
        /*private void working(){
        System.out.println(name + " is working");
    }*/
    //but you can upgrade it
    //Ex:
    /*public void working(){
        System.out.println(name + " is working");
    }*/
    public void working(){
        System.out.println(name + " is working");
    }
    void working(String node){
        System.out.println(name + " node " + node + " is working");
    }
}

public class Ch2_Inheritance_Q4 {
    public static void main(String[] args) {
        SlaveMachine slaveMachine = new SlaveMachine();
        slaveMachine.working();
        slaveMachine.working("1");
    }
}
