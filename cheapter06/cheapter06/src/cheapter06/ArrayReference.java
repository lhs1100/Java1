package cheapter06;

public class ArrayReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray=new String[3];//배열생성
		strArray[0]="java";
		strArray[1]="java";
		strArray[2]=new String("java");
		
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[0]==strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}

}
