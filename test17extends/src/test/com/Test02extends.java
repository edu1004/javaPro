package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test02extends {

	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Test02Animal();
		Object obj3 = new Test02Person();
		Object obj4 = new Test02Student();
		Object obj5 = new Test02Teacher();
		
		Test02Animal animal = new Test02Animal();
		animal.move();
		Test02Animal animal2 = new Test02Person();
		Test02Animal animal3 = new Test02Student();
		Test02Animal animal4 = new Test02Teacher();
		
		System.out.println("===========");
		Test02Person person = new Test02Person();
		person.talk();
		Test02Person person2 = new Test02Student();
		Test02Person person3 = new Test02Teacher();
		
		System.out.println("===========");
		Test02Student student = new Test02Student();
		student.study();
		
		System.out.println("===========");
		Test02Teacher teacher = new Test02Teacher();	
		teacher.teach();
		///////////////////////
		
		Test02Teacher teacher2 = (Test02Teacher)person3;
		Test02Teacher teacher3 = (Test02Teacher)animal4;
		Test02Teacher teacher4 = (Test02Teacher)obj5;
//		System.out.println(teacher2.armcount);
		
		
		Test02DAO dao = new Test02DAO();
		dao.insert(teacher);
		dao.insert((Test02Teacher)person3);
		dao.insert(person);
		dao.insert(person2);
		dao.insert(person3);
		
		Test02DAO dao2 = new Test02DAO(new Test02Person());
		Test02DAO dao3 = new Test02DAO(new Test02Student());
		Test02DAO dao4 = new Test02DAO(new Test02Teacher());
		
		Test02DAO dao5 = new Test02DAO(animal2);
		
		Test02Person aaa = dao5.selectOne(teacher4);
		
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
//		FileReader fr = new FileReader(new File(""));
//		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("---------");
	}

}
