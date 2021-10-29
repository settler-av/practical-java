package PART_VII_collectionFramework.II_mapAndSet;

public class WordFrequency {
    public static void main(String[] args) {
        //write a program to find the frequency of each word in a sentence using map and set.
        String sentence = "This is a sentence. This is a sentence. This is a sentence.";
        String[] words = sentence.split(" ");
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        for (String word : words) {
            //about map.merge() this method will add the value to the map if the key is already present
            map.merge(word, 1, Integer::sum);
        }
        System.out.println(map);
    }
}
