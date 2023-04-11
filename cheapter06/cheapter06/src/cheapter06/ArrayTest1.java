package cheapter06;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin=new Scanner(System.in);
		int i;
		double sum=0.0,avg;
		double dnum[]= new double[5];//배열 선언
		System.out.println("dnum array length :"+dnum.length);//배열 길이
		System.out.println("초기화 하지 않은 dnum[]의 값 :");
		
		for(i=0; i<dnum.length; i++)
			System.out.print(dnum[i]+" ");//dnum[]의 묵시적 값 출력
		
		System.out.println();
		
		for(i=0; i<dnum.length; i++)
			System.out.print("dnum["+i+"]번째 데이터 입력 :");
			dnum[i]=stdin.nextDouble();//dnum[]의 값 실수로 입력
			
		for(i=0; i<dnum.length; i++)
			sum=sum+dnum[i];//dnum[]요소값을 더하기
		
		System.out.println("배열의 합은 "+sum+"입니다");
		avg=sum/dnum.length;
		System.out.println("배열 값의 평균은 "+avg+"입니다");
	}

}
