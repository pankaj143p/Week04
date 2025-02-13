package org.problems.mapinterface;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordFrequencyCounter {
    public static void frequencyCount(String s){
        Map<String, Integer> hm = new HashMap<>();
        String str=s.toLowerCase();
        String temp="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ' || (str.charAt(i)>='a' && str.charAt(i)<='z')){
                temp=temp+str.charAt(i);
            }
        }
//        System.out.println(temp);
        String arr[] = temp.split(" "); ;
        for(String st : arr){
            hm.put(st,hm.getOrDefault(st,0)+1);
        }
        System.out.println(hm+" ");

    }
    public static void main(String[] args) throws IOException{
            Path fileName
                    = Path.of("day_02/words.txt");
            String str = Files.readString(fileName);
            frequencyCount(str);
        }
    }
