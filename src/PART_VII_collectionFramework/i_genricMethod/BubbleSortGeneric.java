package PART_VII_collectionFramework.i_genricMethod;

import java.util.Arrays;

public class BubbleSortGeneric<T extends Comparable<? super T>> {
    //will use this to store the array
    //this is the main sorting algorithm
    public T[] BubbleSort(T[] array) {
        // TODO: 13-10-2021 Write a bubble sort algorithm
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0){
                    T temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

class test {
    public static void main(String[] args) {
        Integer[] intArray = {6, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 5.0, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Before sorting <Integer> : " + Arrays.toString(intArray));
        BubbleSortGeneric<Integer> integerObj = new BubbleSortGeneric<Integer>();
        Integer[] array = integerObj.BubbleSort(intArray);
        System.out.println("After sorting <Integer> : " + Arrays.toString(array));

        System.out.println("Before sorting <Double> : " + Arrays.toString(doubleArray));
        BubbleSortGeneric<Double> doubleObj = new BubbleSortGeneric<Double>();
        Double[] sortedDouble= doubleObj.BubbleSort(doubleArray);
        System.out.println("After sorting <Double> : " + Arrays.toString(sortedDouble));

        System.out.println("Before sorting <Character> : " + Arrays.toString(charArray));
        BubbleSortGeneric<Character> characterObj = new BubbleSortGeneric<Character>();
        Character[] sortedChar = characterObj.BubbleSort(charArray);
        System.out.println("After sorting <Character> : " + Arrays.toString(sortedChar));

        System.out.println("\nBy 20CE155 ADNAN VAHORA");
    }
}