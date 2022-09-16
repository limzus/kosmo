package chapter10.ex08;


// 부모 클래스의 생성자를 호출 ,super(),super(30) 
// 	--생성자 내부에서만 사용
//	--생성자의 첫 라인에 위치해야한다.

// 	자식 클래스는 생성자 앞에 this()나 super()메소드가 반드시 와야한다.
// 	-- 그러나 생략되어있으면 super()메소드 , 부모 클래스의 기본 생성자가 생략되어있다.
class Aa{
	//기본생성자 (앞에 매개변수가 없는 생성자
	Aa() {
		System.out.println("Aa 기본 생성자 - Aa()");
	}
}
class Bb extends Aa{
	Bb() {
		super();		//생략시 컴파일러가 자동으로 등록.
		System.out.println("Bb의 기본생성자 - Bb()");
	}
}

class Cc extends Bb{
		//객체 내부에 생성자가 존재할 경우- 컴파일러는 생성자를 자동으로 추가하지않습니다.
		// Cc () {}
	Cc () {}
	
	Cc (int a) {
		System.out.println("Cc의 매개변수1개인 생성자- Cc(int a)를 받는 생성자");
	}
}
class Dd extends Cc{

	/* Dd클래스에 생성자가 존재하지않을때 컴파일러는 기본 생성자를 넣습니다.
	 D() {
	 	super();기본적으로 생략되어 있다.. 
	  
	  
	  
	  
	  
	 */
	Dd() {
		super(3);
		System.out.println("==Bb==");
	}
	
	Dd(int a) {
		this();		//자신의 객체의 생성자 호출
	}
	Dd(int a,int b) {
		
		System.out.println("Dd의 매개변수 1개인 생성자 호출");
	}
	
}

public class Using_Super02 {

	public static void main(String[] args) {
		//1. 자식 객체 생성
		//Bb 객체 생성
		Bb bb = new Bb();
		
		System.out.println("===============");
		
		//2. 자식 객체 생성
		Dd dd = new Dd();
		
		System.out.println("=================");
		Dd d2 = new Dd(40);
		
	
	}
}
