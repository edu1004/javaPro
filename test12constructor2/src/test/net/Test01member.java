package test.net;

public class Test01member {
	// DTO(Data Transfer Object),VO(Value Object) : StudentVO, MemberVO(MemberDTO)
	// DAO(Data Access Object) : StudentDAO,MemberDAO
	// �Է�(insert,Create),����(Update,modify),
	// ����(Delete,remove),�˻�(search,select,Read)
	// CRUD ó�� >>>> ��������� ������ �� �ִ� ���� >> storage(����)
	// ������ ���丮�� >>> DataBase(�����ͺ��̽�:DB)
	// ��ȣ,���̵�,��й�ȣ,�̸�,��ȭ��ȣ
	public int num;
	private String id;
	public String pw;
	public String name;
	public String tel;

	public Test01member() {
		System.out.println("Test01member()...");
		// �⺻�� �ʱ�ȭ�Ұ�
		this.num = 1;
		this.id = "admin";
		this.pw = "hi123456";
		this.name = "kim";
		this.tel = "010";
	}

	// �����ִ� �����ڵ� ����� ���ο��� ��ü���� �� ����ϼ���
	public Test01member(int num, String id, String pw, String name, String tel) {
		System.out.println("Test01member(int num, String id, String pw, String name, String tel)...");
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}
}
