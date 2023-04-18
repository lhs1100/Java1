package cheapter06;
import java.util.Scanner;
public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		System.out.print("input number");
		int num = stdin.nextInt();
		int i=1;
		while (i<=num)
		{
			int j=num;
			while(j>=i)
			{
				if(j>i)
				{
					System.out.print(" ");
					j--;
				}
				else 
				{					
					System.out.println("*");
					i=i+1;
				}
			}
			
			
			
		}
		
	}

}
