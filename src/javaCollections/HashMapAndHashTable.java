package javaCollections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapAndHashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
		hm.put(0, "h");
		hm.put(1, "b");
		hm.put(2, "mng");
		hm.put(3, "e ng");

		Set sn = hm.entrySet();
		Iterator it= sn.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp= (Map.Entry)it.next();
			System.out.println(mp.getKey());;
			System.out.println(mp.getValue());
		}

	}

}
