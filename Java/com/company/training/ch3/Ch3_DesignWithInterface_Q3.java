package com.company.training.ch3;


/*class Light{
    public void on(){
        System.out.println("Light is on");
    }
    public void off(){
        System.out.println("Light is on");
    }
}
public class Ch3_DesignWithInterface_Q3 {

    public static void TurnPowerOnAndOff(Light light){
        light.on();
        light.off();
    }

    public static void main(String[] args) {
        TurnPowerOnAndOff(new Light());
    }
}*/

//Redesign using interface, we have more scalability if someday we need to add new feature.
interface Power {
    public void on();
    public void off();
}

class Light implements Power{
    public void on(){
        System.out.println("Light is on");
    }
    public void off(){
        System.out.println("Light is off");
    }
}
public class Ch3_DesignWithInterface_Q3 {

    public static void TurnPowerOnAndOff(Power power){
        power.on();
        power.off();
    }

    public static void main(String[] args) {
        TurnPowerOnAndOff(new Light());
    }
}
