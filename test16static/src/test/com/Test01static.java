package test.com;

public class Test01static {
	
	
	
	public static void main(String[] args) {
		System.out.println("static...");
		//���α׷��� �����ؼ� ����ɶ�����
		//�޸��� Ŭ���������� �ּҸ� �Ҵ�޴´�
		//���� ����ϸ� �޸� �����÷��� �߻��Ҽ� �ִ�.
		
		Test01AAA a = new Test01AAA();//new ~~~garbage  collection�۵�������
		a.name = "lee";
		System.out.println(a.name);
		
		
		Test01AAA.name2 = "kim";
		System.out.println(Test01AAA.name2);
		
//		Test01AAA.NAME3 = "han";
		System.out.println(Test01AAA.NAME3);
		
		
		a.aaa();
		a.aaa3();
		Test01AAA.aaa2();
		
		
	}

}
