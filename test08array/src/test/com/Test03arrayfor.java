package test.com;

public class Test03arrayfor {

	public static void main(String[] args) {
		System.out.println("array...");
		
		//KIM1,KIM2,KIM3 이라는 3명의 이름을 배열에
		//할당하고 출력하시오.(반복문사용할것)
		String[] names = new String[3];
		for (int i = 0; i < names.length; i++) {
			names[i] = "KIM"+(i+1);
		}
		
		
		System.out.println(names);
		System.out.println(names.length);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
