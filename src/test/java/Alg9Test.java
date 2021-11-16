import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Alg9Test {
    @Test
    void check() {
        Assertions.assertEquals(1009, Alg9.getNumber(100));
        Assertions.assertEquals(992, Alg9.getNumber(99));
        Assertions.assertEquals(190, Alg9.getNumber(19));

    }
}
