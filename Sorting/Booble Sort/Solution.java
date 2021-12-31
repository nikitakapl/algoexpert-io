import java.util.*;

// Write a function that takes in an array of integers and returns a sorted
// version of that array. Use the Bubble Sort algorithm to sort the array.

class Program {
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int isSortedCounter = 0;

        while (!isSorted) {
            isSorted = true;
            for (int counter = 0; counter < array.length - 1 - isSortedCounter; counter++) {
                if (array[counter] > array[counter + 1]) {
                    array[counter] = array[counter] ^ array[counter + 1];
                    array[counter + 1] = array[counter + 1] ^ array[counter];
                    array[counter] = array[counter] ^ array[counter + 1];
                    isSorted = false;
                }
            }
            isSortedCounter ++;
        }
        return array;
    }
}