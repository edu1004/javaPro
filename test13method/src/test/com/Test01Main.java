package test.com;

public class Test01Main {

	// 1.field�Ӽ�,����:����,���
	int test;

	// 2.constructor

	// 3.method����,���:��Ī ������,�����ҹ��ڷ� ����
	// 3-1 �Ű�����(����)���� ����(��ȯ) ����
	void aaa() {
		System.out.println("aaa()...");
		// return;
	}

	// 3-2 �Ű�����(����)���� ����(��ȯ) �ִ�
	int aaa2() {
		System.out.println("aaa2()...");
		int x = 10;
		return x;
	}

	// 3-3 �Ű�����(����)�Ѱ� �ְ� ����(��ȯ) ����
	void aaa3(int x) {
		System.out.println("aaa3(int x)..."+x);
		// return;
	}

	// 3-4 �Ű�����(����)�Ѱ� �ְ� ����(��ȯ) �ִ�
	int[] aaa4(String name) {
		System.out.println("aaa4(String name)..."+name);
		int[] sus = new int[3];
		sus[0] = 99;
		sus[1] = 88;
		sus[2] = 77;
		return sus;
	}

	public static void main(String[] args) {
		System.out.println("main..method");
		Test01Main tm = new Test01Main();
		System.out.println(tm.test);

		// method call
		System.out.println(tm.aaa2());
		tm.aaa();
		int a2 = tm.aaa2();//0
		System.out.println(a2);
		tm.aaa3(99);
		int[] a4 = tm.aaa4("KIM");
		System.out.println(a4.length);
//		System.out.println(a4[0]);
//		System.out.println(a4[1]);
//		System.out.println(a4[2]);
		for (int i = 0; i < a4.length; i++) {
			System.out.println(a4[i]);
		}
	}

}
