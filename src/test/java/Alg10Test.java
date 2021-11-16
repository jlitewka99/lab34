import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Alg10Test {
    @Test
    void checkRandomness() {
        int n = 100000;
        int[] tab = new int[7];

        double[] percentage = new double[7];

        double idealPercentage = 1.0 / 7.0;
        System.out.println(idealPercentage);

        for (int i = 0; i < n; i++) {
            tab[Alg10.rand7() - 1]++;
        }
        for (int i = 0; i < 7; i++) {
            percentage[i] = tab[i] / (double)n;
            System.out.println(percentage[i]);
        }




    }
}
