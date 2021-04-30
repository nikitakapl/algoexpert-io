import java.util.*;

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