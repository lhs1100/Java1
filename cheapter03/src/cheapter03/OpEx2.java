/**
 * 윤년 계산 프로그램
 * 조건1: 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년이다.
 * 조건2:400으로 나누어 떨어지는 해도 윤년에 포함된다. 
 * 
 */
package cheapter03;

import java.util.Scanner;

public class OpEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			
			System.out.print("년도 입력 :");
			int years = sc.nextInt();
			
			if(years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
				System.out.println(years + "윤년이다 ");
			}	else {
					System.out.println("윤년이 아니다");
					
				}
					

			}
		}
		
	


