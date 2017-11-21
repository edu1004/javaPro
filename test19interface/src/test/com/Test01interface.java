package test.com;

public class Test01interface {

	public static void main(String[] args) {
		System.out.println("interface...");
		
		//클래스간의 상속은 다중상속을 지원하지 않는다.
		//다중상속을 지원하는 대상이 필요게되어서 만들게 된것이 인터페이스
		//클래스가 인터페이스를 상속받을때 implements 선언하고 명시한다.
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
