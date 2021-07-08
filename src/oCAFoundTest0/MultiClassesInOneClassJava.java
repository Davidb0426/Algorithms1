package oCAFoundTest0;
class ABCE{
	int x=10;
	static int y=20;
}

 class MNOP extends ABCE{
	int x=30;
	static int y=40;
}
 
public class MultiClassesInOneClassJava {

	public static void main(String[] args) {
	System.out.println(new MNOP().x  + ", " + new MNOP().y);
	MNOP mn = new MNOP();
	System.out.println(mn.x);
	
	}

}
