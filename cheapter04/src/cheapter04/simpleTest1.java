/**
 * 2023.03.28
 * 조건문 연습
 */
package cheapter04;
import java.util.Scanner;

public class simpleTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		System.out.print("input score :");
		int grade=stdin.nextInt();
		
		if(grade>=90)
		{
			System.out.print("합격");
		
		System.out.print("Congraturation");
		System.out.print("Thank you");
		}
		else
		{
			
			System.out.print("bad");
			System.out.print("Sorry");
		}
		
			
		
	}

}
