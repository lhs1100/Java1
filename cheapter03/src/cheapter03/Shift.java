/**
 * Shift 연산
 */
package cheapter03;
import java.util.Scanner;
public class Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin=new Scanner(System.in);
		System.out.print("두 개의 숫자를 입력 :");
		int a = stdin.nextInt(); //첫번째 정수 저장
		int b = stdin.nextInt(); //두번째 정수 저장
		
		System.out.println(" a = "+a+"("+Integer.toBinaryString(a)+")");
		
		System.out.println(" b = "+b+"("+Integer.toBinaryString(b)+")");
		
		System.out.println(" a<<2=" +(a<<2)+"("+Integer.toBinaryString(a<<2)+")");
		System.out.println(" a>>2=" +(a>>2)+"("+Integer.toBinaryString(a>>2)+")");
		System.out.println(" b<<2=" +(b<<2)+"("+Integer.toBinaryString(b<<2)+")");
		System.out.println(" b>>2=" +(b>>2)+"("+Integer.toBinaryString(b>>2)+")");
		System.out.println(" b>>>2=" +(b>>>2)+"("+Integer.toBinaryString(b>>>2)+")");
	}

}
