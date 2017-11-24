package com.company.training.ch2;

class NoteBook{
    private static String name = "General NoteBook";
    protected int BOOT_COMPLETE_TIME = 30;
    protected void boot(){
        System.out.println(name + " boot time spent = " +BOOT_COMPLETE_TIME);
    }
}

class MacBook extends NoteBook{
    private static String name = "MacBook";
    private int BOOT_COMPLETE_TIME = 5;
    protected void boot(){
        System.out.println(name+ " boot time spent = " +BOOT_COMPLETE_TIME);
    }
    public void fastBoot(){
        System.out.println(name+ " boot time spent = " +BOOT_COMPLETE_TIME);
    }
}

public class Ch2_4_Q6 {
    public static void main(String[] args) {
        NoteBook macBook = new MacBook();
        macBook.boot();
        ((NoteBook) macBook).boot();
        //macBook.fastBoot();
        /*After you upCasting object reference, remember to downCasting if you want to call derived class custom function
        ((MacBook)macBook).fastBoot();*/
    }
}
