package cheapter11;

class Item {
	public int price;
}
class Noodle extends Item {
	public Noodle() {
		price = 2500;
	}
	public String toString() { return "Noodle";}
}

class Mixnoodle extends Item {
	public Mixnoodle() {
		price = 3000;
	}
	public String toString() { return "Mixnoodle";}
}

class Wodong extends Item {
	public Wodong() {
		price = 2500;
	}
	public String toString() { return "Wodong";}
}

class Buyer {
	private int money;
	public Buyer(int money) {
		this.money = money;
	}
	public void buy(Item it, int count) {
		System.out.println(it + "are" + count + "delicious ate");
		money = money - it.price*count;
		System.out.println("have money :" + money);
	}
}
public class PolymorphismTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer me = new Buyer(20000);
		me.buy((new Wodong()), 3);
		me.buy((new Noodle()), 2);
		me.buy((new Mixnoodle()), 1);
	}

}
