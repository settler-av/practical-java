import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 20CE155 ADNAN VAHORA
 * Write a program that counts the occurrences of words in a text and displays the words
 * and their occurrences in alphabetical order of the words. Using Map and Set Classes.
 */
public class AlphabeticSort {
    static HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

    public static void sortbykey() {
        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(wordMap);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                               ", Value = " + entry.getValue());
    }

    public static void main(String[] args) {
        //Making test key
        String testKey = "Alice is girl and Bob is boy";
        System.out.println("Test sentence: " + testKey);
        // Splitting the words of string
        // and storing them in the array.
        String[] arrOfStr = testKey.split(" ");

        System.out.println("Array without sorting: \n" + Arrays.toString(arrOfStr));

        //create hash map

        for (String word :
                arrOfStr) {

            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer integer = wordMap.get(word);

            //What is 'merge' method in hashmap?
            if (integer == null)
                // Storing the word as key and its
                // occurrence as value in the HashMap.
                wordMap.put(word, 1);

            else {
                // Incrementing the value if the word
                // is already present in the HashMap.
                wordMap.put(word, integer + 1);
            }
        }//end of for each
        System.out.println("`````````````````````````````````\nAfter storing it into hashmap\n");
        System.out.println(wordMap);

        System.out.println("```````````````````````````````````````````\n\n");
        System.out.println("After sorting; \n");
        // Calling the function to sortbyKey
        sortbykey();
        System.out.println("By 20CE155 ADNAN VAHORA");
    }//end of main
}//end of class
