package com.company.training.ch4;

public class Ch4_Concurrency_Synchronized_Q1 {
    class Master extends Thread{
        @Override
        public void run(){
            new Work1().start();
            new Work2().start();
        }
    }
    class Work1 extends Thread{
        private int taskNumber = 5;
        @Override
        public void run(){
            synchronized (Ch4_Concurrency_Synchronized_Q1.class) {
                while(taskNumber != 0){
                    System.out.println(Work1.class.getSimpleName()+ " taskNumber = " + taskNumber);
                    taskNumber -- ;
                }
                System.out.println(Work1.class.getSimpleName()+ " task finish ");
            }
        }
    }
    class Work2 extends Thread{
        private int taskNumber = 5;
        @Override
        public void run(){
            synchronized (Ch4_Concurrency_Synchronized_Q1.class) {
                while(taskNumber != 0){
                    System.out.println(Work2.class.getSimpleName()+ " taskNumber = " + taskNumber);
                    taskNumber -- ;
                }
                System.out.println(Work2.class.getSimpleName()+ " task finish ");
            }
        }
    }
    public static void main(String[] args) {
        Ch4_Concurrency_Synchronized_Q1 instance = new Ch4_Concurrency_Synchronized_Q1();
        instance.new Master().start();
    }
}
