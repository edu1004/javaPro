package test.com;

public class Test01Main {
	
	int num;
	String name;
	int kor;
	int eng;
	int math;

	//�������� �����ε�
	//�Ű������� ������ �ٸ��ų�
	//�Ű������� ������ �ٸ��ų�
	//�Ű������� Ÿ���� �ٸ���
	//�����̸��� �����ڸ� ����Ҽ��ִ�
	public Test01Main() {
		System.out.println("Test01Main()....");
		num = 100;
		name = "kim";
	}
	
	public Test01Main(int i,String x) {
		num = i;
		name = x;
	}
	public Test01Main(String x,int i) {
		num = i;
		name = x;
	}
	public Test01Main(int x,int i) {
		eng = x;
		math = i;
	}

	public Test01Main(int i, int j, int k) {
		System.out.println(i+j+k);
		kor = i;
		eng = j;
		math = k;
	}

	public static void main(String[] args) {
		System.out.println("constructor");
		
		Test01Main tm = new Test01Main(99,"han");
		//tm.num = 111;
		System.out.println(tm.num);
		System.out.println(tm.name);
		
		tm = new Test01Main();
		System.out.println(tm.num);
		System.out.println(tm.name);
		
		tm = new Test01Main(99,88,77);
		System.out.println(tm.kor);
		System.out.println(tm.eng);
		System.out.println(tm.math);
		
		tm = new Test01Main(111, 222);
		System.out.println(tm.eng);
		System.out.println(tm.math);
	}

}
