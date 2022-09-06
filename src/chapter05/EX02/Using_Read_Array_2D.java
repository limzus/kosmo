package chapter05.EX02;

public class Using_Read_Array_2D {

	public static void main(String[] args) {

		//2차원 배열의 값을 읽기
		
			//1차원 배열일때 : arr.length <===== 열의 갯수
			//2차원 배열일때 : arr.length <===== 행의 갯수
				//		   arr[i].length <===== 열의 갯수, i : 행의 번호.
		//1. 2차원 배열의 길이
		int[][] arr1 = new int[2][3];
		System.out.println(arr1.length); //2 행의 갯수
					System.out.println(arr1[0].length); //0행의 <==열의 갯수
					System.out.println(arr1[1].length); //1행의 <==열의 갯수
		int[] arr0 = new int[100];		 //1차원 배열; 열(방) 100개 생성
				System.out.println(arr0.length); //100 <== 열의 갯수
				
	//2. 2차원 배열의 길이 (비정방형 배열)
		int[][] arr2= new int[][] {{1,2},{3,4,5}};
		System.out.println(arr2.length); //2 <==행의 갯수
		System.out.println(arr2[0].length); //2 <==0행의 열의 갯수
		System.out.println(arr2[1].length); //3 <==1행의 열의 갯수
		System.out.println("===============================");
		
		//2차원 배열 출력 방법
		//1. 방법 1 - 방번호를 직접 출력
		System.out.println(arr2[0][0] + " " + arr2[0][1]);
		System.out.println();
		System.out.println(arr2[1][0] + " " +arr2[1][1]+" "+ arr2[1][2]);
		//2. 방법 2 - for문장을 통해서 출력
		
		// Enhanced for 문을 사용해서
		
		//2. for문을 사용해서 출력: 2차원 배열 이중 for (for문 내의 for문)
		//바깥쪽 for문장: arr.length : 행의갯수
		//안쪽 for문장: arr[i].length : 행의 열의 갯수
		for (int i=0 ; i<arr2.length; i++) { //행의 갯수를 1씩 증가해라
			for (int j=0 ; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j] + ""); //i :행의 방번호, j : 열의 방번호
				
			
				
				
			}
			System.out.println(); //한 행이 끝나면 enter 적용
		}
		
		//3.enhanced for문을 사용해서 출력.
		
		System.out.println("==enhanced For문장으로 출력==");
		for ( int[] a : arr2) { //arr2 이차원배열을 1차원 배열로 꺼낸다.
			for (int b: a) {	//a 일차원 배열의 각방의 값을 b 변수로 꺼낸다.
				System.out.println(b+ " ");
			}
			System.out.println();
		}

	}

}
