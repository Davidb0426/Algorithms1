package jAvaBasics;

public class AaParentApplication extends AaChildApplication{
	static int p;
	static int rom;


	static {
		System.out.println("1. static block executed");
		p =73;
		rom =45;
		String str3 = "Hi";
	}
	
	AaParentApplication(){
		System.out.println("2. constructor executed");
	}
	
	AaParentApplication(String w1){
		
	}
	public static void main(String[] args) {
	
		System.out.println(rom);
		AaParentApplication	 abce = new AaParentApplication();
	abce.printData();
//	abce.id;
	
	}
	
//	public static void printData() {	
//		System.out.println("3. print data method executed of parent");	
//		}
	public static void transferData() {	
		System.out.println("4. transfer data executed of parent");	
		}


}
