package chpter07_ex03;

class AA {
	
	//필드
	int a;
	int b;
	int c;
	int d;
	Stirng name ;
	
	//생성자
	//1. 기본생성자
	AA () { int a{
		this.a=a;
		
	}
	
	AA ( int a, int b) {
		this.a=a;
		this.b=b;
		
		
	}
	AA (int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	AA (int a, intb, int c, int d, String e) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	AA
		System.out.println("기본생성자 호출");
		
	}
	void show() {System.out.println(;"a : " + "b : " + "c:" + c + "d: " + d);
		System.out.println("name:" + name);

	
	}
}


public class Using_Constructor {

	public static void main(String[] args) {
		//Constructor 생성자 오버로딩
		
		//객체 생성 (기본생성자 호출)
		AA aa1 = new AA(); //기본생성자 호출
		aa1.show();
		System.out.println("==============");
		//매개변수 1개인 기본생성자 호출
		AA aa2 = new AA(10);
		aa2.show();
		System.out.println("===================");
		
		//매개변수 2개인 생성자호출
		AA aa3 = new AA (10, 20);
		aa3.show();
		
		//매개변수 3개인 생성자호출.
		AA aa4 new AA (10,20,30);
		aa4.show();
		System.out.println("================");
		AA aa5 = new AA (10,20,30,40)
		aa5.show();
		System.out.println("================");
		AA aa6 = new AA (10,20,30,40,aa1 "홍길동");
		aa6.show();
	}

}
