package test.net;

public class Test01member {
	// DTO(Data Transfer Object),VO(Value Object) : StudentVO, MemberVO(MemberDTO)
	// DAO(Data Access Object) : StudentDAO,MemberDAO
	// 입력(insert,Create),수정(Update,modify),
	// 삭제(Delete,remove),검색(search,select,Read)
	// CRUD 처리 >>>> 장기적으로 보관할 수 있는 공간 >> storage(개념)
	// 물리적 스토리지 >>> DataBase(데이터베이스:DB)
	// 번호,아이디,비밀번호,이름,전화번호
	public int num;
	private String id;
	public String pw;
	public String name;
	public String tel;

	public Test01member() {
		System.out.println("Test01member()...");
		// 기본값 초기화할것
		this.num = 1;
		this.id = "admin";
		this.pw = "hi123456";
		this.name = "kim";
		this.tel = "010";
	}

	// 인자있는 생성자도 만들고 메인에서 객체생성 및 출력하세요
	public Test01member(int num, String id, String pw, String name, String tel) {
		System.out.println("Test01member(int num, String id, String pw, String name, String tel)...");
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}
}
