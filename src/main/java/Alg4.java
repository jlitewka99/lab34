import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alg4 {
    /*
    Problem 20
This problem was asked by Google.

Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.
     */

    public static int calculate(List<Integer> l1, List<Integer> l2) throws Exception {
        // M*N
        for (int i = 0; i < l1.size(); i++) {
            if (l2.contains(l1.get(i))) {
                return l2.get(i);
            }
        }
        throw new OwnExc("Wlasny wyjatek");

    }

}
