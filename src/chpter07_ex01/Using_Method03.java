package chpter07_ex01;

public class Using_Method03 {
	
	//인스턴스 필드: 객체화를 해야만 사용가능.
	int c;	//인스턴스 필드 : static키가 붙지않는 필드 (객체화를 해야 사용가능)
	int d;
	
	//static 필드 : 객체화하지않고 바로 사용가능.
	static int e;
	static int f;
	
	void abc () {	//main 메소드에서 선언하면 안됨.
	}	
		//main 메소드에서 선언하면 안됨
		
	
	//static 메소드 : 객체화없이 호출가능.
	static void def)_ {
		System.out.println("def() 메소드 호출");
		
	}
	//static method 내부에 인슽턴스 필드나, 메소드를 바로 사용할 수 없다. (객체화 시켜야 사용가능)
	
	
	public static void main(String[] args) {
		//main 메소드도 method이다
		int a;	//지역변수이다. <== Stack에 저장; Stack영역은 강제초기화가 안됨.
						//Stack에 값이 저장, main() method내에서만 사용됨.
		a=10;
		
		System.out.println(a);
		//main도 하나의 메소드 메소드내의 메소드는 선언 불가.
			//void abc () { // 이렇게 메소드내에 메소드를 하나 더 선언하면 오류뜸
		/*
		 
		  		System.out.println("안녕하세요");
		  	 }	
		 */
		
		/*
		//필드명, method명 앞에 static키가 적용되어있으면 객체
		//	static method 내에서는 인스턴스 필드나, 인스턴스 메소드를 사용할 수 없다.
		// 	static method 내에서는 static 필드나, static method를 사용할 수 있다
		 */
	
		//c=5;	//오류발생 (static method 내부에서 인스턴스 필드 직접 호츌 (X))
		e=10;	//같은 클래스 내에서 직접 호출, static 필드호출
		
		//abc(); //인스턴스 method (오류발생)
		//def(); //static method (직접 호출)
	}
}
