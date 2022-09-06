package chapter05.EX02;

public class Using_Array_2D {

	public static void main(String[] args) {
		
		//2차원 배열을 출력
		
		int[][] arr1;
		
		
		//1. 직접 출력		
		arr1 [0][0]=1;		
		arr1 [0][1]=2;		
		arr1 [0][2]=3;		
		arr1 [0][3]=4;		
		arr1 [0][4]=5;		
		arr1 [1][0]=6;		
		arr1 [1][1]=7;		
		arr1 [2][0]=8;		
		arr1 [2][1]=9;		
		arr1 [2][2]=10;		
		arr1 [3][0]=11;		
		arr1 [3][1]=12;
		
		System.out.print(arr1[0][0]+ " "+ arr1[0][1] + " " + arr1[0][2] " " + arr1[0][3] + " " + arr1[0][4]);
		System.out.println();
		System.out.print(arr1[1][0] + " " + arr1[1][1]);
		System.out.println();
		System.out.print(arr1[2][0] + " " + arr1[2][1] + " " + arr1[2][2])
		System.out.print();
		
		
		
		//2. for문장을사용해서 출력
		for(int i=0; i<4; i++) {
			for(int j=0; arr1.length>4; j++  ) {
				System.out.print(j+1 +"");
			}
		}
		
		
		

		
		
		
		
		//Enhanced for문을 출력
		
		for (int[] a : arr1) {
			for (int b : a)  {
				sysosut
			}
		}
		
			//15:40분까지
				
				
	}

}
