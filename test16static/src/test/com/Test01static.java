package test.com;

public class Test01static {
	
	
	
	public static void main(String[] args) {
		System.out.println("static...");
		//프로그램이 시작해서 종료될때까지
		//메모리의 클래스영역에 주소를 할당받는다
		//많이 사용하면 메모리 오버플러가 발생할수 있다.
		
		Test01AAA a = new Test01AAA();//new ~~~garbage  collection작동전까지
		a.name = "lee";
		System.out.println(a.name);
		
		
		Test01AAA.name2 = "kim";
		System.out.println(Test01AAA.name2);
		
//		Test01AAA.NAME3 = "han";
		System.out.println(Test01AAA.NAME3);
		
		
		a.aaa();
		a.aaa3();
		Test01AAA.aaa2();
		
		
	}

}
