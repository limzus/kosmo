package chpter07_ex02;

//class외부에 올수있는것 3가지: package, import(같은 package에 존재하지않는 클래스), 외부class

class A {
	//클래스 내부에 올 수 있는것 4가지: 필드//클래스내부에서 선언된 변수, 생성자, method, inner class;
	//1. field는 기본값이 지정되있지않아도, 컴파일러가 자동으로 넣는다.
	int m; //0 //Heap 공간에 저장// Heap영역은 값을 넣지않으면 강제초기화.
	int n;
	double k; //0.0
	String l; //null
	
	//생성자: class는 반드시 생성자가 존재해야한다. Return이 존재하지않는다.
	//기본생성자(입력매개변수가 생략된 생성자): 기본생성자는 생략될 수 있다. ===> 생성자가 존재하지않으면 기본생성자가 생략되있는것. A () {}
	//객체 생성시 생성자호출.
	//기본생성자는 생략되어있을경우 컴파일러가 자동으로 만들어준다.
	//클래스 내부의 다른 생성자가 존재할시: 컴파일러가 기본생성자를 자동으로 만들어주지 않는다.
	
	A () {

		System.out.println("기본생성자호출");
	}
	
	
	
	
	//객체를 생성하기위한 하나의 설계도;
	//결국 class를 만든다는 이야기는 객체를 사용해서 쓴다.;
	//객체생성은 main method에서 생성;
	//객체는 class를 그대로 memory에 로드시키는것.;
	//class를 생성하기위해서는 객체를 생성해야된다.;
	//하나의 class를 가지고 여러개의 객체를 생성할 수 있다.
	
	//method : 리턴타입 method명 (입력매개변수) {실행코드;}
	// 프로그램의 기능을 코드로 작성
	//호출해서 작동됨 , work1()
	
	void work1 () {
		System.out.println("work1 method 호출");
		
		
	}
	
	//work2( 정수, 정수) 리턴타입없을시 void라고 해줘야함
	int work2 (int a , int b) {	//지역변수 : method block에서 선언된 변수, Stack에 값이 저장
									//method가 종료되면 없어짐.
		System.out.println("work2 method 호출");
		
		return a+b;
	}
	
	//work3 (정수,더블,문자열)
	double work3 (int a, double b, String c) {
		System.out.println("work3 method 호출");
		System.out.println(a+ " , "+ b+ " , "+c);
		return a+b;
		
	}
	
	String work4 (String a) {
		
		return a;
	}
	
	
	//A : class a1//객체 new//Heap에 객체를 생성해라. A()//class내부에 생성자 호출.
	//A():class내부의 생성자호출, 기본생성자 : 입력 매개변수가 없는 생성자, 생략될 수 있다.
	
}


public class Using_Object {

	public static void main(String[] args) {
		A a1 =new A();
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.l);
		System.out.println("===================");
		
		
		//객체의 field의 값을 수정
		a1.m=10;
		a1.n=20;
		a1.k=30.0;
		a1.l="안녕하세요";
	
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.l);
		System.out.println("===================");
	
		//메소드 호출 (work2 (work2 (정수, 정수) 
		a1.work1();	//매개변수가 존재하지않는 method
		int k=a1.work2( 10,20);
		System.out.println(k);
		
		System.out.println(a1.work2(40, 50));
		

		System.out.println("==============");
		//메소드 호출 (work3 (정수, double, 문자열)) 리턴 double
		double d = a1.work3(10, 20.0, "오늘");	//리턴받은 값을 변수에 할당후 출력
	
		System.out.println("===================");
		System.out.println(a1.work3(30, 30.0, "날씨"));
		System.out.println("=========================");
		String s= a1.work4("안녕");
		System.out.println(a1.work4("하세요"));
	
		//클래스: 객체를 생성하기위한 설계도
		//객체: 클래스를 기반으로 만들어진 인스턴스 (객체) <==Heap에 로드됨.
		//class는 객체화해야 사용가능하다.
		A a2= new A();
		A a3= new A();
		A a4= new A();
		A a5= new A();
	}

}
//void는??
