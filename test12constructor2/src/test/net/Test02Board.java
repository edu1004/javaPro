package test.net;

import java.util.Date;

public class Test02Board {

	// ��ȣ,����,����,�ۼ���,�ۼ�����
	
	//public : ���� ���� ����,������,�ٸ���Ű��(����),������Ű��,��Ӱ���,��Ŭ���� ��~���ٰ���
	//�����ڰ� �����Ȱ��:default,package������Ű��(����)������,��Ŭ����
	//protected : ��Ű���� �޶� ��Ӱ����̸� ���ٰ���
	//private : �� Ŭ������ ���ٰ���
	int num;
	public String title;
	protected String content;
	private String writer;
	public Date regDate;

	// ���ھ��� ������
	public Test02Board() {
		System.out.println("Test02Board()");
		num = 1;
		title = "";
		content = "";
		writer = "";
		regDate = new Date();
	}

	// ��������� ���� ������
	// ���ھ��� ������
	public Test02Board(int num, String title, String content, 
			String writer, Date regDate) {
		System.out.println("Test02Board(int num, String title, String content, String writer, String regDate)");
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}

	// ���ο��� ���

}
