package problems.setinterface;

import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersection {
    public static void unionAndIntersection(HashSet<Integer>hs1, HashSet<Integer>hs2){
        HashSet<Integer>interSection = new HashSet<>();
        HashSet<Integer>union = new HashSet<>(hs1);
        interSection.addAll(hs1);
        interSection.retainAll(hs2);
        System.out.println("Interction "+interSection);
        union.addAll(hs2);
        System.out.println("Union "+union);
    }
    public static void main(String[] args) {
        Integer arr1[] = {1,2,3};
        Integer arr2[] = {3,4,5};
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        hs1.addAll(Arrays.asList(arr1));
        hs2.addAll(Arrays.asList(arr2));
        unionAndIntersection(hs1, hs2);
    }
}
