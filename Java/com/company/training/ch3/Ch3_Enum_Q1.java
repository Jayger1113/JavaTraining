package com.company.training.ch3;

//public enum should be moving to a java file same as enum name
/*
public enum Activity {
    onCreate,onReStart,onStart,onResume,onPause,onStop,onDestroy
}
*/


class AndroidActivityLifeCycleDemo{
    enum Activity {
        onCreate,onStart,onResume,onPause,onStop,onDestroy
    }
    Activity mActivity = Activity.onCreate;
    public void changeLifeCycle(){
        switch(mActivity){
            case onCreate:
                System.out.println("Activity life cycle = " + mActivity);
                mActivity = Activity.onStart;
            break;
            case onStart:
                System.out.println("Activity life cycle = " + mActivity);
                mActivity = Activity.onResume;
                break;
            case onResume:
                System.out.println("Activity life cycle = " + mActivity);
                mActivity = Activity.onPause;
                break;
            case onPause:
                System.out.println("Activity life cycle = " + mActivity);
                mActivity = Activity.onStop;
                break;
            case onStop:
                System.out.println("Activity life cycle = " + mActivity);
                mActivity = Activity.onDestroy;
                break;
            case onDestroy:
                System.out.println("Activity life cycle = " + mActivity);
                mActivity = Activity.onCreate;
                break;
        }
    }
}

public class Ch3_Enum_Q1 {
    public static void main(String[] args) {
        int createActivityTime = 2;
        int oneCycle = AndroidActivityLifeCycleDemo.Activity.values().length;
        AndroidActivityLifeCycleDemo androidActivityLifeCycleDemo =new AndroidActivityLifeCycleDemo();
        for(int i =0;i < oneCycle * createActivityTime;i++ ){
            androidActivityLifeCycleDemo.changeLifeCycle();
        }
    }
}
