package cheapter08_1;

public class Rectangle_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle myCalcu=new Rectangle();
		
		double result1=myCalcu.areaRectangle(10);//정사각형 넓이
		
		double result2=myCalcu.areaRectangle(10,20);//직사각형 넓이
		
		System.out.println("area of the regular square="+result1);
		System.out.println("area of the angled square="+result2);
	}

}
