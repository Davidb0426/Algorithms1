package jAvaBasics;

public class ChildSuperKeyWord extends SuperKeyWord{
	
	String name = "QA Clickacademy";
	
	
	public ChildSuperKeyWord() {
//		super();
		System.out.println("child class contsructor");
	}
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("childclass getData method");
	}
	
	public static void main(String[] args) {
		String name = "name";
		ChildSuperKeyWord cd = new ChildSuperKeyWord();
		cd.getStringData();
		cd.getData();
	}

}
