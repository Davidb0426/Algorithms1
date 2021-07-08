package javaCollections;
import java.util.ArrayList;
public class CollectionDemo {
	public static void main(String[] args) {
	
		int a[] = {4,5,5,5,4,6,6,9,4};
	
		// print unique number for a[]
		//4 -3times, 5-3times, 6 twice, 9 once
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			int k=0;
			if(!arr.contains(a[i])) {
				arr.add(a[i]);
				k++;
				for(int j=i+1; j<a.length; j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				if(k==1) System.out.println(a[i] +" is unique number");
			}
		
		}	
	}
}
