package cheapter06;

public class ArrayReference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVal1="java";
		String strVal2="java";
		
		if(strVal1==strVal2) {
			System.out.println("strVal1, strVal2 same reference");
		}
		else {
			System.out.println("strVal1, strVal2 diferent reference");
		}
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1, strVal2 same string");
		}
		
		String strVal3=new String("hsLee");
		String strVal4=new String("hsLee");
		
		if(strVal3==strVal4) {
			System.out.println("strVal3, strVal4 same reference");
		}
		else {
			System.out.println("strVal3, strVal4 diferent reference");
		}
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3, strVal4 same string");
		}
	}

}
