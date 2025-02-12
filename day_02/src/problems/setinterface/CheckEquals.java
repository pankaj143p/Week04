package problems.setinterface;

import java.util.Arrays;
import java.util.HashSet;

public class CheckEquals {
    public static void main(String[] args) {
        Integer arr1[] = {2,3,4,6,3,2};
        Integer arr2[] = {3,4,2,3,6,2};
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        hs1.addAll(Arrays.asList(arr1));
        hs2.addAll(Arrays.asList(arr2));
        System.out.println();

    }
}
