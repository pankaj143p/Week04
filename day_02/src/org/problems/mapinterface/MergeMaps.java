package org.problems.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

    public static void mergeTwoMaps(HashMap<Character, Integer> hm1, HashMap<Character, Integer>hm2){
        for(Map.Entry<Character,Integer> itr : hm2.entrySet()){
            int val=itr.getValue();
            char key=itr.getKey();
            if(hm1.containsKey(key)){
                hm1.put(key, val+hm1.get(key)+1);
            }else{
                hm1.put(key,val);
            }
        }
        System.out.println(hm1);

    }
    public static void main(String[] args) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        hm1.put('A', 1);
        hm1.put('B', 2);
        hm1.put('C', 1);
        hm2.put('B',3);
        hm2.put('C', 4);
        mergeTwoMaps(hm1,hm2);
    }
}
