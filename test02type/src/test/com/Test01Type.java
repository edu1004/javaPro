package test.com;

public class Test01Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수(0) : byte,short,char,int,long
		//8bit >>> 1byte  
		//0000 0000, 1111 1111
		//128 64 32 16  8 4 2 1
		byte b = 100;
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println(b);
		
		
		short s = 11;
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println(s);
		
		char c = 65;//0포함 양의정수만 받는다.
		System.out.println(Character.MIN_VALUE+"~"+Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
		System.out.println(c);
		boolean bb = true;
		System.out.println(Boolean.TRUE);
		
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		
		int kor = 99;
		System.out.println(kor);
		
		long l = 888;
		System.out.println(l);
		
		System.out.println(Double.MIN_VALUE+""+Double.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE+""+Float.MAX_VALUE);
		
	}

}
