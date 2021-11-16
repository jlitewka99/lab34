import java.util.*;

public class Alg1 { //algorithm 1

    /*
    Given a list of numbers, return whether any two sums to k.
    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

    Bonus: Can you do this in one pass?
     */

    public static boolean checkIf(List<Integer> lista, int k) {

        Set<Integer> listaMozliwych = new HashSet<>();

        for (int i = 0; i < lista.size(); i++) {
            if (listaMozliwych.contains(lista.get(i))) {
                return true;
            }
            listaMozliwych.add(k - lista.get(i));
        }


        return false;
    }

    public static void main(String[] args) {

    }
}
