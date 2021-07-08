package arrayList;
public class Aaplication {

	public static void main(String[] args)throws Exception{
		int i,j;
		for(i=0, j=0; i<j; i++, ++j) {
			System.out.println(i + " " + j);
		}
		System.out.println(i + " " + j);
		Aaplication aa = new Aaplication();
		aa.sW("B");
	}
	
	public void sW(String str) {
		switch (str) {
		case "A":System.out.println("apple");
		case "b":System.out.println("bat");
			break;
		case "B":System.out.println("big man");
		default:System.out.println("default");
		}	
	}
}

