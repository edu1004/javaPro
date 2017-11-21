package test.com;

public class Test02DAO {
	
	Test02Person vo;
	
	public Test02DAO() {
		
	}
	public Test02DAO(Test02Person vo) {
		this.vo = vo;
	}
	public Test02DAO(Test02Animal vo) {
//		this.vo = (Test02Person) vo;
	}
	
	public int insert(Test02Teacher vo) {
		return 0;
	}
	public int insert(Test02Person vo) {
		return 0;
	}
	
	public Test02Person selectOne(Test02Person vo) {
//		return new Test02Student();
		return new Test02Student();
//		return new Test02Teacher();
	}
	public Test02Student[] selectAll() {
		return null;
	}

}
