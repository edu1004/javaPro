package test.com;

public class Test02BBB {
	
	//method4����Ʈ�� �����ϰ�
	//���ο��� ��call�ϰ� ����ϼ���
	//�Ű������� Ÿ�԰� ����Ÿ���� ����
	void bbb() {
		System.out.println("bbb()....");
	}
	
	String bbb2() {
		System.out.println("bbb2()....");
		return "yangssem";
	}
	
	void bbb3(int x) {
		System.out.println("bbb3(int x)..."+x);
	}
	
	String[] bbb4(int x, int y) {
		System.out.println("bbb4(int x, int y)...");
		System.out.println(x+":"+y);
		return new String[] {"aaa","bbb","ccc"};
	}

}
