package test.com;

public class Test03Main {

	public static void main(String[] args) {
		System.out.println("main..");

		//학생객체에 속성을 부여하고
		//객체를 생성하시오.
		Test03Student st = new Test03Student();
		Test03Student st2 = new Test03Student(2,"lee",99,88,77);
		
		
		//성적객체에 학생 속성을 부여하고
		//객체를 생성하시오.
		Test03Score sc = new Test03Score();
		Test03Score sc2 = new Test03Score(st);
		Test03Score sc3 = new Test03Score(st2);
		
		//학생배열을 만들고 출력
		Test03Student[] strs = new Test03Student[3];
		strs[0] = new Test03Student(1,"lee1",11,11,11);
		strs[1] = new Test03Student(2,"lee2",22,22,22);
		strs[2] = new Test03Student(3,"lee3",33,33,33);
		
		
		System.out.println(strs);
		System.out.println(strs.length);
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i].num+":"+strs[i].name+":"+strs[i].kor+":"+strs[i].eng+":"+strs[i].math);
		}
		
	}

}
