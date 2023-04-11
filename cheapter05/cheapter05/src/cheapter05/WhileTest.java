/**
 * 반복문 1~10 합계 구하기 (while)
 */
package cheapter05;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0, cnt=1;
		
		while(cnt<=10)
		{
			sum=sum+cnt;
			cnt=cnt+1;
		}
		System.out.println("1~10 total(while) :"+sum);
		
		
		int total=0 , i=1;
		for(i=1; i<=10; i++)
		{
			total=total+i;
		}
		System.out.println("1~10 total(for) :"+total);
		
		
		int end=0, j=1;
		
		do
		{
			end=end+j;
			j=j+1;
		}
		while(j<=10);
		System.out.println("1~10 total(do~while) :"+end);
		
			
	}
	
}
