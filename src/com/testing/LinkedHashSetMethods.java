package com.testing;

import java.util.LinkedHashSet;

public class LinkedHashSetMethods {
	/**
	 * LinkedHashSet->Child class of HashSet
	 * DS-> Hash table + Linked List
	 * Insertion order is preserved
	 * Duplicates not allowed
	 */

	public void linkedHashSetExample(){     //Method Creation model;;
		LinkedHashSet linkedHashSet = new LinkedHashSet();  //Without Genirics is called Heterogenous Method(Add both the string,int,folat etc)
		//Set linkedHashSet = new LinkedHashSet(); --This is aslo possible
		linkedHashSet.add(1);
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("10");

		System.out.println("Insertion Order preserved Linked Hash Set :"+ linkedHashSet);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSetMethods example= new LinkedHashSetMethods();  //Object Creation Method.This is used for all collection program
		example.linkedHashSetExample();
	}

}

