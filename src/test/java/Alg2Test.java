import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alg2Test {
    @Test
    void checkNormalArray() {
        List<Long> result = new ArrayList<>(Arrays.asList(120L, 60L, 40L, 30L, 24L));

        Assertions.assertEquals(result, Alg2.calculate(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
    }
    @Test
    void checkZeroInArray() {
        List<Long> result = new ArrayList<>(Arrays.asList(0L, 0L, 40L, 0L, 0L));

        Assertions.assertEquals(result, Alg2.calculate(new ArrayList<>(Arrays.asList(1, 2, 0, 4, 5))));
    }
    @Test
    void zerosArray() {
        List<Long> result = new ArrayList<>(Arrays.asList(0L, 0L, 00L, 0L, 0L));

        Assertions.assertEquals(result, Alg2.calculate(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0))));
    }
}
