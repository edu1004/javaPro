package test.com;

public class Test02BBB {
	
	//method4종세트를 정의하고
	//메인에서 콜call하고 출력하세요
	//매개변수의 타입과 리턴타입은 자율
	void bbb() {
		System.out.println("bbb()....");
	}
	
	String bbb2() {
		System.out.println("bbb2()....");
		return "yangssem";
	}
	
	void bbb3(int x) {
		System.out.println("bbb3(int x)..."+x);
	}
	
	String[] bbb4(int x, int y) {
		System.out.println("bbb4(int x, int y)...");
		System.out.println(x+":"+y);
		return new String[] {"aaa","bbb","ccc"};
	}

}
