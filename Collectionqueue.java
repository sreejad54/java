package com.collections;

import java.util.PriorityQueue;

public class Collectionqueue {

	public static void main(String[] args) {
		//priority queue
		PriorityQueue<Integer> pq = new  PriorityQueue<>();
		pq.add(8);
		pq.offer(6);
		pq.add(9);
		pq.add(2);
		System.out.println(pq);
		System.out.println(pq.peek());//rerieves only head
		System.out.println(pq.poll());
		System.out.println(pq.poll());//removes the element
        
		System.out.println(pq.contains(90));



	}

}
