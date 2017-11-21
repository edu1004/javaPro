package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class Test04MainBoard {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		//게시판 프로그램
		//1.글쓰기 2.글수정 3.글삭제 4.글목록 5.글검색
		//1선택 >> insert
			//글번호는 자동입력
			//제목을 입력하세요
			//내용을 입력하세요
			//작성자를 입력하세요
			//작성일자는 시스템시간 할것
		//2선택 >> update
			//수정할 글번호를 입력하세요
			//수정할 제목을 입력하세요
			//수정할 내용을 입력하세요
			//수정할 작성자를 입력하세요
			//수정할 작성일자는 시스템시간 할것
		//3선택 >> delete
			//삭제할 글번호를 입력하세요
		//4선택 >> selectAll
			// 1 : java시간 : 잼나다 : 양샘1 : 2017.~~~
			// 2 : 점심시간 : 맛있다 : 양샘2 : 2017.~~~
			// 3 : 퇴근시간 : 즐겁다 : 양샘3 : 2017.~~~
		//5선택 >> selectOne
			//검색할 글번호를 입력하세요
		Test03BoardDAO bDAO = new Test03BoardDAO();
		
		
		String x = "";
		do{
			
			System.out.println("===================");
			System.out.println("   게시판 프로그램");
			System.out.println("===================");
			System.out.println("1.글쓰기 2.글수정 3.글삭제 4.글목록 5.글검색");
			System.out.println("====================================");
			System.out.println("메뉴선택 : ");
			String menu = br.readLine();
			
			if(menu.equals("1")) {
				System.out.println("----------------");
				System.out.println("---1.글쓰기-----");
				System.out.println("----------------");
				System.out.println("제목을 입력하세요");
				String title = "title";
				System.out.println("내용을 입력하세요");
				String content = "content";
				System.out.println("작성자을 입력하세요");
				String writer = "writer";
				
				
				Test03BoardVO bvo = new Test03BoardVO();
				bvo.setTitle(title);
				bvo.setContent(content);
				bvo.setWriter(writer);
				int result = bDAO.insert(bvo);
				System.out.println("insert:" + result);
				System.out.println("---글쓰기 완료------");
			}else if(menu.equals("4")) {
				System.out.println("----------------");
				System.out.println("---4. 글목록-----");
				
				Test03BoardVO[] vos = bDAO.selectAll();
				System.out.println(vos.length);
				for (int i = 0; i < vos.length; i++) {
					System.out.print(vos[i].getNum()+":");
					System.out.print(vos[i].getTitle()+":");
					System.out.print(vos[i].getContent()+":");
					System.out.print(vos[i].getWriter()+":");
					System.out.println(vos[i].getRegDate());
				}
				System.out.println("----------------");
			}else if(menu.equals("2")) {
				System.out.println("----------------");
				System.out.println("---2.글수정-----");
				System.out.println("----------------");
				System.out.println("수정할 글번호를 입력하세요");
				String num = "2";
				System.out.println("수정할 제목을 입력하세요");
				String title = "title2";
				System.out.println("수정할 내용을 입력하세요");
				String content = "content2";
				System.out.println("수정할 작성자을 입력하세요");
				String writer = "writer2";
				
				Test03BoardVO bvo3 = new Test03BoardVO();
				bvo3.setNum(Integer.parseInt(num));
				bvo3.setTitle(title);
				bvo3.setContent(content);
				bvo3.setWriter(writer);
				int result2 = bDAO.update(bvo3);
				System.out.println("update:" + result2);
				System.out.println("---글수정 완료------");
				
			}else if(menu.equals("3")) {
				System.out.println("----------------");
				System.out.println("---3.글삭제-----");
				System.out.println("----------------");
				System.out.println("수정할 글번호를 입력하세요");
				String num = "2";
				
				Test03BoardVO bvo4 = new Test03BoardVO();
				bvo4.setNum(Integer.parseInt(num));
				int result3 = bDAO.delete(bvo4);
				System.out.println("delete:" + result3);
				System.out.println("---글삭제 완료------");
			}else if(menu.equals("5")) {
				System.out.println("----------------");
				System.out.println("---5.글검색-----");
				System.out.println("----------------");
				System.out.println("검색할 글번호를 입력하세요");
				String num = "2";
				
				Test03BoardVO bvo2 = new Test03BoardVO();
				bvo2.setNum(Integer.parseInt(num));
				Test03BoardVO bvo5 = bDAO.selectOne(bvo2);
				System.out.print(bvo5.getNum()+":");
				System.out.print(bvo5.getTitle()+":");
				System.out.print(bvo5.getContent()+":");
				System.out.print(bvo5.getWriter()+":");
				System.out.println(bvo5.getRegDate());
				
				System.out.println("---글검색 완료------");
			}
			
			System.out.println("종료시 x입력,계속은 enter...");
			x = br.readLine();
		}while(!x.equals("x"));

		
		System.out.println("프로그램 종료..");
	}

}
