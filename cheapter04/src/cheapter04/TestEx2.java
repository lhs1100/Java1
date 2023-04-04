/**
 * 직급과 나이를 입력 받아서 직급이 7 또는 8이고 나이가 40대이면 "연금80%"
 * 직급이 5 또는 6이고 나이가 50대이면 연금 "100%"
 * 그 외의 경우는 "연금 대상자 아님"
 * 을 출력하는 프로그램
 */
package cheapter04;
import java.util.Scanner;
public class TestEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		System.out.print("input position :");
		int grade=stdin.nextInt();
		
		System.out.print("input age :");
		int age=stdin.nextInt();
		
		if((grade==8 && grade==7) && (age >= 40 && age <= 49) )
			System.out.println("연금 80%");
		else if ((grade==5 && grade==6) && (age >= 50 && age <= 59))
			System.out.println("연금 100%");
		else 
			System.out.println("연금 대상자 아님");
	}

}
