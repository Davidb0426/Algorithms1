package jAvaBasics;

public class AaChildApplication {
	
	int a1 =3;
	int a2;
	int id = 5;
	public static void main(String[] args) {
		AaParentApplication abc = new AaParentApplication();
	abc.transferData();
	abc.printData();

	}
	
	public void localVar(int a1, int a2) {
		this.a1 =a1;
		System.out.println(a1);
	}
	protected void printData() {
		System.out.println("print child data of child");

	}
}
