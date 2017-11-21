package test.com;

public interface Test01Uncle {
	
	//1.모든 전역변수는 받드시 static,final
	String NAME = "song";
	/*static */String NAME2 = "song2";
	/*static final */String NAME3 = "song3";
	
	//2.추상메소드를 갖을 수 있다.
	public /*abstract*/ void play();
	
	//3.추상메소드가 아니면 default or static 선언 필수
	public default void talk() {
		
	}
	public static void talk2() {
		
	}
	
	//4.생성자가 없다
	

}
