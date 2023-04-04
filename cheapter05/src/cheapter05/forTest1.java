/**
 * 입력받은 숫자의 약수를 모두 출력하기
 * #문제분석
 * -변수 num, i
 * 알고리즘
 * 1.숫자 입력받기
 * 2.복합논리(반복문 안에 선택문 포함)
 * for (i=1; i<=num; i++)
 * {
 * 		if(num%i==0)
 * 			{
 * 				i 출력	
 * 			}
 * }
 */
package cheapter05;

import java.util.Scanner;

public class forTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin=new Scanner(System.in);
		System.out.print("num :");
		int num=stdin.nextInt();
		int i , end;
		for (i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.println("measure :" + i);
			}
		}
	}

}
