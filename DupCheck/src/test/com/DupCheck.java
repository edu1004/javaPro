package test.com;

public class DupCheck {
	public static void main(String[] args) {
		String[] list = {"aa","aa","bb","bb","aa","bb","cc", "tt", "list", "tt", "list2", "list", "list", "list2", "list3" };
		boolean[] checkList = new boolean[list.length];
		for (int i = 0; i < list.length; i++) {
			if (isNotDup(list, i)) {
				checkList[i] = true;
			}
		}
		// true의 갯수를 체크
		int count = 0;
		for (boolean temp : checkList) {
			if (temp)
				count++;
		}
		// 새로운 배열 생성하여 저장
		String[] newList = new String[count];
		count = 0;
		for (int i = 0; i < list.length; i++) {
			if (checkList[i])
				newList[count++] = list[i];
		}
		// 새로운 배열 출력
		for (String tempStr : newList) {
			System.out.println(tempStr);
		}
	}

	// 배열에 중복되어 있는건지를 체크하여 리턴함
	private static boolean isNotDup(String[] list, int position) {
		for (int i = 0; i < position; i++) {
			if (list[i].equals(list[position]))
				return false;
		}
		return true;
	}
}
