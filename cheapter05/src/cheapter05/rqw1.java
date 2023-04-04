package cheapter05;

import java.util.Scanner;

public class rqw1 {

	
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


