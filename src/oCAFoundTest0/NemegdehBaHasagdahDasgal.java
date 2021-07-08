package oCAFoundTest0;

public class NemegdehBaHasagdahDasgal implements Bozo{

	public static void main(String[] args) {
		Integer nt1 = new Integer(5);
		int nt2 = 9;
		testInIts(nt1++, ++nt2);
		System.out.println(nt1+ " " + nt2);

	}
	
	public static void testInIts(Integer obj, int var) {
		obj=var++;
		obj++;
	}
	public Object getValue(Object obj) {
		return obj;
	}

}
