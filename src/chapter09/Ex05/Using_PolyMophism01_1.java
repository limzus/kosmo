package chapter09.Ex05;

import chapter09.Ex03.B;

class Aa{
	int a=10;



}

class Bb extends Aa{
		int b=20;
	
}

class Cc extends Bb{
		int c=30;
}

class Dd extends Bb{
		int d=40;
}



	
public class Using_PolyMophism01_1 {

	public static void main(String[] args) {
		//다형적 표현
		Aa a= new Aa();		//타입 : A, 객체 : Aa()
		System.out.println(a1.a);
		
		Bb = new Bb();		//타입 : Bb, 객체 : Bb()
		System.out.println(b1.a);//상속
		System.out.println(b1.b);//자신
	
		//자식 객체를 생성시 부모타입으로 설정하게되면 부모의 필드와 메소드만 접근이됨
		Aa a2 = (Aa) new Bb();		//타입 : Aa, 객체 : Bb()
								//B는 A이다.a (0)
		
		System.out.println(a2.a);
		//	다운캐스팅 : 부모타입을 자식타입으로 변환 (
		
		System.out.println("==Aa타입의 객체 a2를 Bb타입으로 다운 캐스팅==");
		Bb b2 = (Bb) a2;
		System.out.println(b2.a);	//Aa 필드
		System.out.println(b2.b);	//Bb 필드
		
		//	업캐스팅 : 자동으로 적용된다, 명시하지않더라도 컴파일러가 자동으로 등록.
		//		Aa의 필드와 메소드만 사용가능.
		Aa a3 = b2;	// Aa a3 = (Aa) b2;
		
		//다운캐스팅
		Bb b3 = (Bb) a3;	// Aa타입을 가진 a3 객체를 객체를 Bb객체로 다운캐스팅
		System.out.println(b3.a);
		System.out.println(b3.b);
		System.out.println("==========================");
		
		//Dd() 객체를 생성하면서 Aa타입으로 업캐스팅하는것
		//Aa의 필드와 메소드만 접근됨
		Aa a5 = new Dd();
		System.out.println(a5.a);
	
		//Aa타입의 a5를 Bb 타입으로 다운 캐스팅.	
	Bb b10 = (Bb) a5;
	System.out.println(b10.a);
	System.out.println(b10.b);
	
		//Bb타입의 b10을 Dd타입으로 다운캐스팅
	
	Dd d10 = d10;
	System.out.println(d10.a);
	System.out.println(d10.b);
	System.out.println(d10.d);
	
		//Aa타입의 a5를 Dd타입으로 다운캐스팅
	Dd d11 = (Dd) a5;
	System.out.println(d11.a);
	System.out.println(d11.b);
	System.out.println(d11.d);
	
	//업캐스팅
	
	AA b11 = d11;
	System.out.println(d11.a);
		
		
		
		
		
	}

}
