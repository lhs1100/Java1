/**
 * 2023-04-04
 * 이현서
 * 두 숫자를 입력 받아서 두 수 사이의 합계 출력 하기
 * # 문제 분석
 *  - 변수 : first, second, total
 *  #알고리즘
 *  1.정수 입력(first, second)
 *  2.선택문(if (first<second))
 *  3.반복문 (for (first; second; first++)
 *  		total=total+first 
 */
package cheapter05;

import java.util.Scanner;

public class TextEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin=new Scanner(System.in);
		System.out.print("two number:");
		int first = stdin.nextInt(); 
		int second = stdin.nextInt(); 
		
		int total = 0;
		int temp;
		
			if(first>second)
			{
				temp=first;
				first=second;
				second=temp;
			}
			
			while(first<=second)
			{
				total=total+first;
				first=first+1;
			}
		System.out.println("answer :"+ total);
	}

}
