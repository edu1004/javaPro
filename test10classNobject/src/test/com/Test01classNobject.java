package test.com;

public class Test01classNobject {
	// public ��������Ʈ ������ �� �ٸ����������� ��Ŭ������ �����ֵ��� ����

	// 1.member field �Ӽ�
	int su = 0;// member field valiable, ��������,�ν��Ͻ�����(instance)
	int su2 = 10;
	String name = null;
	String tel = "010";
	double[] ds = new double[4];

	// 2.������contructor
	public Test01classNobject() {
		// ��������
		System.out.println("Test01classNobject()");
	}

	// 3.member method ����(���)

	// 4.����Ŭ���� inner class

	// 5.�ʱ�ȭ ��

	public static void main(String[] args) {
		System.out.println("class ~ object");

		// ������ ��´� >>> Ÿ�����ϰ� ����
		// ������ Ÿ���� ���������͸� �� ������ �ֱ� >> �迭
		// ������������ ����Ÿ���� �� ������ �ֱ� >> �ְ��� new�ϸ� ��ü,
		// ������� �ڵ��ϴ� ����� Ŭ����
		// Ŭ����(��ü)�� �Ӽ� ���� �� ����
		int su = 0;// local valiable��������

		// Ŭ������ ��ü�� = new������ ������;
		Test01classNobject t01 = new Test01classNobject();// ������,contructor
		System.out.println(t01);
		t01 = new Test01classNobject();// ������,contructor
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

	// // 2.������contructor
	// public Test01classNobject() {
	// // ��������
	// }

}
