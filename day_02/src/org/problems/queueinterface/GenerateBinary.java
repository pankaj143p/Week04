package org.problems.queueinterface;
import java.util.*;
public class GenerateBinary {


        public static List<String> generateBinary(int n) {
            List<String> ans = new ArrayList<>();
            Queue<String> q = new LinkedList<>();
            q.offer("1");
            for(int i=1; i <=n; i++) {
                String cur=q.poll();
                ans.add(cur);
                q.offer(cur+"0");
                q.offer(cur+"1");
            }

            return ans;
        }

        public static void main(String[] args) {
            int n=5;
            List<String> binaryList=generateBinary(n);
            System.out.println(binaryList);
        }
    }
