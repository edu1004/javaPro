package test.com;

public class Test02BoardMain {

	public static void main(String[] args) {
		//�־��� Test02BoardDAO�������̽���
		//��ӹ޴� Ŭ����(Test02BoardDAOimpl)�� �����ϰ�
		//�� �޼ҵ���� ���ϰ� ����Ͻÿ�.
		//����:Test02BoardDAOimpl��ü�� ����������������
		
		Test02BoardDAO dao = new Test02BoardDAOimpl();
		dao.insert(null);
	}

}
