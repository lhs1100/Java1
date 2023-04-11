/**
 * 1차원 정수 배열 생성 후 가장 큰 값 찾기
 */
package cheapter06;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[]= {88,97,53,92,68,82};
		int max=score[0]; //배열의 첫번째 요소를  max로 지정
		
		for(int i:score) {
			if(i>max)
				max=i; //i가 max 보다 크면 max 변경
		}
		System.out.print("max value is :"+ max);
	}

}
