package problems.setinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.List;


public class SetToSortedList {
    public static void sortSet(HashSet<Integer> hs){
        Set<Integer>ss = new TreeSet<>();
        ss.addAll(hs);
        List<Integer> li = new ArrayList<>();
        for(int ii : ss){
           li.add(ii);
        }
        for(int ii : li){
            System.out.print(ii+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Integer arr[] = {5,3,9,11,0,-2};
        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(Arrays.asList(arr));
        sortSet(hs);
    }
}
