package test.com;

public class Test03Score {

	public static void main(String[] args) {
		System.out.println("=================");
		System.out.println("성적처리프로그램");
		System.out.println("=================");
		System.out.println("국어점수를 입력하세요.");
		int kor = 99;
		System.out.println(kor);
		System.out.println("-----------------");
		System.out.println("영어점수를 입력하세요.");
		int eng = 50;
		System.out.println(eng);
		System.out.println("-----------------");
		System.out.println("수학점수를 입력하세요.");
		int math = 50;
		System.out.println(math);
		System.out.println("-----------------");
		int total = kor+eng+math;
		System.out.println("총점:"+total);
		System.out.println("-----------------");
		double avg = (double)total/3;
		System.out.println("평점:"+avg);
		System.out.println("-----------------");
		char grade = avg>=90 ? 'A': avg>=80 ? 'B': avg>=70 ? 'C': 'D';//삼항연산처리하세요
		System.out.println("등급:"+grade);
		System.out.println("=================");
		
	}

}
