package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("main...");
		
		Test02AAA ta = new Test02AAA();
		System.out.println(ta);
		System.out.println(ta.num);
		System.out.println(ta.name);
		System.out.println(ta.tel);
		
		//99,lee,080값을 주는 생성자를 만들고 객체생성후 출력하세요
		Test02AAA ta2 = new Test02AAA(99,"lee","080");
		System.out.println(ta2.num);
		System.out.println(ta2.name);
		System.out.println(ta2.tel);
		
		//Test02BBB 에 기본타입속성과 배열타입속성을 만들고
		//객체생성 및 초기화 하세요.
		Test02BBB tb = new Test02BBB(99,3.14,new String[] {"hp01","sm02"});
		System.out.println(tb.num);
		System.out.println(tb.avg);
		System.out.println(tb.models.length);
		for (int i = 0; i < tb.models.length; i++) {
			System.out.println(tb.models[i]);
		}
		
		//Test02BBB 에 Test02AAA속성을 추가하시고 초기화 및 출력
		Test02BBB tb2 = new Test02BBB(ta);
		System.out.println(tb2);
		System.out.println(tb2.ta);
		System.out.println(tb2.ta.num);
		System.out.println(tb2.ta.name);
		System.out.println(tb2.ta.tel);
		
	}

}
