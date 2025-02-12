package problems.listinterface;

import java.util.ListIterator;
import java.util.LinkedList;
import java.util.List;

public class GetElementInLinkedList {
    public static void main(String[] args) {
        List<Character> ll = new LinkedList<>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('D');
        ll.add('E');
//        ListIterator<Character> it = ll.listIterator(ll.size()-1);
        int n=4;
        int i=0;
        var first = ll.iterator();
        var second = ll.iterator();
        while(i<n && first.hasNext()){
            first.next();
            i=i+1;
        }
        if(i<n){
            System.out.println("given value of n is greater than list size : ");
            return ;
        }
        while(first.hasNext()){
            first.next();
            second.next();
        }
        System.out.println(second.next());

    }
}
