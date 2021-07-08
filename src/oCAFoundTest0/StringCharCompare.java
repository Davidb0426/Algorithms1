package oCAFoundTest0;

public class StringCharCompare {

	public static void main(String[] args) {
		String myStr = "good";
		char[] myCharArr = {'g','o','o','d'};
		
		String newStr = null;
		for(char ch: myCharArr) {
			newStr+=ch;
		}
		System.out.println((newStr==myStr)+ " "+ (newStr.equals(myStr)));
	}

}
