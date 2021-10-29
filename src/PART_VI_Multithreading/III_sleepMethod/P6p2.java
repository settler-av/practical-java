package PART_VI_Multithreading.III_sleepMethod;

import java.util.Random;
public class P6p2 {
    public static void main(String args[]) {
        int[] num = new int[15];

        System.out.println("Random Number Array...");

        for (int i = 0; i < num.length; i++) {
            num[i] = new Random().nextInt(100);
        }
        new Odd(num);
        new Even(num);
    }
}

class Even extends Thread {
    int num[];
    Even(int num[]) {
        this.num = num;
        start();
    }
    public void run() {
        for (int j = 0; j < num.length; j++) {
            if (j % 2 == 0) {
                System.out.println("num[" + j + "]" + "\t" + "Thread2 :" + num[j]);
            }
        }
    }
}

class Odd extends Thread {
    int num[];
    Odd(int num[]) {
        this.num = num;
        start();
    }
    public void run() {
        for (int j = 0; j < num.length; j++) {
            if (j % 2 != 0) {
                System.out.println("num[" + j + "]" + "\t" + "Thread1 :" + num[j]);

            }
        }

    }
}

