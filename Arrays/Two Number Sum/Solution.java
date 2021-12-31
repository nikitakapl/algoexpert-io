import java.util.*;

// Write a function that takes in a non-empty array of distinct integers and an
// integer representing a target sum. If any two numbers in the input array sum
// up to the target sum, the function should return them in an array, in any
// order. If no two numbers sum up to the target sum, the function should return
// an empty array.

class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int item : array) {
            for (int value : array) {
                if (item != value && item + value == targetSum) {
                    return new int[] {value, item};
                }
            }
        }
        return new int[0];
    }
}