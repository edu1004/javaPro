package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02AAA {

	public int insert() throws IOException {
		System.out.println("insert()...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		return 0;
	}

	public int update() {
		System.out.println("update()...");
		BufferedReader br = null;
		int flag = 0;
		try {
			System.out.println(10 / 0);
			br = new BufferedReader(new InputStreamReader(System.in));
			String name = br.readLine();
			flag = 1;
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ArithmeticException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if(br!=null) {//nullüũ�ϴ� ����ó��
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("�����߻� ������ ������� �ݵ�� �����ϴ� ��");
		}
		return flag;
	}

}
