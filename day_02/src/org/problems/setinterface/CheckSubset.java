package org.problems.setinterface;

import java.util.Arrays;
import java.util.HashSet;

public class CheckSubset {
    public static boolean isSubset(HashSet<Integer> s1, HashSet<Integer>s2){
        int size=s2.size();
        s2.addAll(s1);
        return size==s2.size();
    }

    public static void main(String[] args) {
        Integer arr1[] = {3,2};
        Integer arr2[] = {3,4,2,3,6,2};
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        hs1.addAll(Arrays.asList(arr1));
        hs2.addAll(Arrays.asList(arr2));
        System.out.println(isSubset(hs1, hs2) ? "Subset contains" : "not a subset");
    }
}
