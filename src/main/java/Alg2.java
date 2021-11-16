import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alg2 {

    /*
    This problem was asked by Uber.

Given an array of integers, return a new array such that
each element at index i of the new array is the product
of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected
output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1],
the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
     */

    private static Long multiplyList(List<Integer> lista){
        Long multiplied = 1L;
        for (int i = 0; i < lista.size(); i++) {
            multiplied *= lista.get(i);
        }
        return multiplied;
    }


    public static List<Long> calculate(List<Integer> lista) {
        List<Long> result = new ArrayList<>();

        Long multiplied = multiplyList(lista);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) != 0) {
                result.add(multiplied / lista.get(i));
            }else {
                List<Integer> temp = new ArrayList<>(lista);
                temp.remove(i);
                result.add(multiplyList(temp));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
    }
}
