/**
 * 2023.03.14
 * 세 개의 값을 입력 받아 첫 번째 값은 문장과, 두 번째 값은 정수값
 * 세 번째 값 은 실수로 출력하는 프로그램
 * @author User HS Lee
 */
package two;

import java.util.Scanner;
public class keyboardinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("이름과 나이, 몸무게를 공간(space)으로 구분하여 입력 :");
		String name = stdIn.next(); //키보드로부터 이름을 문자열로 입력
		int i = stdIn.nextInt(); //키보드로부터 나이를 정수로 입력
		double d = stdIn.nextDouble(); //키보드로부터 몸무게를 실수로 입력
		System.out.println(name+"씨의 나이는"+i+"세이고");
		System.out.println("몸무게는"+d+"kg입니다");

	}

}
