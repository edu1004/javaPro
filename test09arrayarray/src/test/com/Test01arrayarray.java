package test.com;

public class Test01arrayarray {

	public static void main(String[] args) {
		System.out.println("array~array");
		
		//데이터를 담고싶다>>> 변수 >> 타입지정
		//여러데이터{}를 한곳에 담고싶다>>> 배열[] >> 동일타입만 허용
		//여러개의 배열{{},{}}을 한곳에 담고싶다 >>> 다차원배열[][] >> 동일한 배열타입만
		
		int[] sus0 = new int[5];
//		for (int i = 0; i < sus0.length; i++) {
//			sus0[i] = 100*i;
//		}
		int[] sus1 = new int[4];
		int[] sus2 = new int[3];
		
		int[][] suss = new int[3][3];
		
		
		for (int x = 0; x < suss.length; x++) {
			for (int i = 0; i < suss[x].length; i++) {
				suss[x][i] = 100*i;
			}
		}
		
		System.out.println(suss);
		System.out.println(suss.length);
		for (int x = 0; x < suss.length; x++) {
			System.out.println(suss[x]);
			System.out.println(suss[x].length);
			for (int i = 0; i < suss[x].length; i++) {
				System.out.print(suss[x][i]+" ");
			}
			System.out.println();
		}
		
	}

}
