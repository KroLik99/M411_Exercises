package AB07;

import java.util.LinkedList;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTesting {
    public void testQueue() {
        Queue<String> wartende = new LinkedList<String>();

        wartende.offer("Eva");

        wartende.offer("Max");

        wartende.offer("Tim");

        wartende.offer("Susi");

        wartende.offer("Ida");

        System.out.println(wartende);

        wartende.poll();

        System.out.println(wartende);
    }
    public void priorityQueue(){

        Queue<Integer> queue = new PriorityQueue<>(4);


        queue.add(20);

        queue.offer(1);

        queue.offer(5);

        queue.offer(3);

        queue.offer(9);

        queue.offer(12);
        System.out.println("queue = " + queue);
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);
    }


}
