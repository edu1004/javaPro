package test.com;

public class Test02arrayfor {

	public static void main(String[] args) {
		// �迭�� ������ �ݺ����� �̿��ؼ�
		// ���� �Ǵ� �˻��ϱ�
		
		double[] ds = new double[5];//0.0,0.0, 0.0,0.0,0.0
		//2.for���� �̿��ؼ� �������غ�����
		for (int i = 0; i < ds.length; i++) {
			ds[i] = 3.14;
		}
		
		//1.for���� �̿��ؼ� ����ϼ���
//		System.out.println(ds[0]);
//		System.out.println(ds[1]);
//		System.out.println(ds[2]);
//		System.out.println(ds[3]);
//		System.out.println(ds[4]);
		System.out.println(ds);
		System.out.println(ds.length);
		for (int i = 0; i < ds.length; i++) {
			System.out.println(i+":"+ds[i]);
		}
		
		
		//��,����,��,�������� ���� boolean type�迭�� �ݺ������̿��Ͽ�
		//���� �Ҵ��ϰ� ����Ͻÿ�.
		boolean[] bs = new boolean[4];
		for (int i = 0; i < bs.length; i++) {
			if(i%2==0) bs[i] = true;
		}
		
		
		System.out.println(bs);
		System.out.println(bs.length);
		for (int i = 0; i < bs.length; i++) {
			System.out.println(i+":"+bs[i]);
		}

	}

}
