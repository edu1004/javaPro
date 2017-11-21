package test.com;

import test.net.Test01member;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("main...");
		
		Test01member tm = new Test01member();
		System.out.println(tm.num);
//		System.out.println(tm.id);
		System.out.println(tm.pw);
		System.out.println(tm.name);
		System.out.println(tm.tel);
		
		
		Test01member tm2 = new Test01member(99,"tester","hi2468","lee","02");
		System.out.println(tm2.num);
//		System.out.println(tm2.id);
		System.out.println(tm2.pw);
		System.out.println(tm2.name);
		System.out.println(tm2.tel);
		
	}

}
