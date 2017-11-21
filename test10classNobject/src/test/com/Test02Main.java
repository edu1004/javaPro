package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Test02Main");
		
		Test02notebook notebook = new Test02notebook();
		System.out.println(notebook);
		System.out.println(notebook.num);
		System.out.println(notebook.model);
		System.out.println(notebook.size);
		System.out.println(notebook.price);
		
		Test02notebook notebook2 = new Test02notebook();
		System.out.println(notebook2);
		notebook2.num = 2;
		notebook2.model = "hp002";
		notebook2.size = 17.0;
		notebook2.price = 1600000;
		System.out.println(notebook2.num);
		System.out.println(notebook2.model);
		System.out.println(notebook2.size);
		System.out.println(notebook2.price);
		
		Test02notebook notebook3 = new Test02notebook();
		System.out.println(notebook3);
		notebook3.num = 3;
		notebook3.model = "hp003";
		notebook3.size = 13.6;
		notebook3.price = 1300000;
		
		System.out.println(notebook3.num);
		System.out.println(notebook3.model);
		System.out.println(notebook3.size);
		System.out.println(notebook3.price);

	}

}
