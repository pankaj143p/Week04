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
        ListIterator<Character> it = ll.listIterator(ll.size()-1);
        int n=2;
        int i=0;
        n=n-1;
        char ch = ll.get(0);
        while(it.hasPrevious() && n>0){
            n--;
            it.previous();
        }
        System.out.println(it.next());

    }
}
