package test.net;

import java.util.Date;

public class Test02Board {

	// 번호,제목,내용,작성자,작성일자
	
	//public : 가장 넓은 범위,범용사용,다른패키지(폴더),같은패키지,상속관계,내클래스 다~접근가능
	//제한자가 생략된경우:default,package같은패키지(폴더)에서만,내클래스
	//protected : 패키지가 달라도 상속관계이면 접근가능
	//private : 내 클래스만 접근가능
	int num;
	public String title;
	protected String content;
	private String writer;
	public Date regDate;

	// 인자없는 생성자
	public Test02Board() {
		System.out.println("Test02Board()");
		num = 1;
		title = "";
		content = "";
		writer = "";
		regDate = new Date();
	}

	// 멤버값들을 갖는 생성자
	// 인자없는 생성자
	public Test02Board(int num, String title, String content, 
			String writer, Date regDate) {
		System.out.println("Test02Board(int num, String title, String content, String writer, String regDate)");
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}

	// 메인에서 출력

}
