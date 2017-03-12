package com.jnit.generics.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

//Collection
//Queue extends Collection
//LinkedList,PriorityQueue and ,Dequeue, ArrayDeque
//FIFO
//Stack extends Vector -> LIFO
//Map interface
public class QueueMain {

	public static void main(String[] args) {
		Queue<String>q1 = new LinkedList<>();
		//Queue<String>q2 = new ArrayBlockingQueue<>(10);
		q1.add("ravi");//throws exception is queue is empty
		q1.offer("raju");//throws exception if no space is there for capacity restricted queue like ArrayBlockingqueue
		System.out.println(q1.peek());//returns null if queue is empty
		System.out.println(q1.element());//throws an exception if queue is empty
		q1.poll();//removes and returns the element, returns null
		System.out.println(q1);
		q1.remove();//throws an exception if queue is empty
		System.out.println(q1);
		System.out.println(q1.isEmpty());
		System.out.println(q1.contains("ramu"));
		
		ArrayDeque<String>q3 = new ArrayDeque<>();
		q3.offer("raja");
		q3.addFirst("ravi");
		q3.addLast("ramu");
		q3.removeFirst();
		q3.removeLast();
		q3.removeFirstOccurrence("ramu");
		q3.removeLastOccurrence("raja");
		
		Stack<String>stack1 = new Stack<>();
		stack1.push("ramu");
		stack1.push("raja");
		String popped = stack1.pop();
		System.out.println(popped);
		stack1.add("rani");
		
		
		
	}

}
