package test.com;

public class Test01interface {

	public static void main(String[] args) {
		System.out.println("interface...");
		
		//Ŭ�������� ����� ���߻���� �������� �ʴ´�.
		//���߻���� �����ϴ� ����� �ʿ�ԵǾ ����� �Ȱ��� �������̽�
		//Ŭ������ �������̽��� ��ӹ����� implements �����ϰ� ����Ѵ�.
		System.out.println(Test01Uncle.NAME);
		
		Test01Me me = new Test01Me();
		me.getMoney();
		me.talk();
		
		Test01Uncle uncle = new Test01Uncle() {
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				
			}
		};
		Test01Uncle uncle2 = new Test01Me();
		
		Test01Friend friend = new Test01Friend() {
			
			@Override
			public int getMoney() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Test01Friend friend2 = new Test01Me();
		
	}
}
