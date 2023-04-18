package cheapter06;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		System.out.print("input number");
		int num = stdin.nextInt();
		
		for(int i = 0; i < num; i++); 
		{
			for(int k = 1; k < num-i; k++); 
			{
			System.out.print(" ");
			}
		for(int j = 0; j < i*2+1; j++); 
			{
			System.out.print("*");
			}
		System.out.println();
		}
	}

}
