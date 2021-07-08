package arrayList;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("Mexico");
		hs.add("hi");
		hs.add("iea");
		hs.iterator();
		Iterator<String> i = hs.iterator();
		System.out.println(i.next());
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
//		System.out.println(hs);
//		System.out.println(hs.isEmpty());;
//		System.out.println(hs.size());;
	}
}

/* HashSet, treeset, LinkedHashSet
 * 1. Doesn't accept duplicate values
 * 2. Not guaranteed to be stored in order of sequentially */