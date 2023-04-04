/**
 * 산술연산
 */
package cheapter03;

public class ArithmeticEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=2;
		int sum=a+b;
		int mod=a%b;
		int c = ++a;
		int d = b++;
		
		System.out.println("a+b=" + sum);
		System.out.println("a%b=" + mod);
		System.out.println("a의 전위 증가 연산=" + c);
		System.out.println("a 변수의 값 :" + a);
		System.out.println("b의 후위 증가 연산 =" + d);
		System.out.println("b 변수의 값 :" + b);
	}

}
