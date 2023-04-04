/**
 * 동전교환 프로그램
 * 입력된 액수만큼 500원 ,100원 ,50원 ,10원짜리 동전으로 교환해 주는 프로그램 작성
 * 조건1:동전의 총개수를 최소화
 * 조건2:고액의 동전 우선 교환
 */
package cheapter03;

import java.util.Scanner;

public class OpEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) { 	
			int money = 0;		
		 
			Scanner sc = new Scanner(System.in);
			System.out.print("액수 입력  : ");
			money=sc.nextInt(); 
			System.out.println("입력 액수 : "+money+" 원 .");

			int coin500 = (int)money / 500;
			System.out.println("500원 동전은 "+coin500+"개 .");
			money = money % 500;
			
			int coin100 = (int)money / 100;
			System.out.println("100원 동전은 "+coin100+"개 .");
			money = money % 100;
			
			int coin50 = (int)money / 50;
			System.out.println("50원 동전은 "+coin50+"개 .");
			money = money % 50;
			
			int coin10 = (int)money / 10;
			System.out.println("10원 동전은 "+coin10+"개 .");	
			money = money % 10;
			
			System.out.println("남은 금액 : "+money); 
			
				
		
		
		
			}
		  
		
	}

}
