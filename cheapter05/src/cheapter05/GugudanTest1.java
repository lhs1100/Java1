/**
 * 입력받은 단의 구구단 출력하기
 */
package cheapter05;

import java.util.Scanner;

public class GugudanTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		System.out.print("dan :");
		int dan=stdin.nextInt();
		int i=1;
		for(i=1; i<=9; i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		
	}

}
