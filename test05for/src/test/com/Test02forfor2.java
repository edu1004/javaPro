package test.com;

public class Test02forfor2 {

	public static void main(String[] args) {
		System.out.println("for...for");
		//label
		f1:for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
				if(i==4)break f1;
			}
			System.out.println();
		}

		System.out.println();
		f1:for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 10; i++) {
				if(i==4)continue f1;
				System.out.print(i);
			}
			System.out.println();
		}
	}// end main()

}// end class
