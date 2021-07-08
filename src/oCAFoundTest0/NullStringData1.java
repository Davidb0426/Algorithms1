package oCAFoundTest0;
public class NullStringData1 {
	public static void main(String[] args) {
		NullStringData1 ntd = new NullStringData1();
		String []arr= new String[2];
		ntd.inIt(arr);
		ntd.printData(arr);
	}
	
	public void inIt(String[]arr) {
		int ind=0;
		for(String str : arr) {
			str.concat(str+" "+ind);
			ind++;
		}
	}
	public void printData(String []arr) {
		for(String str: arr) {
			System.out.println(str);
		}
	}
	

}
