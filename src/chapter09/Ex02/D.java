package chapter09.Ex02;

import chapter09.Ex01.A;

//class D는 class A를 상속받는다.
	//D클래스는 A클래스의 A클래스의 필드와 메소드를 상속받는다.


public class D extends A{

	public void print() {
		System.out.println("==부모 클래스의 필드 출력(다른패키지)==");
		System.out.println(a);	//public	//다른 패키지에서 접근됨
		System.out.println(b);	//protected	//다른 패키지에서 접근됨
	//	System.out.println(c);	//default	<오류발생>
	//	System.out.println(d);	//private	<오류발생>
		System.out.println("==부모 클래스의 메소드 출력(다른패키지");
		print1();	//public
		print2();	//protected
		print3();	//default
		print4();	//private
	
	
	
	
	}
}
