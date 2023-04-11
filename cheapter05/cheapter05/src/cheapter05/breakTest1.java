/**
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이면 1000을 넘는 수와 평균 출력
 */
package cheapter05;

import java.util.Scanner;

public class breakTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0 , i = 1,  cnt = 0;
		while (true) {
			
			Scanner stdin=new Scanner(System.in);
			System.out.print("input number :");
			int num=stdin.nextInt();
			
			cnt++;//입력 횟수 증가
			sum= sum + num;//입력받은 값의 합계
			if (1000<=sum) //합계가 1000 이상인지
				break;//반복 종료
			
		}
		System.out.print("sum is"+sum);
		System.out.print("avg is"+sum/cnt);
		
	}

}
