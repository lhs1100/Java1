/**
 * 2023.03.28
 */
package cheapter04;

import java.util.Scanner;

public class simpleTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		System.out.print("input score :");
		int grade=stdin.nextInt();
		
		switch (grade / 10)
		{
		
		case 9:
			System.out.println("A");
			break;
		
		case 8:
			System.out.println("B");
			break;
		
		case 7:
			System.out.println("C");
			break;
			
		case 6:
			System.out.println("D");
			break;
			
		default :
			System.out.println("F");
			break;
			
			
		}
	}

}
