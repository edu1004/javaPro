package test.com;

public class Test02Operator {

	public static void main(String[] args) {

		System.out.println("Operator");
		//연산자 (int):캐스팅연산자,(연산식)우선연산자
		// ,(연결연산자) , .(포함연산자), ...(배열표현연산자)
		int x1 = 0,y1,z1;
		
		System.out.println(x1);
		//1.산술연산자	+,-,*,/,%
		System.out.println((1+2)*3/4);
		
		//2.대입연산자 = , +=, -=, *=, /=, %=, &=, |=, ^=
		x1+=2;
		x1+=2;
		x1+=2;
		x1+=3;
		x1+=3;
		x1+=10;
		
		//3.비트연산자 &, |, ^
		//4,논리연산자 &&, ||, &,|   >>> 대상이 참,거짓
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
		
		//5.비교연산자 ==,!=,>,<,>=,<=
		//결과값은 반드시 true,false >> boolean type
		System.out.println(5==5);
		System.out.println((5 == 5) && (5 > 5));
		
		System.out.println((55-50 == 5) && (5 > 5));
		int x = 0;
		x = 55-50;
		System.out.println((x == 5) && (5 > 5));
		
		//6.증감(증가과 감소연산)연산 : ++,--
		int y = 5;
		y++;//y값을 1증가시켜라.단일항 연산
		++y;
		System.out.println(y);
		
		//주의사항:연산자 우선순위에 조심할것.
		int a = 10;
		//int b = ++a;
		int b = a++;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		//7.쉬프트 연산: >> ,<<, >>>
		System.out.println(8 >> 2);//0010 우측으로 2칸씩 이동
		System.out.println(-8 >> 2);//0010 우측으로 2칸씩 이동
		System.out.println(2 << 2);//1000 좌측으로 2칸씩 이동
		System.out.println(8 >>> 2);//0010 우측으로 2칸씩 이동,결과가 양수
		System.out.println(-8 >>> 2);// 우측으로 2칸씩 이동,결과가 양수
		
		//8.삼항연산자 조건(논리연산결과,비교연산결과)에따른 
		//   실행분기처리 가능
		// 조건식  ?  참일때 실행 결과값 :  거짓일때 실행 결과값
		System.out.println(true ?  1 : 0);
		System.out.println(true && true ?  1 : 0);
		int result = true && true ?  1 : 0;
		System.out.println(result);
		System.out.println(true && true ?  "참" : "거짓");
		String s = true && true ?  "참" : "거짓";
		System.out.println(s);
		
		
		System.out.println(false ?  1 : 0);
		System.out.println(false || false ?  1 : 0);
		System.out.println(false || false ?  "참" : "거짓");
		
		int q = 15;
		int w = 15;
		int e = q==w ? 100 : 50;
		System.out.println(e);
		
		int total = 99+88+76;
		double avg = (double)total/3;
		System.out.println("avg:"+avg);
		char c = avg>=90 ? 'A' : avg>=80 ? 'B' : avg>=70 ? 'C' : 'D';
		System.out.println("grade:"+c);
		//코드추가>>80이상일때는 'B', 70이상일때는 'C', 기타는 D출력
		
		
		
	}

}
