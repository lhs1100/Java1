/*
 * 추상클래스
 * 1.공통부분을 추출 후 추상 클래스 작성
 * 2.무엇인지만 정의, 어떻게는 하위 클래스에서 정의
 * 3.추상메소드-추상 클래스 내에 정의/선언만 있고 구현은 없음.
 * 4.추상클래스는 객체 생성 안됨./구현부분이 없는 메소드이기 때문
 */
package cheapter11;

abstract class Shape1 {
	abstract void draw();
	abstract void computeArea(double a, double b);
}

class Rectangle1 extends Shape1 {
	void draw() {
		System.out.println("draw the Rectangle");
	}
	void computeArea(double h, double v) {
		System.out.println("Rectangle area : " + (h*v));
	}
}

class Triangle1 extends Shape1 {
	void draw() {
		System.out.println("draw the Triangle");
	}
	void computeArea(double a, double h) {
		System.out.println("Triangle area :" + (a*h/2));
	}
}
public class AbstractTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("==추상 메소드를 이용한 다양성==");
		Shape1 s = new Rectangle1();
		s.draw();
		s.computeArea(5.0, 10.0);
		s=new Triangle1();
		s.draw();
		s.computeArea(5.0, 10.0);
	}

}
