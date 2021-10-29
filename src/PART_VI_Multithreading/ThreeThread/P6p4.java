package PART_VI_Multithreading.ThreeThread;


public class P6p4 extends Thread {
    public void run()
    {
        System.out.println("Created by : Adnan Vahora");
    }
    public static void main(String args[])
    {
        // creating one thread
        P6p4 FIRST=new P6p4();
        P6p4 SECOND=new P6p4();
        P6p4 THIRD=new P6p4();
        // set the priority
        FIRST.setPriority(3);
        SECOND.setPriority(Thread.NORM_PRIORITY);
        THIRD.setPriority(7);
        // print the user defined priority
        System.out.println("Priority of thread t1 is: " + FIRST.getPriority());
        System.out.println("Priority of thread t2 is: " + SECOND.getPriority());
        System.out.println("Priority of thread t3 is: " + THIRD.getPriority());
        // this will call the run() method
        FIRST.start();
    }

}


