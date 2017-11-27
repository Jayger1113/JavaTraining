package com.company.training.ch1;


class Cars{
    static Car staticCar1;
    static Car staticCar2;

    Car car1;
    Car car2;

    {
        car1 = new Car(1);
        car2 = new Car(2);
        System.out.println("Cars non-static initialized block completed");
    }

    static{
        staticCar1 = new Car(1);
        staticCar2 = new Car(2);
        System.out.println("Cars static initialized block completed");
    }

    Cars(){
        System.out.println("Cars constructor completed");
    }
}

class Car {
    Car(int maker){
        System.out.println("car "+ maker+ " completed");
    }
    void factory(int maker){
        System.out.println("car factory "+ maker+ " completed");
    }
}

public class CH1_Class_Object_initialize_finalize_Q4 {
    public static void main(String[] args) {
        Cars.staticCar1.factory(1);
        Cars carMakers = new Cars();
    }
}
