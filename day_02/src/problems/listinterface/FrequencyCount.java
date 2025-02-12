package problems.listinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class FrequencyCount {
    public static void main(String[] args) {
      HashMap<String, Integer> hm = new HashMap<>();
      String arr[] = {"apple", "banana", "apple", "orange", "banana", "apple"};
      List<String> li=Arrays.asList(arr);
      for(String str : li){
          hm.put(str, hm.getOrDefault(str,0)+1);
      }
        System.out.println("HashMap --> "+hm);
    }
}
