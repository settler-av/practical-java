import java.util.Scanner;

/**
 * A typical mobile number in India is “+91-AA-BBB-CCCCC”. Where the first two digits (AA)
 * indicate a mobile system operator, the next three (BBB) denote the mobile switching code
 * (MSC) while the remaining five digits (CCCCC) are unique to the subscriber. Write an
 * application that takes a mobile number as an input from a user in above-mentioned format
 * and display code for mobile system operator, mobile switching code and last 5 digits which
 * are unique to subscriber.
 * Ex. For an input +91-94-999-65789, output should be :
 * Mobile system operator code is 94
 * MSC is 999
 * Unique code is 65789
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html for reference
 *
 * @author Adnan Vahora 20CE155.
 */


public class StringDemo {

    /**
     * Main Function
     * @param args
     */
    public static void main(String[] args) {
        //Enter the input from user side
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Mobile number : ");
        String mobileNumber = in.nextLine();

    }

    /**
     * Function to validate Mobile number.
     * @param Number Number entered by user
     * @return boolean : whether the number is valid or not.
     */
    public static boolean validateNumber(String Number){
        if(Number.startsWith("+"))
        {
            String[] splitNumber = Number.split("-",4);
            if ((splitNumber[1].length() == 2) && (splitNumber[0].contains()) )
        }
        else{
            System.out.println("You haven't Entered the number in wrong format\nError : Missing \"+\"");
            return false;
        }
    }
}
