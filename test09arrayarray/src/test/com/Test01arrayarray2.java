package test.com;

public class Test01arrayarray2 {

	public static void main(String[] args) {
		System.out.println("array~array");
		
		//kim1,kim2,kim3 �迭�� ������ ����ִ� �迭�� ����ÿ�.
		//��µ��Ͻÿ�.
		
		String[] names0 = new String[3];
		for (int i = 0; i < names0.length; i++) {
			names0[i] = "kim"+(i+1);
		}
		String[] names1 = new String[3];
		for (int i = 0; i < names1.length; i++) {
			names1[i] = "lee"+(i+1);
		}
		String[] names2 = new String[3];
		for (int i = 0; i < names2.length; i++) {
			names2[i] = "han"+(i+1);
		}
		
		
		String[][] namess = new String[3][3];
		namess[0] = names0;
		namess[1] = names1;
		namess[2] = names2;
		
				
		System.out.println(namess);
		System.out.println(namess.length);
		for (int x = 0; x < namess.length; x++) {
//			System.out.println(namess[x]);
//			System.out.println(namess[x].length);
			for (int i = 0; i < namess[x].length; i++) {
				System.out.print(namess[x][i]);
			}
			System.out.println();
		}
		
	}

}
