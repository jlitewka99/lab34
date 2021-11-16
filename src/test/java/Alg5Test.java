import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Alg5Test {
    @Test
    void check() {
        Assertions.assertEquals("4A3B2C1D2A", Alg5.encode("AAAABBBCCDAA"));
    }
}
