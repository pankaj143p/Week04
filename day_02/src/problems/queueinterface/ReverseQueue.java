package problems.queueinterface;

import java.util.*;

public class ReverseQueue {
    public static void reverse(Queue<Integer>q){
       if(q.isEmpty()){
           return ;
       }
       int peek = q.poll();
       reverse(q);
       q.offer(peek);
    }

    public static void main(String[] args) {
        Integer arr[] = {10,20,30};
        Queue<Integer>q = new LinkedList<>(Arrays.asList(arr));
        reverse( q);
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
        System.out.println();
    }
}
