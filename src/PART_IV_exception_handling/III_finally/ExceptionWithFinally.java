package PART_IV_exception_handling.III_finally;

import static java.lang.System.exit;

public class ExceptionWithFinally {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3,0, 0, 5};
        int exceptionCounter = 0;
        while(true){
            try{
                int indexNum = (int) (Math.random()*10);
                int indexDen = (int) (Math.random()*10);
                System.out.println("index of :: Numerator : "+ indexNum + " Denominator : " + indexDen);
                int numerator = array[indexNum];
                int denominator = array[indexDen];
                System.out.println("\tNumerator/Denominator = "+ numerator + "/" + denominator );
                int result = numerator/denominator;

            }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
                exceptionCounter++;
                System.out.println(e);
            } finally {
                if(exceptionCounter > 10){
                    System.out.println("By 20CE155 ADnAN Vahora\n");
                    exit(0);
                }
                System.out.println("Exception counter = "+exceptionCounter + "\n");
            }
        }
    }

}
