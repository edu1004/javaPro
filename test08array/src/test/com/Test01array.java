package test.com;

public class Test01array {

	public static void main(String[] args) {
		System.out.println("array...");
		
		//동일한 타입의 변수를 여러개 만들것인가?
		//10,20,30
		int a = 10,b = 20,c = 30;
		
		//aaa,bbb,ccc
		String s1 = "aaa",s2 = "bbb",s3 = "ccc";
		
		
		//단일타입에 변수에 여러개의 값을 넣을 것인가?
		//배열명
		//1.
		int[] sus =  {10,20,30};//리터럴
		System.out.println(sus);
		System.out.println("배열의 길이:"+sus.length);
		System.out.println(sus[0]);
		System.out.println(sus[1]);
		System.out.println(sus[2]);
		
		
		String[] ss = {"aaa","bbb","ccc"};
//		ss = new String[]{"aaa1","bbb1","ccc1"};
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[2]);
		
		
		//2.
		int[] sus2 = new int[3];//0,0,0
		sus2[0] = 11;
		sus2[1] = 22;
		sus2[2] = 33;
		System.out.println(sus2[0]);
		System.out.println(sus2[1]);
		System.out.println(sus2[2]);
		
		String[] ss2 = new String[3];//null,null,null
		ss2[0] = "KIM";
		ss2[1] = "LEE";
		ss2[2] = "CHOI";
		System.out.println(ss2[0]);
		System.out.println(ss2[1]);
		System.out.println(ss2[2]);
		
		//3.
		int[] sus3 = new int[]{44,55,66};
		System.out.println(sus3);
		System.out.println(sus3.length);
		sus3[0] = 99;
		sus3[1] = 88;
		sus3[2] = 77;
		System.out.println(sus3[0]);
		System.out.println(sus3[1]);
		System.out.println(sus3[2]);
		
		

	}

}
