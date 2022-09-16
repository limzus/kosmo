package chapter09.Ex05;

class B{
	
	int a = 10; //인스턴스 필드
	static int b = 20;
	
	void abc() {	//인스턴스 메소드 : 객체를 생성후 사용.
						//-- 인스턴스 필드가 올수있고, 정적 필드가 올수있고, 인스턴스메소드, 정적 메소드도 올수있다.
		
		System.out.println(a); //인스턴스 필드
		System.out.println(b); //정적 필드
		cde(); //인스턴스 메소드
		bcd(); //정적 메소드
		
	}
	
	static void bcd() {
		
		//정적 메소드: 객체 생성후 호출, 객체 생성없이도 호출
			// -- 정적 필드, 정적 메소드
		// * 정적 메소드는 객체 생성없이 사용가능하다. 그런데 인스턴스 필드나, 인스턴스 메소드는
		//객체를 생성해야만 사용이 가능하므로 정적 메소드 내부에 포함될수 없다.
		
		System.out.println("정적 메소드 - bcd()");
							// - - 정적 필드, 정적 메소드
//		System.out.println(a);	//인스턴스 필드 올수 없다.
		System.out.println(b);	//정적 필드 (0)
//		cde();				//인스턴스 메소드(x)
	
	}
	void cde() { //인스턴스 메소드
		System.out.println("정적 메소드 - cde()");
	}
	static void def() {
		System.out.println("정적 메소드-def");
	}
	
}
public class Using_StaticMethod02 {

	public static void main(String[] args) {

			//객체 생성없이 바로 호출 : static 필드, static 메소드
				//클래스명.필드명. 클래스명.메소드명()
		
		
		System.out.println("==static : 객체 생성 없이 호출==");
	//오류	System.out.println((B.a));	//인스턴스 필드
		System.out.println(B.b);
	//오류	B.abc();	// 인스턴스 메소드
		B.bcd();	// 정적 메소드
	//오류	B.cde();	// 인스턴스 메소드(x)
		B.def(); 	// 정적 메소드(o)
		System.out.println("==객체 생성후 필드, 메소드 호출 ==");
		//인스턴스 필드, 정적 필드 모두 호출
		System.out.println(B.class);	// 인스턴스 필드
//		System.out.println(b.b);		// 정적 필드
		B b= new B();
		b.abc();
		b.bcd();
		b.cde();
		b.def();
	}

}
