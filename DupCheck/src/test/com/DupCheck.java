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
		// true�� ������ üũ
		int count = 0;
		for (boolean temp : checkList) {
			if (temp)
				count++;
		}
		// ���ο� �迭 �����Ͽ� ����
		String[] newList = new String[count];
		count = 0;
		for (int i = 0; i < list.length; i++) {
			if (checkList[i])
				newList[count++] = list[i];
		}
		// ���ο� �迭 ���
		for (String tempStr : newList) {
			System.out.println(tempStr);
		}
	}

	// �迭�� �ߺ��Ǿ� �ִ°����� üũ�Ͽ� ������
	private static boolean isNotDup(String[] list, int position) {
		for (int i = 0; i < position; i++) {
			if (list[i].equals(list[position]))
				return false;
		}
		return true;
	}
}
