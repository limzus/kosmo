package chpter07_ex01;

class A {
	
	//필드
	int m= 3;
	int n= 4;
	
	//기본생성자는 생략됨 A () {}
	
	//메소드1
	void work1() {
	
		int k= 5;	

	    System.out.println(k);
	    work2 (3);
	}
	
	void work2(int i) {
		int j=4;
		System.out.println(i+j);
	}
		
	}
public class Using_Filed {

	public static void main(String[] args) {
	
		//객체 생성
		A a = new A () ; //기본생성자 호출, 생략되어 있다.
		
		
		//필드값 출력
		System.out.println(a.m);	//3
		System.out.println(a.n);	//4
		//메소드 호출
		System.out.println("==========메소드 호출==");
		a.work1();	//5	//7
		
	}
	
	
}
