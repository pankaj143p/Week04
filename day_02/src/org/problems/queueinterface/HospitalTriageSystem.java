package org.problems.queueinterface;
import java.util.Collections;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    String name;
    int priority;

    public Pair(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(this.priority, other.priority);
    }

}

public class HospitalTriageSystem{
    public static void arrangeBasedPriority(PriorityQueue<Pair>pq){
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            System.out.print(p.name+" ");
            System.out.print(p.priority+" ");
            System.out.println();

        }
        System.out.println();
    }

    public static void main(String[] args) {
      PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
      pq.offer(new Pair("John", 3));
      pq.offer(new Pair("Alice", 5));
      pq.offer(new Pair("Bob",2));
      arrangeBasedPriority(pq);
    }
}
