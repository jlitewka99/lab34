import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alg1Test {
    @Test
    void notPossible1() {
        List<Integer> lista = new ArrayList<>(Arrays.asList(12, 23, 34, 543, 645, 746, 2, 4));
        Assertions.assertEquals(false, Alg1.checkIf(lista, 5));
    }

    @Test
    void notPossible2() {
        List<Integer> lista = new ArrayList<>(Arrays.asList(12, 23, 34, 543, 645, 746, 2, 4));
        Assertions.assertFalse( Alg1.checkIf(lista, 5000));
    }

    @Test
    void possible1() {
        List<Integer> lista = new ArrayList<>(Arrays.asList(12, 23, 34, 543, 645, 746, 2, 4));
        Assertions.assertEquals(true, Alg1.checkIf(lista, 555));
    }

    @Test
    void possible2() {
        List<Integer> lista = new ArrayList<>(Arrays.asList(12, 23, 34, 543, 645, 746, 2, 4));
        Assertions.assertTrue(Alg1.checkIf(lista, 6));
    }
}
