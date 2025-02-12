package problems.listinterface;

import java.util.List;
import java.util.ArrayList;


public class RotateList {
    public static void reverseListByRange(List<Integer> li, int l, int r){
//        int i=l;
        while(l<=r){
            int temp=li.get(l);
            li.set(l,li.get(r));
            li.set(r,temp);
            l++;
            r--;
        }
    }
    public static void printArrayList(List<Integer>ll){
        for(int ii : ll){
            System.out.print(ii+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        int k=2;
        k=k%al.size();
        reverseListByRange(al,0,al.size()-1);
        reverseListByRange(al,0,k-1);
        reverseListByRange(al, k, al.size()-1);
        printArrayList(al);
    }
}
