  package com.testing;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseTheNumber {
	

	public static void main(String[] args) {
		int a[]={7,9,2,3,4,5,8,1,6};
		System.out.println("Length of the Array  "+a.length);
		System.out.println("Original Array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);	
		}
		System.out.println("Reverse Order");
		for (int i = a.length-1; i >=0; i--) {
			System.out.println(a[i]);
			
		}
		
		
		
	}
	

}
