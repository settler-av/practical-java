package PART_I_Basics.II_Strings;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
 *
 * @author Adnan Vahora 20CE155.
 */

// TODO: 03-09-2021 Show Mobile Number specifications i.e in which region the number is from
@SuppressWarnings("SpellCheckingInspection")
public class StringDemo {

    /**
     * PART_II_OOP.II_to_IV_banking.PART_III_package_N_interfaces.II_interfaces.Main Function
     *
     * @param args cli arguments
     */
    public static void main(String[] args) {
        //Enter the input from user side
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Mobile number : ");
        String mobileNumber = in.nextLine();
        boolean result = validateNumber(mobileNumber);
        if (result) {
            System.out.println("YOu have entered correct Mobile number");
        } else System.out.println("Incorrect Number");



    }

    /**
     * Function to validate Mobile number.
     *
     * @param Number Number entered by user
     * @return boolean : whether the number is valid or not.
     */
    public static boolean validateNumber(@NotNull String Number) {
        if (Number.startsWith("+")) {
            String[] splitNumber = Number.split("-", 4);
            if ((splitNumber[0].length() == 3) && splitNumber[0].contentEquals("+91")) {
                if ((splitNumber[1].length() == 2) && onlyDigits(splitNumber[1])) {
                    System.out.println("Mobile system operator code is " + splitNumber[1]);
                    if ((splitNumber[2].length() == 3) && onlyDigits(splitNumber[2])) {
                        System.out.println("MSC is " + splitNumber[2]);
                        if ((splitNumber[3].length() == 5) && onlyDigits(splitNumber[3])) {
                            System.out.println("Unique code is " + splitNumber[3]);
                            return true;
                        } else {
                            //for "CCCCC"
                            System.out.println("Sequence \"CCCCC\" has not entered correctly");
                        }
                    } else {
                        //for "BBB"
                        System.out.println("Sequence \"BBB\" has not entered correctly");
                    }
                } else {
                    //for "AA"
                    System.out.println("Sequence \"AA\" has not entered correctly");
                }
            } else {
                //for "+91"
                System.out.println("Not an Indian number");
            }
        } else {
            System.out.println("You have Entered the number in wrong format\nError : Missing \"+\"");
        }
        return false;
    }

    public static boolean
    onlyDigits(String str) {
        // Regex to check string
        // contains only digits
        String regex = "[0-9]+";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }

        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }
}
