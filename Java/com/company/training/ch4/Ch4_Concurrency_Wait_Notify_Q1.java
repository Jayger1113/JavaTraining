package com.company.training.ch4;


public class Ch4_Concurrency_Wait_Notify_Q1 {
    final static Object lock = new Object();

    class Manager extends Thread{

        Worker worker = new Worker();
        private int task = 10;

        class Worker extends Thread{
            @Override
            public void run(){
                while(true){
                    synchronized(lock) {
                        if (task <= 7 && task > 3) {
                            System.out.println("Worker get task from manager = " + task);
                            task -- ;
                        }else if (task == 3){
                            lock.notify();//hang over to manager to finish
                            break;
                        }else{
                            continue;
                        }
                    }
                }
                System.out.println("worker finish his job");
            }
        }

        @Override
        public void run(){
            worker.start();
            while(true) {
                if(task == 0) break;
                synchronized (lock) {
                    if (task == 7) {
                        try {
                            System.out.println("Manager take a break, Worker will take the rest of task");
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        System.out.println("Manager get task = " + task);
                        task--;
                    }
                }
            }
            System.out.println("Manager finish his task");
        }
    }
    public static void main(String[] args) {
        new Ch4_Concurrency_Wait_Notify_Q1().new Manager().start();
    }
}
