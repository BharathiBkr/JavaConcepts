package com.testing;

public class StringExample {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
//		//String is immutable and StringBuffer is mutable Exapmle
//		String name="Arun";
//		System.out.println(name);
//		name="Bharathi";
//		System.out.println(name.concat("Raj"));
//		System.out.println(name);
//		
//		StringBuffer newname=new StringBuffer("Bharathi");
//		System.out.println(newname);
//		System.out.println(newname.append("Raja"));
//		System.out.println(newname);
		
		//Wrapper Classes
		//boxing
				byte k=10;
				Byte b= new Byte(k);
				System.out.println(b);

				int a=20;
				Integer i=new Integer(a);
				System.out.println(i);
				
				//Unboxing
				Double d= new Double(10);
				int d1=d.intValue();
				System.out.println(d1);

				Integer i1=new Integer(10);
				int i2=i1.intValue();
				System.out.println(i2);
				
				//Auto boxing
				int i3=5;
				Integer j1=15;//Auto boxing
				System.out.println(i3);

				//Auto-unboxing
				Integer i4=new Integer(10);
				int j2=i4;//Auto-unboxing
				System.out.println(j2);

		
//		

	}

}
