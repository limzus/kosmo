package chapter09.Ex05;


	//메서드 이름앞에 static가 없는 메서드 : 인스턴스 메서드
	//메서드 이름앞에 static이 있는 메서드 : 정적 메서드 :객체 생성후 호출, 갱ㄱ체 생성 없이도 호출.
		
	
class A {
	
	void abc() {
		System.out.println("인스턴스 메서드");
	}
	static void bcd() {
		System.out.println("정적 메서드");
	}
	
	
}



public class Using_StaticMethod01 {
	//객체 생성 없이 바로 호출 : 정적 메소드
	public static void main(String[] args) {
		A.bcd();
		
		//객체생성후 호출
		System.out.println("=============");
		A a = new A();
		
		a.abc();	//인스턴스 메소드
		a.bcd();	//정적 메소드
		

	}

}
