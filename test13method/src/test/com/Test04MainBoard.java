package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class Test04MainBoard {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		//�Խ��� ���α׷�
		//1.�۾��� 2.�ۼ��� 3.�ۻ��� 4.�۸�� 5.�۰˻�
		//1���� >> insert
			//�۹�ȣ�� �ڵ��Է�
			//������ �Է��ϼ���
			//������ �Է��ϼ���
			//�ۼ��ڸ� �Է��ϼ���
			//�ۼ����ڴ� �ý��۽ð� �Ұ�
		//2���� >> update
			//������ �۹�ȣ�� �Է��ϼ���
			//������ ������ �Է��ϼ���
			//������ ������ �Է��ϼ���
			//������ �ۼ��ڸ� �Է��ϼ���
			//������ �ۼ����ڴ� �ý��۽ð� �Ұ�
		//3���� >> delete
			//������ �۹�ȣ�� �Է��ϼ���
		//4���� >> selectAll
			// 1 : java�ð� : �볪�� : ���1 : 2017.~~~
			// 2 : ���ɽð� : ���ִ� : ���2 : 2017.~~~
			// 3 : ��ٽð� : ��̴� : ���3 : 2017.~~~
		//5���� >> selectOne
			//�˻��� �۹�ȣ�� �Է��ϼ���
		Test03BoardDAO bDAO = new Test03BoardDAO();
		
		
		String x = "";
		do{
			
			System.out.println("===================");
			System.out.println("   �Խ��� ���α׷�");
			System.out.println("===================");
			System.out.println("1.�۾��� 2.�ۼ��� 3.�ۻ��� 4.�۸�� 5.�۰˻�");
			System.out.println("====================================");
			System.out.println("�޴����� : ");
			String menu = br.readLine();
			
			if(menu.equals("1")) {
				System.out.println("----------------");
				System.out.println("---1.�۾���-----");
				System.out.println("----------------");
				System.out.println("������ �Է��ϼ���");
				String title = "title";
				System.out.println("������ �Է��ϼ���");
				String content = "content";
				System.out.println("�ۼ����� �Է��ϼ���");
				String writer = "writer";
				
				
				Test03BoardVO bvo = new Test03BoardVO();
				bvo.setTitle(title);
				bvo.setContent(content);
				bvo.setWriter(writer);
				int result = bDAO.insert(bvo);
				System.out.println("insert:" + result);
				System.out.println("---�۾��� �Ϸ�------");
			}else if(menu.equals("4")) {
				System.out.println("----------------");
				System.out.println("---4. �۸��-----");
				
				Test03BoardVO[] vos = bDAO.selectAll();
				System.out.println(vos.length);
				for (int i = 0; i < vos.length; i++) {
					System.out.print(vos[i].getNum()+":");
					System.out.print(vos[i].getTitle()+":");
					System.out.print(vos[i].getContent()+":");
					System.out.print(vos[i].getWriter()+":");
					System.out.println(vos[i].getRegDate());
				}
				System.out.println("----------------");
			}else if(menu.equals("2")) {
				System.out.println("----------------");
				System.out.println("---2.�ۼ���-----");
				System.out.println("----------------");
				System.out.println("������ �۹�ȣ�� �Է��ϼ���");
				String num = "2";
				System.out.println("������ ������ �Է��ϼ���");
				String title = "title2";
				System.out.println("������ ������ �Է��ϼ���");
				String content = "content2";
				System.out.println("������ �ۼ����� �Է��ϼ���");
				String writer = "writer2";
				
				Test03BoardVO bvo3 = new Test03BoardVO();
				bvo3.setNum(Integer.parseInt(num));
				bvo3.setTitle(title);
				bvo3.setContent(content);
				bvo3.setWriter(writer);
				int result2 = bDAO.update(bvo3);
				System.out.println("update:" + result2);
				System.out.println("---�ۼ��� �Ϸ�------");
				
			}else if(menu.equals("3")) {
				System.out.println("----------------");
				System.out.println("---3.�ۻ���-----");
				System.out.println("----------------");
				System.out.println("������ �۹�ȣ�� �Է��ϼ���");
				String num = "2";
				
				Test03BoardVO bvo4 = new Test03BoardVO();
				bvo4.setNum(Integer.parseInt(num));
				int result3 = bDAO.delete(bvo4);
				System.out.println("delete:" + result3);
				System.out.println("---�ۻ��� �Ϸ�------");
			}else if(menu.equals("5")) {
				System.out.println("----------------");
				System.out.println("---5.�۰˻�-----");
				System.out.println("----------------");
				System.out.println("�˻��� �۹�ȣ�� �Է��ϼ���");
				String num = "2";
				
				Test03BoardVO bvo2 = new Test03BoardVO();
				bvo2.setNum(Integer.parseInt(num));
				Test03BoardVO bvo5 = bDAO.selectOne(bvo2);
				System.out.print(bvo5.getNum()+":");
				System.out.print(bvo5.getTitle()+":");
				System.out.print(bvo5.getContent()+":");
				System.out.print(bvo5.getWriter()+":");
				System.out.println(bvo5.getRegDate());
				
				System.out.println("---�۰˻� �Ϸ�------");
			}
			
			System.out.println("����� x�Է�,����� enter...");
			x = br.readLine();
		}while(!x.equals("x"));

		
		System.out.println("���α׷� ����..");
	}

}
