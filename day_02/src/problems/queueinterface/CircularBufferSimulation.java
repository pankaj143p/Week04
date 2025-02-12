package problems.queueinterface;


import java.util.LinkedList;
import java.util.Queue;

    class CBuffer {
        private Queue<Integer> buf;
        private int cap;

        public CBuffer(int cap) {
            this.cap = cap;
            this.buf = new LinkedList<>();
        }

        public void add(int d) {
            if (buf.size() == cap) {
                buf.poll();
            }
            buf.add(d);
        }

        public int remove() {
            if (buf.isEmpty()) return -1;
            return buf.poll();
        }

        public int peek() {
            if (buf.isEmpty()) return -1;
            return buf.peek();
        }

        public int size() {
            return buf.size();
        }

        public void display() {
            if (buf.isEmpty()) return;
            for (int i : buf) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

public class CircularBufferSimulation {
        public static void main(String[] args) {
            CBuffer b = new CBuffer(3);
            b.add(1);
            b.add(2);
            b.add(3);
            b.display();
            b.add(4);
            b.display();
            b.remove();
            b.display();
            b.add(5);
            b.display();
        }
    }
