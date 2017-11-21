package test.com;

public class Test01classNobject {
	// public 내프로젝트 내에서 즉 다른폴더에서도 이클래스를 쓸수있도록 정의

	// 1.member field 속성
	int su = 0;// member field valiable, 전역변수,인스턴스변수(instance)
	int su2 = 10;
	String name = null;
	String tel = "010";
	double[] ds = new double[4];

	// 2.생성자contructor
	public Test01classNobject() {
		// 생략가능
		System.out.println("Test01classNobject()");
	}

	// 3.member method 동작(기능)

	// 4.내부클래스 inner class

	// 5.초기화 블럭

	public static void main(String[] args) {
		System.out.println("class ~ object");

		// 데이터 담는다 >>> 타입정하고 변수
		// 동일한 타입의 여러데이터를 한 변수에 넣기 >> 배열
		// 동일하지않은 여러타입을 한 변수에 넣기 >> 넣고나서 new하면 객체,
		// 넣을라고 코딩하는 대상은 클래스
		// 클래스(객체)의 속성 정의 및 접근
		int su = 0;// local valiable지역변수

		// 클래스명 객체명 = new연산자 생성자;
		Test01classNobject t01 = new Test01classNobject();// 생성자,contructor
		System.out.println(t01);
		t01 = new Test01classNobject();// 생성자,contructor
		System.out.println(t01);
		System.out.println(t01.su);
		System.out.println(t01.su2);
		System.out.println(t01.name);
		System.out.println(t01.tel);
		
		Test01classNobject[] tts = new Test01classNobject[3];
		tts[0] = t01;
		System.out.println(tts[0].name);
		System.out.println(tts[0].ds[0]);
		String[][] sss =new String[3][3];
		System.out.println(sss[0][0]);
	}// end main

	// // 2.생성자contructor
	// public Test01classNobject() {
	// // 생략가능
	// }

}
