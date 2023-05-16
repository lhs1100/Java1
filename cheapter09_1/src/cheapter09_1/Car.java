package cheapter09_1;

public class Car {
	
	int speed;
	
	void run() {
		System.out.println(speed+"of speed run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//speed=60; //정적 메소드 안에서 인스턴스 필드는 객체 생성 후 사용
		
		Car myCar=new Car();
		myCar.speed=60;
		myCar.run();
	}

}
