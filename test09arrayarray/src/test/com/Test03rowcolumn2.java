package test.com;

public class Test03rowcolumn2 {

	public static void main(String[] args) {
		//ǥ(���̺�) �������� ��� ��ó�� ����
		
		String[] title = new String[] {"��ȣ","�̸�","����","����","Ű"};
		
		String[] row0 = new String[title.length];
		row0[0] = "1";
		row0[1] = "ȫ�浿";
		row0[2] = "44";
		row0[3] = "��";
		row0[4] = "188";
		String[] row1 = new String[title.length];
		row1[0] = "2";
		row1[1] = "�ڱ浿";
		row1[2] = "34";
		row1[3] = "��";
		row1[4] = "186";
		String[] row2 = new String[title.length];
		row2[0] = "3";
		row2[1] = "��浿";
		row2[2] = "22";
		row2[3] = "��";
		row2[4] = "168";
		
		String[][] data = new String[3][title.length];
		data[0] = row0;
		data[1] = row1;
		data[2] = row2;
		
		
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i]+" ");
		}
		System.out.println();
		for (int x = 0; x < data.length; x++) {
			for (int i = 0; i < data[x].length; i++) {
				System.out.print(data[x][i]+" ");
			}
			System.out.println();
		}
		
	}

}
