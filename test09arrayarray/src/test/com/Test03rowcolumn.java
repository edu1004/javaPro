package test.com;

public class Test03rowcolumn {

	public static void main(String[] args) {
		//표(테이블) 구조상의 행과 열처리 연습
		int[] sus0 = new int[] {1,2,3,4};
		int[] sus1 = new int[] {5,6,7,8};
		int[] sus2 = new int[] {9,10,11,12};
		int[] sus3 = new int[] {13,14,15,16};
		
		int[][] suss = new int[4][4];
		
		suss[0] = sus0;
		suss[1] = sus1;
		suss[2] = sus2;
		suss[3] = sus3;
		
		for (int x = 0; x < suss.length; x++) {
			for (int i = 0; i < suss[x].length; i++) {
				System.out.print(suss[x][i]+" ");
			}
			System.out.println();
		}
		
		///////////////////////////
		
		char[] cs0 = new char[] {'A','B','C','D'};
		char[] cs1 = new char[] {'E','F'};
		char[] cs2 = new char[] {'G','H','I'};
		
		char[][] css = new char[3][4];
		css[0] = cs0;
		css[1] = cs1;
		css[2] = cs2;
		
		for (int x = 0; x < css.length; x++) {
			for (int i = 0; i < css[x].length; i++) {
				System.out.print(css[x][i]);
			}
			System.out.println();
		}
		
		//////////////////////

	}

}
