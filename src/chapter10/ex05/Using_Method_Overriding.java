package chapter10.ex05;





//	- 생성자, 메소드
// 메소드 오버라이딩 (Method Overriding) : 상속관계일때만 사용가능
//	- 부모의 메소드를 자식클래스에서 새롭게 정의



class A {
	void print() {
		System.out.println("A클래스 출력");
	
	
	
	}
}

class B extends A { //메소드 오버라이딩 :
@Override	//메소드 오버라이딩을 오류를 방지하는 설정
void print() {	//메소드 오버라이딩 :
	System.out.println("B클래스 출력");
	
	
	
	}


}



public class Using_Method_Overriding {

	public static void main(String[] args) {
		//	1. A 객체 생성을 A타입으로 지정
		A aa1 = new A();
		aa1.print();	// A 클래스 출력
		
		//2. A 객체를 B타입으로 지정
		B bb1 = new B();
		bb1.print();	// B클래스 출력
		
		//3. B객체를 A 타입으로 지정해서 출력
		A aa2 = new B();
		aa2.print();	//B클래스 출력	(오버라이딩된 메소드가 출력됨)
	}

}
