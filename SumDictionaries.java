
import java.util.*;

public class SumDictionaries {

    public static int[] sumDictionaries(HashMap<Integer, Integer> d1, HashMap<Integer, Integer> d2) {

        // Find maximum index
        int maxIndex = 0;
        for (int key : d1.keySet()) {
            maxIndex = Math.max(maxIndex, key);
        }
        for (int key : d2.keySet()) {
            maxIndex = Math.max(maxIndex, key);
        }

        int[] result = new int[maxIndex + 1];

        for (int i = 0; i <= maxIndex; i++) {
            int val1 = d1.getOrDefault(i, 0);
            int val2 = d2.getOrDefault(i, 0);

            result[i] = val1 + val2;
        }

        return result; // return result here of the process 
    }

    public static void main(String[] args) {

        HashMap<Integer, Integer> dict1 = new HashMap<>();
        HashMap<Integer, Integer> dict2 = new HashMap<>();

        dict1.put(0, 2);
        dict1.put(1, 3);
        dict1.put(2, 4);

        dict2.put(1, 5);
        dict2.put(2, 6);
        dict2.put(3, 7);

        int[] result = sumDictionaries(dict1, dict2);

        System.out.println(Arrays.toString(result));
    }
}