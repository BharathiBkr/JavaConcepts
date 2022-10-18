package com.testing;

public class Customer {
	void deposit() {   //Default Access Specifier method (Within class &Within Package)
		System.out.println("Deposit the Amount");
	}
	public void enquiry() {  //Public Access Specifier method(within any anywhere)
		System.out.println("Bank Enquiry");
	}
	private void withdraw() {   //Private Access Specifier method(Within Class)
		System.out.println("WithDraw the Amount");
		
	}
	public static void main(String[] args) {
	final int a=10;
	 //a=20;
	
	Snake s= new Snake();
	s.move();
	
	Dog d= new Dog();
	d.move();

}

}

class Dog
{
  void move()
{
	System.out.println("dogs will move from one place to another place by walking and running");
}
}
class Snake extends Dog
{
void move()
{
	System.out.println("snakes will move from one place to another place only by crawling");
}
}
	
	
	

//Private Class is unable to create bcz during the class creation time private is hide.
//Private Variable&Public&Default Variable also is creatable respectivily.(ie.private int a=10; Public int b=23;int c=87;)