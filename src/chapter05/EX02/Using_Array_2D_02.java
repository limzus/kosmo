package chapter05.EX02;

public class Using_Array_2D_02 {

	public static void main(String[] args) {

		
		String[][] arr1 = new String[][] {{"사람:", "   "+ "홍길동", "이순신", "세종대왕"},
			{"새이름","독수리","부엉이","닭","오리"},
			{"물고기" +"   ","붕어", "가물치", "잉어"},
			{"포유류"+"   "+"   "+"호랑이","사자"}};
			/*
			 출력 : 사람이름 : 홍길동 이순신 세종대왕
			 	새이름 : 독수리 부엉이 닭 오리
			 	물고기 이름: 붕어 가물치 잉어
			 	포유류 이름: 호랑이 사자
			 	
			  
			  
			  
			 */
			//1. for문장으로 출력
		
			for(int i=0; arr1.length>j; i++) {
			for (int j=0; arr1 i[j].length<arr2; arr2++) {
				
				
				System.out.print( arr1[arr2]);
				System.out.println();
			}
		}
		
		
			//2. Enhanced for
			for(int a= arr1 ) {
				for(String b: a) {
					if (b.equals("홍길동")) {System.out.println("홍길동", "사람이름 : ");}
					if (b.equals("독수리")) {System.out.println("새이름");"새이름 : ";}
				}
			}
			
			//3. Arrays.tostring()
			System.out.println();
		
		
		
	}

}
