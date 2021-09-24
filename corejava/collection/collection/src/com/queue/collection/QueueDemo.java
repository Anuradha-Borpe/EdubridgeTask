package com.queue.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args) {
	Queue<String> q=new PriorityQueue<String>();
	q.add("anu");
	q.add("pooja");
	q.add("divya");
	System.out.println(q.peek());
	System.out.println(q.element());
	q.poll();
	System.out.println(q);
}
}
