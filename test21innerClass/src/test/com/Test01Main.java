package test.com;

import test.com.Test01Member.Test01inner;

public class Test01Main {
	
	//�Ӽ�:�ɹ��ʵ�,��������
	String name = "kim";
	
	//����:�޼ҵ�,�Լ�,���
	
	
	//������:����Ʈ����
	
	
	//Ŭ����
	Test01Anonymous3 am3 = new Test01Anonymous3() {
		
		@Override
		public void ccc() {
			System.out.println("ccc()..."+name);
		}
	};

	public static void main(String[] args) {
		System.out.println("inner class");
		
		//����Ŭ����:Ŭ���� ���ο� Ŭ������ �����ϸ� ����Ŭ����
		//�ٸ� ���δ� ��øŬ������� �Ѵ�.
		//������ : �ܺ�Ŭ������ ������������ ��ü�������� �����ϰ��� �Ҷ�
		
		//1.member inner
		Test01Member mOuter = new Test01Member();
//		mOuter.testOuter();
		Test01inner mInner1 = new Test01Member().new Test01inner(); 
		Test01Member.Test01inner mInner2 = mOuter.new Test01inner(); 
		mInner1.testInner();
		System.out.println(mInner1.userName);
		
		
		//2.static inner
		System.out.println(Test01static.Test01inner.userName);//R.layout.AAA

		Test01static.Test01inner sInner = new Test01static.Test01inner();
		
		
		//3.local inner
		//final �������
		
		
		//4.�͸�(����) ����Ŭ���� anonymous inner
		String userName = "kim";
//		userName = "lee";
		Test01Anonymous am1 = new Test01Anonymous(){
			String name;
			public void run() {
				System.out.println("xxx()"+userName);
			}
			public void move() {
				run();
			}
			@Override
			public void aaa() {
				move();
			}
		};
		am1.aaa();
		
		Test01Anonymous2 am2 = new Test01Anonymous2() {
			public void move() {
				
			}
			@Override
			public void bbb() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Test01Main main = new Test01Main();
		main.am3.ccc();
		
		
		
		
		
	}

}
