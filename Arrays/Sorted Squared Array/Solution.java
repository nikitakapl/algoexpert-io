import java.util.*;

class Program {

    public int[] sortedSquaredArray(int[] array) {
        for (int idx = 0; idx < array.length; idx++) {
            array[idx] = array[idx] * array[idx];
        }
        Arrays.sort(array);
        return array;
    }
}
