package test.com;

public class Test01Main2 {
	
	int num;
	int[] sus;
	String[] names;
	
	public Test01Main2() {
		num = 1;
		sus = new int[5];
//		sus[0] = 100;
//		sus[1] = 101;
//		sus[2] = 102;
//		sus[3] = 103;
//		sus[4] = 104;
		for (int i = 0; i < sus.length; i++) {
			sus[i] = 100+i;
		}
	}
	public Test01Main2(int num, int[] sus) {
		this.num = num;
		this.sus = sus;
	}
	public Test01Main2(String[] names) {
		this.names = names;
	}
	public static void main(String[] args) {
		System.out.println("constructor");
		
		//1.�Ű���������(���ھ���) �����ڷ� �ʱ�ȭ ���
		Test01Main2 tm2 = new Test01Main2();
		System.out.println(tm2.num);
//		System.out.println(tm2.sus[0]);
//		System.out.println(tm2.sus[1]);
//		System.out.println(tm2.sus[2]);
//		System.out.println(tm2.sus[3]);
//		System.out.println(tm2.sus[4]);
		for (int i = 0; i < tm2.sus.length; i++) {
			System.out.println(tm2.sus[i]);
		}
		
		//2.�Ű������ִ� �����ڷ� �ʱ�ȭ ���
		//99,�����迭(new int[3])
//		int[] js = new int[] {22,33,44};
		int[] js = new int[3];
		js[0] = 22;
		js[1] = 33;
		js[2] = 44;
		Test01Main2 tm3 = new Test01Main2(99,js);
		System.out.println(tm3.num);
		for (int i = 0; i < tm3.sus.length; i++) {
			System.out.println(tm3.sus[i]);
		}
		
		//3.���������� �̸��迭�� �ʱ�ȭ�ϰ� ���
		String[] names = new String[] {"aaa","bbb"};
		Test01Main2 tm4 = new Test01Main2(names);
		for (int i = 0; i < tm4.names.length; i++) {
			System.out.println(tm4.names[i]);
		}
	}

}
