package cheapter08_1;

public class Sample_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//매개변수 값 직접 더하기
		System.out.println("sum:"+(args[0]+args[1]));
		
		//문자열 정수로 반환
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		System.out.println("sum is"+(num1+num2));
	}

}
