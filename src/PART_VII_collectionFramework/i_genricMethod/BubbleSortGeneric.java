package PART_VII_collectionFramework.i_genricMethod;

public class BubbleSortGeneric <T extends Comparable<? super T>>{
    //will use this to store the array
    T[] array;

    public BubbleSortGeneric(T[] array) {
        this.array = array;
    }
    //this is the main sorting algorithm
    private T[] BubbleSort(){
        // TODO: 13-10-2021 Write a bubble sort algorithm
        return array;
    }


}

//class test{
//    // generic method printArray
//    // TODO: 12-10-2021 write sort method for this program
//    public static sort()
//
//
//
//    public static void main(String[] args) {
//
//// Create arrays of Integer, Double and Character
//        Integer[] intArray = {6, 2, 3, 4, 5};
//        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
//        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
//
//        System.out.println("Array integerArray contains:");
//        printArray(intArray); // pass an Integer array
//
//        System.out.println("\nArray doubleArray contains:");
//        printArray(doubleArray); // pass a Double array
//
//        System.out.println("\nArray characterArray contains:");
//        printArray(charArray); // pass a Character array
//    }
//}
