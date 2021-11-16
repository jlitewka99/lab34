import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Alg7 {
    /*
    Problem 40
This problem was asked by Google.

Given an array of integers where every integer occurs three times except for one integer, which only occurs once, find and return the non-duplicated integer.

For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.

Do this in $O(N)$ time and $O(1)$ space.
     */
    private static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static int calculate(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int key : array) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return getKeyByValue(map, 1);
    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 1, 3, 3, 3, 6, 6, 1, 1, 21};
        int[] array2 = new int[]{6, 1, 3, 3, 3, 6, 6, 1, 1};

        System.out.println(calculate(array));
//        System.out.println(calculate(array2));

    }
}
