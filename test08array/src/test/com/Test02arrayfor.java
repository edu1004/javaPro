package test.com;

public class Test02arrayfor {

	public static void main(String[] args) {
		// 배열에 정보를 반복문을 이용해서
		// 변경 또는 검색하기
		
		double[] ds = new double[5];//0.0,0.0, 0.0,0.0,0.0
		//2.for문을 이용해서 값변경해보세요
		for (int i = 0; i < ds.length; i++) {
			ds[i] = 3.14;
		}
		
		//1.for문을 이용해서 출력하세요
//		System.out.println(ds[0]);
//		System.out.println(ds[1]);
//		System.out.println(ds[2]);
//		System.out.println(ds[3]);
//		System.out.println(ds[4]);
		System.out.println(ds);
		System.out.println(ds.length);
		for (int i = 0; i < ds.length; i++) {
			System.out.println(i+":"+ds[i]);
		}
		
		
		//참,거짓,참,거짓값을 갖는 boolean type배열을 반복문을이용하여
		//값을 할당하고 출력하시오.
		boolean[] bs = new boolean[4];
		for (int i = 0; i < bs.length; i++) {
			if(i%2==0) bs[i] = true;
		}
		
		
		System.out.println(bs);
		System.out.println(bs.length);
		for (int i = 0; i < bs.length; i++) {
			System.out.println(i+":"+bs[i]);
		}

	}

}
