/**
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이면 1000을 넘는 수와 평균 출력
 */
package cheapter05;

import java.util.Scanner;

public class breakTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0 , i = 1;
		while (true) {
			
			Scanner stdin=new Scanner(System.in);
			System.out.print("number :");
			int num=stdin.nextInt();
			
			sum= sum + num;
			if (1000<=sum) 
				break;
			i++;
			
		}
		while (sum>=1000)
		{
			System.out.print("answer" + sum +""+sum/i);
		}
		
	}

}
