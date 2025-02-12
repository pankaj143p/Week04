package problems.queue;

import java.util.*;

public class ReverseQueue {
    public static void reverse(Deque<Integer>dq, Queue<Integer>q){
        while(!dq.isEmpty()){
            q.add(dq.pollLast());
        }
    }

    public static void main(String[] args) {
        Integer arr[] = {10,20,30};
        Queue<Integer>q = new LinkedList<>();
        Deque<Integer>dq = new ArrayDeque<>(Arrays.asList(arr));
        reverse(dq, q);
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
        System.out.println();
    }
}
