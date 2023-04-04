/**
 * 입력된 숫자가 양수, 0 , 음수인지 판별하는 프로그램 작성
 */
package cheapter04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		System.out.print("number :");
		int grade=stdin.nextInt();
		
		if((grade + 0) > 0)
			System.out.println("positive");
		
		else if((grade + 0) == 0)
			System.out.println("zero");
		
		else
			System.out.println("negative");
	}

}
