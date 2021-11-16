import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Alg7Test {
    @Test
    void check() {
        int[] array = new int[]{6, 1, 3, 3, 3, 6, 6, 1, 1, 21};
        Assertions.assertEquals(21, Alg7.calculate(array));
    }

    @Test
    void exceptionTest() {
        int[] array2 = new int[]{6, 1, 3, 3, 3, 6, 6, 1, 1};
        Throwable exception = Assertions.assertThrows(Exception.class, ()-> Alg7.calculate(array2));
    }
}
