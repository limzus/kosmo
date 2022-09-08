package chapter06_Ex01;

// 클래스(붕어빵기계)와 객체(붕어빵)의 차이점
// 클래스 : 객체를 만들기위한 틀 , 붕어빵 기계, 설계도
	// 필드	:클래스 블럭에서 선언된 변수 (멤버변수)
	// 생성자
	// 메소드
	// 이너클래스

// 객체(인스턴스) : 클래스를 틀로해서 만들어진 RAM에 로드된 객체 , 붕어빵, 건물

//클래스를 객체로 만드는 작업을 인스턴스화

//외부클래스
class A{
	//필드 : Heap공간에 값이 저장됨, 값을 넣지않으면 강제 초기화가됨.
	int m=3;
	int n=4;
	
	A () {} //기본생성자: 클래스이름과 동일한 메소드를 생성자, 리턴타입이 없다.
		//객체를 생성할때 초기값을 부여하는 역활을 합니다.
	
	//메소드 : 호출시 작동이 됩니다.
	void print() {// 메소드
		int k=10;	//지역변수: Stack공간에 값이 저장됨.
		System.out.println(k);
		System.out.println(m+n);

	
	}
}

//외부클래스
class B{

public class Usingc_Class02 {

	public static void main(String[] args) {

		int aa; //지역변수

		//객체 생성은 main 메소드에서 작성
		A a = new A();
		//A : 참조 변수타입 : A
		//a : 객체 (참조변수)
		
		//new : Heap메모리에 값을 넣어라. 객체를 생성해라.
		//A() : 기본생성자 호출.
		
		//객체의 필드의 내용출력 (a.n a.m)
		System.out.println("==객체의 필드값 출력==");
		System.out.println(a.m); //필드의 m값출력
		System.out.println(a.n); //필드의 n값 출력
		a.print();
		System.out.println("=================================");
		
		//객체의 메소드 홀출(a.print())
		System.out.println("==객체의 메소드 호출==");
		a.print();
	//============================================
		// A cleass : 틀===> 객체화
		
		A b = new A();
		// A class를 틀로해서 b객체를 생성

		System.out.println(b.m); // 3
		//객체의 필드의 값을 수정
				b.m = 30;	//필드의 값을 30으로 수정
		b.m =30;	//필드의 값을 30으로 수정.
		b.n= 40;	//필드의 값을 40으로 수정.
	
		//필드의 내용을 출력
		System.out.println(b.m); //30
		System.out.println(b.n); //40
	
		//메소드 호출: 기능을 프로그래밍한것.
		
		b.print();
		System.out.println("=====ㅁ침ㄴㄴfmf xmffhgotj rorcpfmf angkswjd todtjd=======");
		A c= new A();
		
		System.out.println(c.m);
		System.out.println(c.n);
	
	
		int k = 10 ;	//지역 변수 :Stack공간에 값이 저장됨, 값을 넣지않으면 비어있음.
		System.out.println(k);
		System.out.println(c.m+c.n);
	
	
	}
	
	}

}
