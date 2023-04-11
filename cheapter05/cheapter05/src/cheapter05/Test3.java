/**
 * 1~1000까지의 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램 작성
 * for로 작성
 * 두 개의 숫자를 입력 받아서 두 숫자 사이의 홀수값을 모두 더하여 출력하는 프로그램 작성
 */
package cheapter05;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin=new Scanner(System.in);
		System.out.print("number :");
		int num=stdin.nextInt();
        
		int sum=0;
		int cnt=0;
        
		for (int i=1; i<=1000; i++) 
		{
			if (i%num == 0) 
			{
				
				cnt++;
				sum+=i;
			}
		}
		System.out.println(sum);
	}

	}

