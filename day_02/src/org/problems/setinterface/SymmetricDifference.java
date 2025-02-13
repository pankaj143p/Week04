package org.problems.setinterface;

import java.util.Arrays;
import java.util.HashSet;

public class SymmetricDifference {
    public static void symmetricDiff(HashSet<Integer> hs1, HashSet<Integer>hs2){
        HashSet<Integer>sd = new HashSet<>();
        sd.addAll(hs1);
        for(int ii : hs2){
            if(sd.contains(ii)){
                sd.remove(ii);
            }else{
                sd.add(ii);
            }
        }
//        interSection.retainAll(hs2);
        System.out.println("Symmetric Difference "+sd);

    }
    public static void main(String[] args) {
        Integer arr1[] = {1,2,3};
        Integer arr2[] = {3,4,5};
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        hs1.addAll(Arrays.asList(arr1));
        hs2.addAll(Arrays.asList(arr2));
        symmetricDiff(hs1, hs2);
    }
}
