package test.com;

public class Test02Operator {

	public static void main(String[] args) {

		System.out.println("Operator");
		//������ (int):ĳ���ÿ�����,(�����)�켱������
		// ,(���Ῥ����) , .(���Կ�����), ...(�迭ǥ��������)
		int x1 = 0,y1,z1;
		
		System.out.println(x1);
		//1.���������	+,-,*,/,%
		System.out.println((1+2)*3/4);
		
		//2.���Կ����� = , +=, -=, *=, /=, %=, &=, |=, ^=
		x1+=2;
		x1+=2;
		x1+=2;
		x1+=3;
		x1+=3;
		x1+=10;
		
		//3.��Ʈ������ &, |, ^
		//4,�������� &&, ||, &,|   >>> ����� ��,����
		//true, false
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & 5==5?true:false);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | false);

		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		//5.�񱳿����� ==,!=,>,<,>=,<=
		//������� �ݵ�� true,false >> boolean type
		System.out.println(5==5);
		System.out.println((5 == 5) && (5 > 5));
		
		System.out.println((55-50 == 5) && (5 > 5));
		int x = 0;
		x = 55-50;
		System.out.println((x == 5) && (5 > 5));
		
		//6.����(������ ���ҿ���)���� : ++,--
		int y = 5;
		y++;//y���� 1�������Ѷ�.������ ����
		++y;
		System.out.println(y);
		
		//���ǻ���:������ �켱������ �����Ұ�.
		int a = 10;
		//int b = ++a;
		int b = a++;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		//7.����Ʈ ����: >> ,<<, >>>
		System.out.println(8 >> 2);//0010 �������� 2ĭ�� �̵�
		System.out.println(-8 >> 2);//0010 �������� 2ĭ�� �̵�
		System.out.println(2 << 2);//1000 �������� 2ĭ�� �̵�
		System.out.println(8 >>> 2);//0010 �������� 2ĭ�� �̵�,����� ���
		System.out.println(-8 >>> 2);// �������� 2ĭ�� �̵�,����� ���
		
		//8.���׿����� ����(��������,�񱳿�����)������ 
		//   ����б�ó�� ����
		// ���ǽ�  ?  ���϶� ���� ����� :  �����϶� ���� �����
		System.out.println(true ?  1 : 0);
		System.out.println(true && true ?  1 : 0);
		int result = true && true ?  1 : 0;
		System.out.println(result);
		System.out.println(true && true ?  "��" : "����");
		String s = true && true ?  "��" : "����";
		System.out.println(s);
		
		
		System.out.println(false ?  1 : 0);
		System.out.println(false || false ?  1 : 0);
		System.out.println(false || false ?  "��" : "����");
		
		int q = 15;
		int w = 15;
		int e = q==w ? 100 : 50;
		System.out.println(e);
		
		int total = 99+88+76;
		double avg = (double)total/3;
		System.out.println("avg:"+avg);
		char c = avg>=90 ? 'A' : avg>=80 ? 'B' : avg>=70 ? 'C' : 'D';
		System.out.println("grade:"+c);
		//�ڵ��߰�>>80�̻��϶��� 'B', 70�̻��϶��� 'C', ��Ÿ�� D���
		
		
		
	}

}
