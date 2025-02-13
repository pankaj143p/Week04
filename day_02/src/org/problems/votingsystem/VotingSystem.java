package org.problems.votingsystem;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
 Description: Design a system where:
Votes are stored in a HashMap (Candidate -> Votes).
TreeMap is used to display the results in sorted order.
LinkedHashMap is used to maintain the order of votes.
 */

public class VotingSystem {
    private static HashMap<String, Integer> storeVotes = new HashMap<>();
    private static TreeMap<String, Integer> sortedOrder = new TreeMap<>();
    private static LinkedHashMap<String, Integer> maintainOrder = new LinkedHashMap<>();

    public static void addMember(String member){
        storeVotes.put(member,storeVotes.getOrDefault(member, 0)+1);
        maintainOrder.put(member,maintainOrder.getOrDefault(member, 0)+1);
        sortedOrder = new TreeMap<>(storeVotes);
    }

    public void display(){
        System.out.println("Votes stored in HashMap (default order): ");
        System.out.println(storeVotes);
        System.out.println("Sorted order of candidates (TreeMap): ");
        System.out.println(sortedOrder);
        System.out.println("Order in which votes were cast (LinkedHashMap): ");
        System.out.println(maintainOrder);
    }
    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.addMember("Saurabh");
        vs.addMember("Uday");
        vs.addMember("Uday");
        vs.addMember("Pankaj");
//        System.out.println(storeVotes);
        vs.display();
    }
}
