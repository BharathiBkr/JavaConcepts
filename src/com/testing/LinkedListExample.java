package com.testing;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListExample {
	/*
	 * Iteration of Linked List with Advanced For loop (For each)
	 */
	
	public void iterationWithAdvancedFor(){
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println("For Each");
		for (String string : linkedList) {
			System.out.println("Elements in the LL are "+ string);
		}
		System.out.println("-----------------------------------------------------");
	}
	
	/*
	 * Iterate using Iterator
	 */
	public void iterateUsingIterator(){
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		Iterator<String> iterator=linkedList.iterator();
		System.out.println("Iterator");
		while(iterator.hasNext()){
			System.out.println("Elements in the LL are "+ iterator.next());
		}
		System.out.println("-----------------------------------------------------");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExample linkedListExample = new LinkedListExample();
		linkedListExample.iterationWithAdvancedFor();
		linkedListExample.iterateUsingIterator();
	}

}