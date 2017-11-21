package test.com;

public class Test02BoardMain {

	public static void main(String[] args) {
		//주어진 Test02BoardDAO인터페이스를
		//상속받는 클래스(Test02BoardDAOimpl)를 구현하고
		//각 메소드들을 콜하고 출력하시오.
		//조건:Test02BoardDAOimpl객체를 직접생성하지말것
		
		Test02BoardDAO dao = new Test02BoardDAOimpl();
		dao.insert(null);
	}

}
