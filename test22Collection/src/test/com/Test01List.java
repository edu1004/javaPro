package test.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Test01List {

	public static void main(String[] args) {
		System.out.println("List...");
		
		List<Integer> list = new ArrayList<Integer>();
		List<String> list2 = new ArrayList<String>();
		
		
		List<Test01VO> list3 = new ArrayList<Test01VO>();
		list3.add(new Test01VO());
		list3.add(new Test01VO());
		list3.add(new Test01VO());
		list3.add(new Test01VO());
		list3.add(new Test01VO());
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		
		for (Test01VO vo : list3) {
			System.out.println(">>"+vo);
		}
		
		
		list3.remove(3);
		System.out.println("=========");
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		list3.set(3, null);
		System.out.println("=========");
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		list3.clear();
		System.out.println(list3.size());
		//Test01VO[] vos = new Test01VO[10];
		
		
		System.out.println();
		System.out.println();
		List<Test01VO[]> list4 = new ArrayList<Test01VO[]>();
		
		///////////////
		Vector<Test01VO> vec = new Vector<Test01VO>();
		vec.add(new Test01VO());
		vec.add(new Test01VO());
		vec.add(new Test01VO());
		vec.add(new Test01VO());
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		vec.ensureCapacity(100);
		System.out.println(vec.capacity());
		
		Stack<Integer> stack = new Stack<Integer>();//Last In First Out>>LIFO != FIFO
		stack.add(1000);
		stack.add(2000);
		stack.add(3000);
		stack.add(3000);
		stack.add(4000);
		stack.push(5000);
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
		System.out.println("===");
		System.out.println(stack.pop());

	}

}
