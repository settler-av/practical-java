package PART_I_Basics.III_digitCompare;

public class DigitCompare {
    //         TODO: 09-10-2021 Given two non-negative int values, return true if they have the same first digit, such as with 72 and 75.
    static boolean firstDigit(int firstNumber, int secondNumber) {
        String firstNum = Integer.toString(firstNumber);
        String secondNum = Integer.toString(secondNumber);
        return Character.toString(firstNum.charAt(0)).equals(Character.toString(secondNum.charAt(0)));
    }

    public static void main(String[] args) {
        int testNumber1 = 56;
        int testNumber2 = 5;
        int testNumber3 = 6;
        if(firstDigit(testNumber1,testNumber2)){
            System.out.println(testNumber1 + " and  "+ testNumber2 +" have same first digit");
        }else{
            System.out.println(testNumber1 + " and  "+ testNumber2 +" does not have same first digit");
        }
        if(firstDigit(testNumber1,testNumber3)){
            System.out.println(testNumber1 + " and  "+ testNumber3 +" have same first digit");
        }else{
            System.out.println(testNumber1 + " and  "+ testNumber3 +" does not have same first digit");
        }
    }
}
