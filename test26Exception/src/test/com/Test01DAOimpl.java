package test.com;

import java.util.ArrayList;
import java.util.List;

public class Test01DAOimpl implements Test01DAO {

	List<Test01VO> list = new ArrayList<Test01VO>();

	public Test01DAOimpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("jdbc driver successed");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver failed");
			e.printStackTrace();
		}
	}

	@Override
	public int insert(Test01VO vo) {
		System.out.println("insert()");
		System.out.println(vo.getNum());
		System.out.println(vo.getName());
		int flag = 0;
		try {
			list.add(vo);
			flag = 1;
		} catch (Exception e) {
			flag = 0;
		} finally {
			System.out.println("finally");
		}

		return flag;
	}

	@Override
	public List<Test01VO> selectAll() {
		System.out.println("selectAll()...");
		List<Test01VO> list = new ArrayList<Test01VO>();
		try {
			list = this.list;
		} catch (Exception e) {
			System.out.println("error");
		} finally {
			System.out.println("finally");
		}

		return list;
	}

	@Override
	public int update(Test01VO vo) {
		System.out.println("update()");
		System.out.println(vo.getNum());
		System.out.println(vo.getName());
		int flag = 0;
		try {
			list.set(vo.getNum() - 1, vo);
			flag = 1;
		} catch (Exception e) {
			flag = 0;
		} finally {
			System.out.println("finally");
		}

		return flag;
	}

	@Override
	public int delete(Test01VO vo) {
		System.out.println("delete()");
		System.out.println(vo.getNum());
		int flag = 0;
		try {
			list.remove(vo.getNum() - 1);
			flag = 1;
		} catch (Exception e) {
			flag = 0;
		} finally {
			System.out.println("finally");
		}

		return flag;
	}

	@Override
	public Test01VO selectOne(Test01VO vo) {
		System.out.println("selectOne()");
		System.out.println(vo.getNum());

		Test01VO vo2 = new Test01VO();

		try {
			vo2 = list.get(vo.getNum() - 1);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("finally");
		}

		return vo2;
	}

}
