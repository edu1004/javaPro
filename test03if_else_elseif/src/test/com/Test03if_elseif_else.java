package test.com;

public class Test03if_elseif_else {

	public static void main(String[] args) {
		System.out.println("if~~elseif~~else");
		//if else if ���� ���������� ������
		//���� �������� �����ϰ� ����������
		int su = 5;
		if (su==15) {
			System.out.println("111111");
		}else if (su==5) {
			System.out.println("222222");
		}else if (su==5) {
			System.out.println("333333");
		}else if (su==5) {
			System.out.println("444444");
		}else {
			System.out.println("000000");
		}
		
		
		double avg = 90.0;
		System.out.println("����:"+avg);
		System.out.println("-----------------");
		//char grade = avg>=90 ? 'A': avg>=80 ? 'B': avg>=70 ? 'C': 'D';//���׿���ó���ϼ���
		char grade = 0;
		if (avg>=90) {
			grade = 'A';
		}else if (avg>=80) {
			grade = 'B';
		}else if (avg>=70) {
			grade = 'C';
		}else {
			grade = 'D';
		}
		System.out.println("���:"+grade);
		System.out.println("=================");
		
		
	}

}
