package PART_IV_exception_handling.I_typesOfException;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * WAP to show the try - catch block to catch the different types of exception
 * @author Adnan Vahora
 */
public class exceptionDemo {
    public static void main(String[] args){

        //Arithmetic Exception
        try {
            System.out.println("1. ArithmeticException");
            int i = 100;
            int j = 0;
            int a = i/j;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        //IOException
        FileReader myfile = null;
        try {
            System.out.println("2. FileNotFoundException");
            myfile = new FileReader("test.txt");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        //Outbounds
        try {
            System.out.println("3. ArrayIndexOutOfBoundsException");
            int a[] = {1,2,3};
            int b = 5;
            System.out.println(a[b]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        //Null pointer exception
        try {
            System.out.println("4. Null pointer exception");
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println(e);
        }

        //Number format exception
        try {
            // "adnan" is not a number
            int num = Integer.parseInt ("adnan") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println(e);
        }

    }
}
