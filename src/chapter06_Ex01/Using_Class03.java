package chapter06_Ex01;

//같은 패키지 내에서 클래스 이름이 중복되면 오류가 발생함.
class C {
		
	//필드 : Heap영영에 값이 저장
	int a ;
	int b ;
	String name;
	




	C () {} // 기본생성자: 매개변수값이 없고, 실행부도 없는 생성자 , 생략가능

	void call() {
		int c;	//지역변수 : Stack, 강제 초기화가 안되므로 반드시 기본값을 넣고 출력
		System.out.println("출력내용입니다.");

		//System.out.println(c); //초기값을 할당해야한다.
		System.out.println(a);       // 0 = 초기값
		System.out.println(b);
		System.out.println(name);
	
	}//call

}//C

	
public class Using_Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c= new C();
		c.call();
		System.out.println(c.name);
	}

}
