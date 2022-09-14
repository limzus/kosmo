package chpter07_ex01;

public class Using_Method07 {

	static void print() {
		System.out.println("입력된 데이터가 없습니다. - 매개변수 없음");
	}
	
	static void print(int a) {
		System.out.println(a+ " : 값이 입력되었습니다.-매개변수: 정수1");
	}
	
	static void print (int c) {
		//매개변수의 타입과 갯수가 같아서 오류발생: signiture가 같다 : method, 매개변수의 타입, 갯수
	}
	
	static void print (double a) {
		System.out.println(a+ "값이 입력되었습니다.-매개변수: 실수1");
	}
	static void print (double a, double b) {
		System.out.println(a+" , "+b+ " : 값이 입력되었습니다.-매개변수:실수1 실부2");
	} 
	static void print (int a, int b) {
		System.out.println(a+ " , " + b + " : 값이 입력되었습니다.-매개변수:정수1 정수2");
	} 
	
	
	static void print (int a, double b) {
		System.out.println(a+ " , " + b + " : 값이 입력되었습니다.-매개변수:정수1 실수2");
	
	syatic int print (int c, double d) {
	System.out.println();
		
		
	}
	
	
	public static void main(String[] args) {
		// Method overloading:
		//		:동일한 Method 이용에 대해서 signiture가 다른경우 다른 Method로 인식한다.
		//			  signiture :메소드명, 입력매개변수 타입, 입력매개변수 갯수
		//				*리턴타입은 signiture가 아니다.
		// Method overriding : 상속
		// :부모 class에서 정의된 Method를 자식 class에서 재정의해서 사용하는 것.
		
		//매개변수가 없는 method 호출.
		print();
		System.out.println("===========");
		//매개변수 : print (정수);
		print (10);
		System.out.println("===========");
		print (20.0);
		System.out.println("=============");
		//매개변수 : print (정수,정수);
		print (30,40);
		System.out.println("========");
		//매개변수: print (실수,실수)
		print (10.1, 20.1);
		System.out.println("==========");
	}

}
