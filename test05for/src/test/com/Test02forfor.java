package test.com;

public class Test02forfor {

	public static void main(String[] args) {
		System.out.println("for...for");
		
		
		// 0123456789
		// 0123456789
		// 0123456789
		for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
				if(i==3) {
					break;
				}
				//if���� ���� ������ ���� ����� ���� ����������
			}
			System.out.println();
		}

		/////////¦����3�� ����ϱ�/////////////////////////////////
		// 02468
		// 02468
		// 02468
		for (int x = 0; x < 3; x++) {
			System.out.println("======");
			for (int i = 0; i < 10; i++) {
				if (i % 2 != 0) {
					System.out.print(i);
				}
			}
			System.out.println();
		}

		for (int x = 0; x < 3; x++) {
			System.out.println("======");
			for (int i = 0; i < 10; i += 3) {
				System.out.print(i);
			}
			System.out.println();
		}

		// ������
		// 2*1=2 2*2=4 ... 2*9=18
		// 3*1=3 3*2=6 ... 3*9=27
		// ....
		// 9*1=9 9*2=18 ... 9*9=81
		int start = 3;
		int end = 5;
		if (start > end || start < 2) {
			System.out.println("���۴��� ���ܺ��� �۰ų� 2�����Է�");
		} else {
			for (int x = start; x < end + 1; x++) {
				for (int i = 1; i < 10; i++) {
					System.out.print(x + "*" + i + "=" + x * i + "\t");
				}
				System.out.println();
			}
		}
		
		//���ĺ��� a~z���� ���η� ����ϵ�
		//3�� ����ϼ���
		for (int x = 0; x < 3; x++) {
			for (int i = 97; i < 97+26; i++) {
				if(i=='l') {
					continue;
				}
				//if���� ���� ������ ���� ����� ���� �����ΰ���
				System.out.print((char)i);
				
			}
			System.out.println();
		}
		

	}// end main()

}// end class
