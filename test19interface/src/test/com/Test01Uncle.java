package test.com;

public interface Test01Uncle {
	
	//1.��� ���������� �޵�� static,final
	String NAME = "song";
	/*static */String NAME2 = "song2";
	/*static final */String NAME3 = "song3";
	
	//2.�߻�޼ҵ带 ���� �� �ִ�.
	public /*abstract*/ void play();
	
	//3.�߻�޼ҵ尡 �ƴϸ� default or static ���� �ʼ�
	public default void talk() {
		
	}
	public static void talk2() {
		
	}
	
	//4.�����ڰ� ����
	

}
