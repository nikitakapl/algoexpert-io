import java.util.*;

class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        if (sequence.size() > array.size()) {
            return false;
        }

        int itemLastIndex = 0;
        for (int item: sequence) {
            if (!array.contains(item) || array.indexOf(item) < itemLastIndex) { return false; }
            itemLastIndex = array.indexOf(item);
            array.remove(Integer.valueOf(item));
        }

        return true;
    }
}