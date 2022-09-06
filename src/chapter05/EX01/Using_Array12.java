package chapter05.EX01;

public class Using_Array12 {

	public static void main(String[] args) {

			// 1~1000까지 배열(arr)에 저장후

			//1. 배열 선언 
				int[] arr = new int[1000];
				

				
			//2. [입력]for 문장을 사용해서 arr 배열 변수에 값을 할당.
				for(int i=0; i<arr.length; i++) {
					
				
					arr[i]=i+1;
				System.out.println(arr);
			//3. [출력]for 문장을 사용해서 arr 배열 변수의 값을 출력.
				System.out.println(arr[i]);
				
				}
		
			//4. [출력] [enhanced for문장을 사용해서 값을 출력
				for(k : arr) {System.out.println(k+"");
				
				}
				
			//5. [출력] Arrays.tostring(arr) 출력
				
	
	
	
	
	
	
	}

}
