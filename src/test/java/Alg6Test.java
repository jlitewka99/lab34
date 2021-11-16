import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Alg6Test {
    @Test
    void check() {
        Assertions.assertFalse(Alg6.check("(([(]]))"));
        Assertions.assertFalse(Alg6.check("(([(])]))"));
        Assertions.assertTrue(Alg6.check("([(()())])"));
    }
}
