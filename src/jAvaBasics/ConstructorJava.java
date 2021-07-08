package jAvaBasics;

public class ConstructorJava {
	
	public ConstructorJava() {
		System.out.println("I am in the constructor");
	}
	
	/* 1. no return type
	 * 2. executes first in a class whatever is in constructor
	 * 3. Wehn i create an object constructor is called
	 * 4. compiler will call automatically constructors when not called 
	 * 5. Paramaterized constructor () if parameters are given in an object created - it will pass 
	 */
	
	public ConstructorJava(int a, int b) {
		System.out.println("I am in the  Paramaterized constructor ");
	}
	
	public ConstructorJava(String str) {
		System.out.println(str);
	}
	
	public void getData() {
		System.out.println("I am the method");
	}
	
	public static void main(String[] args) {

		ConstructorJava cd = new ConstructorJava();
		ConstructorJava cd1 = new ConstructorJava(4,90);
		ConstructorJava cd2 = new ConstructorJava("hi");
	}

}
