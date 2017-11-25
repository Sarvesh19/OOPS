package com.infy;

import java.util.PriorityQueue;
import java.util.Queue;

interface Collection{
	void add();
}
interface Queues extends Collection {
	void offer();
}

class PriorityQueues implements Queues{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void offer() {
		// TODO Auto-generated method stub
		
	}
	
}



public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Object> queue = new PriorityQueue<>(5);
		//queue.toArray(a)
		queue.add("sarvesh");
		queue.add("sarveseeh");
		queue.offer("fr");
		queue.offer("yhh");
		queue.offer("qqq");
		System.out.println(queue.element());
		System.out.println(queue.poll());
		queue.offer("jhh");
		queue.add("parvesh");
		queue.add("karvesh");
		queue.add("larvesh");
		queue.add("earvesh");
		queue.add("qarvesh");
		
		System.out.println(queue);
	}
}
