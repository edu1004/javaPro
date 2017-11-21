package test.com;

public class Test01this_super extends Test01Super{
	String name;
	int age;
	int age2;
	int age3;
	public Test01this_super() {
		super("admin");
		System.out.println("Test01this_super()");
		System.out.println(id);
		System.out.println(pw);
		name = "kim";
		age = 11111;
		age2 = 22;
		age3 = 33;
	}
	
	public Test01this_super(String name) {
		//this();
		System.out.println("Test01this_super(String name)");
		this.name = name;
	}
	public Test01this_super(int age) {
		this("han");
		System.out.println("Test01this_super(String name,int age)");
	}
	

	public static void main(String[] args) {
		System.out.println("this()...super()");
		

		Test01this_super ts = new Test01this_super();
//		ts = new Test01this_super("lee");
//		
//		System.out.println(ts.name);
//		System.out.println(ts.age);
//		System.out.println(ts.age2);
//		System.out.println(ts.age3);
		
	}

}
