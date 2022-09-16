package chapter10.ex08;

//super keyword : 상속관게에서 부모 클래스(Super Class)의 필드, 메소드를 호출.
//super Method : 상속 관계에서 부모 클래스의 생성자를 호출
//				-- 생성자 내부에서 사용, 반드시 첫 번째 라인에 와야한다.

//this keyword : 자기 자신 객체의 필드나, 메소드를 호출할때;
//this Method : 자기 자신 객체의 생성자를 호출
//				-- 생성자 내부에서 사용, 반드시 첫 라인에 와야한다.

class A {
	void abc() {
		System.out.println(" A 클래스의 abc()");
	}
}

class B extends A {
	@Override
	void abc() {	//오버라이딩된 메소드
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		abc();	//this.abc()
		super.abc();
	}
	void bcd() {
		abc();	//this.abc()
	}
	
}

public class Using_Super01 {

	public static void main(String[] args) {
		
		
		
		
	}

}
