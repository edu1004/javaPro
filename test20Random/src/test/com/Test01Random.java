package test.com;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test01Random {
	static String[] names = new String[] {
		"����ȣ","������","������","�̰��","������",
		"������","�����","�ռ���","����ȣ","�ڻ���",
		"��ǿ�","�����","�����","������","���"
	};

	public static void main(String[] args) throws InterruptedException {
		System.out.println("��÷");
		Random r = new Random();
		
		Set<String> set = new TreeSet<>();//�������� ����
		
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
		
		//�ζǹ�ȣ 6�ڸ� �����ϱ�
		//1~45����
		//���ϰ� ������, ������~ū���� ����
		
	}

}
