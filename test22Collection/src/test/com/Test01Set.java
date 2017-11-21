package test.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test01Set {

	public static void main(String[] args) {
		System.out.println("Set...");
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10000);
		set.add(10000);
		set.add(20000);
		set.add(40000);
		set.add(20000);
		set.add(50000);
		set.add(30000);
		
//		Iterator<Integer> it = set.iterator();
//		while (it.hasNext()) {
//			Integer data = (Integer) it.next();
//			System.out.println(data);
//		}
		
		for (Integer data : set) {
			System.out.println(data);
		}
		
		set.remove(20000);
		System.out.println("set.size():"+set.size());
		
		
	}

}
