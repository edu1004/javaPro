package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("main...");
		
		Test02AAA ta = new Test02AAA();
		System.out.println(ta);
		System.out.println(ta.num);
		System.out.println(ta.name);
		System.out.println(ta.tel);
		
		//99,lee,080���� �ִ� �����ڸ� ����� ��ü������ ����ϼ���
		Test02AAA ta2 = new Test02AAA(99,"lee","080");
		System.out.println(ta2.num);
		System.out.println(ta2.name);
		System.out.println(ta2.tel);
		
		//Test02BBB �� �⺻Ÿ�ԼӼ��� �迭Ÿ�ԼӼ��� �����
		//��ü���� �� �ʱ�ȭ �ϼ���.
		Test02BBB tb = new Test02BBB(99,3.14,new String[] {"hp01","sm02"});
		System.out.println(tb.num);
		System.out.println(tb.avg);
		System.out.println(tb.models.length);
		for (int i = 0; i < tb.models.length; i++) {
			System.out.println(tb.models[i]);
		}
		
		//Test02BBB �� Test02AAA�Ӽ��� �߰��Ͻð� �ʱ�ȭ �� ���
		Test02BBB tb2 = new Test02BBB(ta);
		System.out.println(tb2);
		System.out.println(tb2.ta);
		System.out.println(tb2.ta.num);
		System.out.println(tb2.ta.name);
		System.out.println(tb2.ta.tel);
		
	}

}
