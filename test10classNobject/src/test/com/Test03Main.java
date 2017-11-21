package test.com;

public class Test03Main {

	public static void main(String[] args) {
		System.out.println("car...");
		
		Test03car c01 = new Test03car();
		System.out.println(c01);
		
		System.out.println(c01.model);
		System.out.println(c01.price);
		System.out.println(c01.yunbi);
		System.out.println(c01.color);
		
		Test03car c02 = new Test03car();
		System.out.println(c02);
		c02.model = "audi";
		c02.price = 50000000;
		c02.yunbi = 8;
		c02.color = "white";
		
		System.out.println(c02.model);
		System.out.println(c02.price);
		System.out.println(c02.yunbi);
		System.out.println(c02.color);
		
		Test03car c03 = new Test03car();
		System.out.println(c03);
		c03.model = "LandRover";
		c03.price = 200000000;
		c03.yunbi = 6;
		c03.color = "black";
		
		System.out.println(c03.model);
		System.out.println(c03.price);
		System.out.println(c03.yunbi);
		System.out.println(c03.color);

	}

}
