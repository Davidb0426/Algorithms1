package arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		/*	1. duplicate values are acceptable
		 *  2. Implementing List interfaces: ArrayList, LinkedList, vector
		 *  3. ArrayList can grow dynamically
		 *  4. Ability to access & insert any value in any index
		 */
		ArrayList<String> a = new ArrayList<String>();
		a.add("1st name");
		a.add("name");
		a.add("name");
		a.add(0, "student");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
//		System.out.println(a.contains("last name"));
	}

}
