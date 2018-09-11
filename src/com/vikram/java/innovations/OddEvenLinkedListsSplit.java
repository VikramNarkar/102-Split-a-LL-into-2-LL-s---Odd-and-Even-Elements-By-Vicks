package com.vikram.java.innovations;

import java.util.Iterator;
import java.util.LinkedList;

public class OddEvenLinkedListsSplit {
	
	private static LinkedList<Integer> originalList = new LinkedList<Integer>();
	
	public OddEvenLinkedListsSplit () {
		
	}
	
	public static void main (String[] args) {
		
		for (int i = 0; i <= 30; i++) {
			originalList.addFirst(i);
		}
		
		System.out.println("Original List: "+originalList);
		
		splitList(originalList);
	}
	
	public static void splitList(LinkedList<Integer> originalList) {
		
		LinkedList<Integer> oddList = new LinkedList<Integer>();
		LinkedList<Integer> evenList = new LinkedList<Integer>();
		
		Iterator<Integer> itr = originalList.listIterator();
		
		while(itr.hasNext()) {
			Integer curr = itr.next();
			if(curr % 2 == 0) {
				evenList.addLast(curr);
			} else {
				oddList.addLast(curr);
			}
		}
		
		System.out.println("Even List is: ");
		System.out.println(evenList);
		
		System.out.println("Odd List is: ");
		System.out.println(oddList);
	}

}
