package chapter09.Ex01;

//E클래스는 A클래스를 상속받는다 <== A클래스의 모든 필드와 메소드를 물려받는다.
//A클래스 : 부모 클래스 (super class)
//E 클래스 : 자식 클래스 (child class)
//	(동일한 패키지에서 상속설정)

public class E extends E{

	public void print() {
		System.out.println("== 부모의 필드 출력 ==");
		System.out.println(a);	//public	<== 부모의 a 필드
		System.out.println(b);	//protected <== 부모의 b 필드
		System.out.println(c);	//default	<== 부모의 c 필드
//		System.out.println(d);	//default	<== 부모의 d 필드
		
		
		System.out.println("== 부모의 메소드 호출 ==");
		print1();	//부모의 메소드 호출
		print2();	//부모의 메소드 호출
		print3();	//부모의 메소드 호출
		print4();	
		
	}
}
