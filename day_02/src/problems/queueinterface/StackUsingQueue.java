package problems.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue{
     static class Stack {
            private static Queue<Integer> q;
            Stack(){
                q=new LinkedList<>();
            }

            public void add(int data) {
                q.add(data);
                int size=q.size();
                for(int i=0; i<size-1; i++){
                    q.add(q.poll());
                }
            }

            public int pop() {
                if (q.isEmpty()) {
                    return -1;
                }
                return q.poll();
            }

            public int peek() {
                if(q.isEmpty()){
                    return -1;
                }
                return q.peek();
            }
        public int size() {
            return q.size();
          }
        }
        public static void main(String[] args) {
            Stack st = new Stack();
            st.add(4);
            st.add(12);
            st.add(2);
            st.pop();
            st.add(6);
            st.add(9);
            System.out.println("Peek Element : "+st.peek());
            while(st.size()>0){
                System.out.print(st.pop()+" ");
            }

        }
    }
