import java.util.Arrays;
import java.util.Random;

public class Alg10 {
    /*
Problem 45
This problem was asked by Two Sigma.

Using a function rand5() that returns an integer from 1 to 5 (inclusive) with uniform probability, implement a function rand7() that returns an integer from 1 to 7 (inclusive).
     */
    private static Random random = new Random();

    public static int rand5() {

        return random.nextInt(5) + 1;
    }

    public static int rand7() {
        int result = rand5() * 5 + rand5() - 5;
        if (result < 22) {
            return result % 7 + 1;
        }
        return rand7();
    }




}
