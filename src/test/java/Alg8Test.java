import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Alg8Test {
    @Test
    void check5x4() {
        List<Integer> right = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12);
        int[][] array = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};

        Assertions.assertEquals(right, Alg8.clockWise(array));

    }

    @Test
    void check2x2() {
        int[][] array = new int[][]{
                {1, 2},
                {6, 7}};
        List<Integer> right = Arrays.asList(1, 2, 7, 6);
        Assertions.assertEquals(right, Alg8.clockWise(array));
    }
}
