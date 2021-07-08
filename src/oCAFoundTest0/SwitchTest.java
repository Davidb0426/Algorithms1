package oCAFoundTest0;



public class SwitchTest {

	public static void main(String[] args) {
		SwitchTest aa = new SwitchTest();
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


