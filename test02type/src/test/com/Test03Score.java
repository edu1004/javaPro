package test.com;

public class Test03Score {

	public static void main(String[] args) {
		System.out.println("=================");
		System.out.println("����ó�����α׷�");
		System.out.println("=================");
		System.out.println("���������� �Է��ϼ���.");
		int kor = 99;
		System.out.println(kor);
		System.out.println("-----------------");
		System.out.println("���������� �Է��ϼ���.");
		int eng = 50;
		System.out.println(eng);
		System.out.println("-----------------");
		System.out.println("���������� �Է��ϼ���.");
		int math = 50;
		System.out.println(math);
		System.out.println("-----------------");
		int total = kor+eng+math;
		System.out.println("����:"+total);
		System.out.println("-----------------");
		double avg = (double)total/3;
		System.out.println("����:"+avg);
		System.out.println("-----------------");
		char grade = avg>=90 ? 'A': avg>=80 ? 'B': avg>=70 ? 'C': 'D';//���׿���ó���ϼ���
		System.out.println("���:"+grade);
		System.out.println("=================");
		
	}

}
