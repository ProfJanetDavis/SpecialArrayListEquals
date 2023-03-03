import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class STest {

    @Test
    public void testIsPermutation_emptyLists_true() {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        boolean result = S.isPermutation(a1, a2);

        assertTrue(result);
    }

    @Test
    public void testIsPermutation_sameElementsDifferentOrder_true() {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(3, 2, 1));

        boolean result = S.isPermutation(a1, a2);

        assertTrue(result);
    }

    @Test
    public void testIsPermutation_differentElements_false() {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        boolean result = S.isPermutation(a1, a2);

        assertFalse(result);
    }

    @Test
    public void testIsPermutation_oneDifferentElement_false() {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(3, 2, 4));

        boolean result = S.isPermutation(a1, a2);

        assertFalse(result);
    }

    @Test
    public void testIsPermutation_sameElementsSameOrder_true() {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        boolean result = S.isPermutation(a1, a2);

        assertTrue(result);
    }

    @Test
    public void testIsPermutation_duplicateElements_true() {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3, 3));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(3, 3, 2, 1));

        boolean result = S.isPermutation(a1, a2);

        assertTrue(result);
    }

    @Test
    public void testIsPermutation_duplicateElements_false() {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3, 3));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(3, 2, 1));

        boolean result = S.isPermutation(a1, a2);

        assertFalse(result);
    }

    @Test
    public void testIsPermutation_differentLengths_false() {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(3, 2));

        boolean result = S.isPermutation(a1, a2);

        assertFalse(result);
    }

    @Test
    public void testIsPermutation_differentLengths2_false() {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(3, 2, 1));

        boolean result = S.isPermutation(a1, a2);

        assertFalse(result);
    }

    @Test
    public void testIsPermutation_testsEveryElement() {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1, 3));

        boolean result = S.isPermutation(a1, a2);

        assertFalse(result);
    }
    @Test
    public void testIsPermutation_identity() {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2));
        boolean result = S.isPermutation(a1, a1);
        assertTrue(result);
    }

}