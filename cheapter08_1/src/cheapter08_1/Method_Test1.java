package cheapter08_1;

class Calculator {
	//라인값이 없는 메소드 void
	void powerOn() {
		System.out.println("power on");
	}
	//리턴 값이 int 형인 메소드
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	//리턴 값이 double 형인 메소드
	double divide(int x, int y) {
		double result=(double)x/(double)y;
		return result;
	}
	void powerOff() {
		System.out.println("power off");
	}
	//매개변수의 개수를 모를 경우1(배열 타입 선언)
	int sum1(int[] values) {
		int sum=0;
		for (int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	//매개변수의 개수를 모를 경우2
	int sum2(int... values) {
		int sum=0;
		for (int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
}
public class Method_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator myCalc=new Calculator();
		myCalc.powerOn();
		
		int result1=myCalc.plus(5,6);
		System.out.println("result1:"+result1);
		
		byte x=10;
		byte y=4;
		double result2=myCalc.divide(x,y);
		System.out.println("result2:"+result2);
		
		int []values1= {1,2,3};
		int result3=myCalc.sum1(values1);
		System.out.println("result3"+result3);
		
		int result4=myCalc.sum2(new int[] {1,2,3,4,5});
		System.out.println("result4"+result4);
		
		int result5=myCalc.sum2(1,2,3);
		System.out.println("result5"+result5);
		
		myCalc.powerOff();
	}

}
