package org.problems.listinterface;
import java.util.*;

public class RemoveDuplicateToMaintainOrder {
    public static void main(String[] args) {
         Integer arr[] = {3, 1, 2, 2, 3, 4};
         List<Integer> li = Arrays.asList(arr);
         List<Integer> ans = new ArrayList<>();
        for(int i=0; i<li.size(); i++){
           if(!ans.contains(li.get(i))){
               ans.add(li.get(i));
           }
        }
        for(int it : ans){
            System.out.print(it+" ");
        }
        System.out.println();
    }
}
