package cheapter06;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] int1= {9,1,7,3,5,4,6,2,8,0};
		System.out.println("초기배열 :"+Arrays.toString(int1));
		
		Arrays.fill(int1, 3, 5, 33);
		System.out.println("fill() 수행 후 :"+Arrays.toString(int1));
		
		Arrays.sort(int1);
		System.out.println("sort() 수행 후:"+Arrays.toString(int1));
		
		System.out.println("33은 배열의"+Arrays.binarySearch(int1,33));
	}

}
