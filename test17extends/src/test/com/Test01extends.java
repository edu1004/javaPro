package test.com;

/*import java.lang.*;*/

public class Test01extends /*extends Object*/{
	
	public Test01extends() {
		//Object obj = new Object();
		System.out.println(/*obj.*/getClass());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("extends...");
		
//		Test01extends ex = new Test01extends();
		
//		Test01Father father = new Test01Father();
//		Test01Me me = new Test01Me();
//		Test01Child child = new Test01Child();
		
		//상속이 전제로된 다형성을 이용한 객체생성
		Test01Father father = new Test01Me();
		System.out.println(father.lastName);
		
		Test01Father father2 = new Test01Child();
		System.out.println(father2.money);
		
		Test01Me me = new Test01Child();
		System.out.println(me.lastName);
		
		
		
//		
//		System.out.println(me.getName());
//		System.out.println(me.getLastName());
//		System.out.println(child.getLastName());
		
	}

}
