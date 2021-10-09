package PART_VI_Multithreading.I_createTread;

/**
 * Write a program to create thread which display “Hello World” message.
 * (1). by extending Thread class
 * (2). by using Runnable interface.
 *
 * @author 20CE155 Adnan vahora
 */
public class HelloWorld{

    static class HelloWorldUsingInterfaces implements  Runnable{

        //We have to override this run method of Runnable interface
        @Override
        public void run() {
            System.out.println("Hello World from HelloWorldUsingInterfaces");
        }
    }

    static class HelloWorldUsingThreadClass extends Thread{
        @Override
        public void run() {
            System.out.println("Hello World from HelloWorldUsingThreadClass");
        }
    }

    public static void main(String[] args) {
        //Object of class that implements Runnable object
        HelloWorldUsingInterfaces threadUsingInterface = new HelloWorldUsingInterfaces();

        //object of Thread class that takes threadUsingInterface object as an argument
        Thread myThread = new Thread(threadUsingInterface);


        //This will start execution of thread with obj of HelloWorldUsingInterfaces
        myThread.start();

        //Object of class that extends Thread class
        myThread = new HelloWorldUsingThreadClass();

        //This will start execution of thread with obj of HelloWorldUsingThreadClass
        myThread.start();
    }


}
