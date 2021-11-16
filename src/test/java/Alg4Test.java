import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alg4Test {
    @Test
    void shouldWork() throws Exception {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 9));

        Assertions.assertEquals(9, Alg4.calculate(l1, l2));
    }

    @Test
    void shouldThrowException() {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 0));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 9));

        Throwable exception = Assertions.assertThrows(Exception.class, ()->Alg4.calculate(l1, l2));
    }
}
