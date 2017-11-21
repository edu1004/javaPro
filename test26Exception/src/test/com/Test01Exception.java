package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01Exception {

	public static void main(String[] args) {
		System.out.println("Exception...");

		//����ó��:�߻��ҿ����� ������ ��ȸ�ϵ��� ó���ϴ� ���
		//�����Ͻ� ����ó��
		//����� ����ó��
		//��������(throws)�� ���� ó��(try~catch)�� �ִ�
		//������������ ����Ǿ������� ���������� �����Ҽ��ֵ���
		//������ ĳġ�ؼ� ó�����ټ� �ִ�.
		
		//1.�����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						System.in));
		try {
			System.out.println("1...1");
			
			int kor = Integer.parseInt(br.readLine());
			System.out.println("1...2");
			
			System.out.println(10/1);
			System.out.println("1...3");
			
			int[] sus = new int[3];
			System.out.println(sus[3]);
			System.out.println("1...4");
			
			System.out.println("2...");
		} catch (IOException e) {
			System.out.println("3...");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("4...������ ���ڸ� �Է��ϼ���");
//			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("5...������");
			e.printStackTrace();
		} 
		System.out.println("end ....");
		
		
	}

}
