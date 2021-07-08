package oCAFoundTest0;

public class IntArrayDoubleCheck {

	public static void main(String[] args) {
		int[]arrD= {5,6,6,4,6,7,44};
		System.out.println(countInt(arrD));
	}
	public static int countInt(int[]arr) {
		  int count=0;
		  for(int i=0; i<arr.length-1; i++){
		    if((arr[i]==6 && arr[i+1]==7)  || (arr[i]==6 && arr[i+1]==6)){
		      count++;
		    }
		  }return count;
	}
}
