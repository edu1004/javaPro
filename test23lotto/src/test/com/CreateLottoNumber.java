package test.com;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CreateLottoNumber {

	public static void main(String[] args) {

		// 1.Set사용
		// Set<Integer> set = new TreeSet<Integer>();//오름차순 정렬
		// Random r = new Random();
		// while(set.size()!=6) {
		// set.add(r.nextInt(45)+1);
		// }
		//
		// for (Integer num : set) {
		// System.out.print(num+" ");
		// }

		// 2.일반 배열 사용
		Random r = new Random();
		int[] sus = new int[100];
		for (int i = 0; i < sus.length; i++) {
			sus[i] = r.nextInt(45) + 1;
		}

		// 6개 넣기
		int[] lottoNums = new int[6];
		for (int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = sus[i];
		}

		// 버블 정렬
		int temp = 0;
		for (int x = 0; x < lottoNums.length - 1; x++) {
			for (int i = x; i < lottoNums.length; i++) {
				if (lottoNums[x] > lottoNums[i]) {
					temp = lottoNums[x];
					lottoNums[x] = lottoNums[i];
					lottoNums[i] = temp;
				}
			}
		}

		for (int lottoNum : lottoNums) {
			System.out.println(lottoNum);
		}
		
		//중복체크는 숙제

	}


}
