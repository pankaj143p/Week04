package problems.listinterface;

import java.util.LinkedList;
import java.util.ArrayList;

public class ReverseList {
    public static void reverseLinkedList(LinkedList<Integer> ll ){
        int i=0;

        while(i<ll.size()/2){
            int temp=ll.get(i);
            ll.set(i,ll.get(ll.size()-1-i));
            ll.set(ll.size()-1-i,temp);
            i++;
        }
    }

    public static void reverseArrayList(ArrayList<Integer> ll ){
        int i=0,j=0;
        for(i=0,j=ll.size()-1; i<j; i++){
            ll.add(i,ll.remove(j));
        }
    }
    public static void printLinkedList(LinkedList<Integer>ll){
        for(int ii : ll){
            System.out.print(ii+" ");
        }
        System.out.println();
    }

    public static void printArrayList(ArrayList<Integer>ll){
        for(int ii : ll){
            System.out.print(ii+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(5);
        ll.add(8);
        ll.add(6);
        ll.add(12);
        reverseLinkedList(ll);
        printLinkedList(ll);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(8);
        al.add(6);
        al.add(12);
        reverseArrayList(al);
        printArrayList(al);
    }
}

