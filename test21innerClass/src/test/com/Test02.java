package test.com;

public class Test02 {
	Object object;
	Test01Anonymous am;
	public Test02(Object object) {
		this.object = object;
	}
	
	public Test02(Test01Anonymous am) {
		am.aaa();
		this.am = am;
	}

	public Test02() {
		// TODO Auto-generated constructor stub
	}

	public void addListener(Test01Anonymous am) {
		am.aaa();
		
	}
	public void addListener(Test01Anonymous2 am) {
		am.bbb();
		
	}
	public void addListener(Test01Anonymous3 am) {
		am.ccc();
		
	}

}
