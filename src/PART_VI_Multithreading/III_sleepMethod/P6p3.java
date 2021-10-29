package PART_VI_Multithreading.III_sleepMethod;

import java.util.*;
class Increment extends Thread{
    int n;
    Increment(int n)
    {

        this.n=n;

    }
    public void run()
    {

        try{
            Thread.sleep(1000);
            System.out.println("incremented by : "+ (n+1) );
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted THREAD");
        }
    }
}

public class P6p3 {
    public static void main(String args[]){
        int n1;
        System.out.println("enter number to be incremented by 1 :");

        Scanner sc=new Scanner(System.in);

        n1=sc.nextInt();
        Increment t1=new Increment(n1);
        t1.start();
    }

}
