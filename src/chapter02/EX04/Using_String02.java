package chapter02.EX04;

public class Using_String02 {

	public static void main(String[] args) {
		
		
		//String변수에 값을 할당하는 방법:
		//1. 객체생성방법으로, 값을 넣는 개념. (생성자)의 값을 넣습니다. //별도의 주소공간에 값을 할당 (동일한 문자열)
		//2. 리터럴방식으로 값을 할당. //주소공간을 공유 (동일한 문자열일 경우.)
		// == : stack공간의 값을 비교 (참조자료형 : Stack(주소), Heap (값)
		// 기본자료형:은 스택공간에 값을 넣지만. 참조자료형:인 경우 주소를 뜻한다.
		// equals() :참조자려형일때 Heap영역에 값을 비교.													 
		
		
		
		
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		System.out.println(str1); 
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("===================");
		

		
		//== : 참조자료형일 경우 Stack에 Heap영역의 주소를 비교.
		System.out.println(str1==str4); //false
		System.out.println(str2==str3); //true
		
		// equals() : 참조자료형의 값을 비교
		System.out.println(str1.equals(str2));// ture
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		
	}
}
