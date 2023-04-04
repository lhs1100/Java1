package cheapter04;

import java.util.Scanner;

public class simpleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		System.out.print("input score :");
		int grade=stdin.nextInt();
		
		if(grade>=90)
			System.out.println("A");
		else if (grade>=80)
			System.out.println("B");
		else if (grade>=70)
			System.out.println("C");
		else if (grade>=60)
			System.out.println("D");
		else 
			System.out.println("F");
	}

}
