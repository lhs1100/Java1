package cheapter05;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		System.out.print("number :");
		int num=stdin.nextInt();
		
		int i=1;
		while(i<=num)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
