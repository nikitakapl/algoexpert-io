import java.util.*;

// Write a function that takes in a non-empty array of integers that are sorted
// in ascending order and returns a new array of the same length with the squares
// of the original integers also sorted in ascending order.

class Program {

    public int[] sortedSquaredArray(int[] array) {
        for (int idx = 0; idx < array.length; idx++) {
            array[idx] = array[idx] * array[idx];
        }
        Arrays.sort(array);
        return array;
    }
}
