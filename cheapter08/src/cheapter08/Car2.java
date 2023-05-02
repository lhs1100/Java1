package cheapter08;

public class Car2 {

	String company="쉐보레";
	String model="그랜저";//null
	String color="검정";//null
	int maxSpeed;//0
	
	public Car2() {
		
	}
	
	public Car2(String model) {
		this(model,"은색",250);
	}
	public Car2(String model, String color) {
		this(model,color,250);
	}
	public Car2(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
