package org.problems.mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InvertMap {
    public static void invertMap(HashMap<Character, Integer>hm){
        HashMap<Integer, List<Character>> inverthm=new HashMap<>();
        int cap=hm.size();
        int i=1;
//        for(int j=1; j<=cap; j++){
//            inverthm.put(j,new ArrayList<Character>());
//        }
        for(Map.Entry<Character, Integer> it : hm.entrySet()){
            char key = it.getKey();
            int val = it.getValue();
            inverthm.computeIfAbsent(val,k-> new ArrayList<>()).add(key);
        }
        System.out.println(inverthm);

    }
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('A', 1);
        hm.put('B', 2);
        hm.put('C', 1);
        invertMap(hm);
    }
}
