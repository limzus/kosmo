package chapter10.ex09;

//this()	: 자신의 객체의 생성자 호출, 생성자 내부에 첫라인에 위치.
//super()	: 상속관계, 부모class의 생성자 호출, 생성자 내부에서 첫라인에 위치.
//자식클래스는 생성자내부에 첫 라인에 this(), super(), 부모의 기본 생성자가 생략되어 있다.

class A{
	A() {
		this(3);
		System.out.println("a");
	}
	
	A(int a) {
		System.out.println("A의 매개변수 1개 - A(10)");
	}
	
}
class B extends A {
	B(){
		this(3);
		System.out.println("B의 기본 생성자- B()");
	}
	B(int a){
		System.out.println("B의 매개변수 1개인 생성자");
	}
}




public class Using_Super03 {
	
	public static void main(String[] args) {
		//1. A 객체 생성
		A aa1 = new A(); 	// A의 매개변수 1개 - A(10), A 기본 생성자 - A()
		
		System.out.println("========================================");
	
	A aa2 = new A(3);
	
	System.out.println("============================================");
	
	
	
	
	
	}

}
