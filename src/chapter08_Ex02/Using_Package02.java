package chapter08_Ex02;

//import를 사용해서 외부패키지 접근
	//동일한 클래스는 import로 사용 불가능
import chapter08_Ex01.A;
import chapter08_Ex01.com; //임포트불가

public class Using_Package02 {

	public static void main(String[] args) {
		//A클래스는 동일한 패키지내에서 존재하지않는다. (import를 해서 사용)
		//	-- A class는 접근제어자가 public, protected (상속) 지정되어 있어야한다.
		
		System.out.println("===A클래스 (public)==");
		A a = new A();
		
		System.out.println(a.m);	//다른패키지에서 접근
		System.out.println(a.n);
		
		a.print();
		
		System.out.println("== B클래스(default)");
		//B클래스는 다른패키지에 존재하고, 접근제어자가 default로 할당되어있다.
		//외부 패키지에서는 접근이 불가능.
		//B b= new B();
		
		System.out.println("==com.A클래스 객체 생성==");
		//동일한 클래스는 import가 불가능하므로 전체 이름을 사용해서 객체를 생성해야한다.
		
		chapter08_Ex01.comA aa = new chapter08_ex01.com.A();
		System.out.println(ab.aa);
		System.out.println(ab.bb);
	}
	
	
	
}
