package com.testing;

public class StringClass {

	public static void main(String[] args) {
		//Difference Between  String(c) vs String Buffer(c)
		//1.String
		System.out.println("String Is Immutable");  //It means Unchangable
		String name="Agni";
		System.out.println(name); //In this position get agni is result
		System.out.println("Adding the Name    "+name.concat("Raja")); //In this position get Agniraja result
		System.out.println("Orignal Name     "+name);   //In this position get Agni result.
		//Thats means String is immutable
		//2.String Buffer;
		System.out.println("String buffer is mutable");
		StringBuffer name1=new StringBuffer("Agni");  //StringBuffer Literal Type using New Keyword
		System.out.println(name1);  //Get agni is result 
		System.out.println("Adding the name   "+name1.append("Raja"));  //get AgniRaja is Result
		System.out.println("Original Name   "+name1);   //get AgniRaja is Result
		//So Thats means String Buffer is mutable
		//String Buffer Methods;
		//Reverse the String
		System.out.println("Reverse the Name   "+name1.reverse());
		System.out.println(name1);
		//Replace;
		StringBuffer name2=new StringBuffer("Raja");
		System.out.println("Replace the some word  "+name2.replace(0, 3, "Kujaa"));
		//Delete;
		StringBuffer name3=new StringBuffer("XYZBharathi");
		System.out.println("Delete the unwanted Letters   "+name3.delete(0, 3)); //End index is first needed letter index i.e B index position is 3.so enter the 3
		//Capacity;
		System.out.println(name3.capacity());
		
		

	}

}
