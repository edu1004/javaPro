package test.com;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test01Random {
	static String[] names = new String[] {
		"김정호","정승현","정성민","이경률","김지원",
		"문정인","김송현","왕소정","전현호","박상재",
		"김건욱","김민재","김기태","이진욱","양샘"
	};

	public static void main(String[] args) throws InterruptedException {
		System.out.println("당첨");
		Random r = new Random();
		
		Set<String> set = new TreeSet<>();//오름차순 정렬
		
		for (int i = 0; i < Test01Random.names.length; i++) {
			Thread.sleep(300);
			int index = r.nextInt(Test01Random.names.length);
//			System.out.println("random index:"+index);
			System.out.println(Test01Random.names[index]+" ");
			set.add(Test01Random.names[index]);
//			if(i%4==0) {
//				System.out.print(Test01Random.names[index]+" ");
//			}
//			if(i==Test01Random.names.length-1) System.out.println(Test01Random.names[index]+" ");
		}
		System.out.println("=========");
		
//		for (String name : set) {
//			System.out.println(name);
//		}
		
		//로또번호 6자리 생성하기
		//1~45정수
		//동일값 허용안함, 작은수~큰수로 정렬
		
	}

}
