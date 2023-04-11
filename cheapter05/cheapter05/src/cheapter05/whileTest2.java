/**
 * 입력받은 숫자의 팩토리얼 구하기
 * #문제분석
 * - 변수: fac, facvalue
 * #알고리즘
 * 1.팩토리얼 값 입력 fac
 * 2.반복문 while(fac>1)
 * 				{
 * 					facvalue=fac을 1씩 감소시키면서 곱하기
 *    			}
 *3.결과출력
 * 
 */
package cheapter05;

import java.util.Scanner;

public class whileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		System.out.print("fac :");
		int fac=stdin.nextInt();
		int facvalue=fac;
		
		while(fac>1)
		{
			System.out.print(fac + "*");
			facvalue =facvalue * --fac;
		}
		System.out.println("1="+ facvalue);
	}

}
