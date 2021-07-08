package variableTaypes;

public class StaticVar {

	String name;
	String address;
	static String city="London";
	static int i=0;
	
	static {
		city ="New Jercey";
		i=0;
		System.out.println("Static block execution");
	}
	
	StaticVar(String name, String address){
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	public static void main(String[] args) {
		StaticVar obj = new StaticVar("Bob","Marta");
		StaticVar obj1 = new StaticVar("Ram","Porto");
	obj.getAddress();
	obj1.getAddress();
	StaticVar.i=4;
	obj.address="XYZ";
	
	}
	
	public void getAddress() {
		System.out.println(address+" "+city);
	}
	
	public static void getCity() {
		System.out.println(city);
	}

}
