package org.problems.setinterface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckEqualsTest {

    @Test
    public void testCheckHashSetsEquality() {
        Integer[] arr1 = {2, 3, 4, 6, 3, 2};
        Integer[] arr2 = {3, 4, 2, 3, 6, 2};
        assertEquals("Equals", CheckEquals.checkHashSetsEquality(arr1, arr2));
    }

    @Test
    public void testCheckHashSetsSizeEquality() {
        Integer[] arr1 = {2, 3, 4, 6, 3, 2};
        Integer[] arr2 = {3, 4, 2, 3, 6, 2};
        assertEquals("Equals", CheckEquals.checkHashSetsSizeEquality(arr1, arr2));

        // Different case to test the "not Equals"
        Integer[] arr3 = {1, 2, 3};
        Integer[] arr4 = {3, 2, 1, 4};
        assertEquals("not Equals", CheckEquals.checkHashSetsSizeEquality(arr3, arr4));
    }
}
