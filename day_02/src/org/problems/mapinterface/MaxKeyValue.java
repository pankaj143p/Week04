package org.problems.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MaxKeyValue {
    public static char maxKeyValue(HashMap<Character, Integer> hm){
        int mxVal = Integer.MIN_VALUE;
        char maxValueKey='0';
        for(Map.Entry<Character, Integer> it : hm.entrySet()){
            char key = it.getKey();
            int val = it.getValue();
            if(val>mxVal){
                mxVal=val;
                maxValueKey=key;
            }
        }
        return maxValueKey;

    }
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('A', 10);
        hm.put('B', 20);
        hm.put('C', 15);
        System.out.println(maxKeyValue(hm));
    }
}
