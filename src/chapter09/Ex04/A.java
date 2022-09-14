package chapter09.Ex04;

//static 접근 제어자 : 필드, 메소드 앞에 설정
//	=객체 생성 없이 사용 가능., 객체 생성후에도 사용가능
//	-모든 객체에서 공유되는 필드

//인스턴스필드 : Heap 영역에 변수와 값이 저장이 ㅗ디어 이싿.
// 정적 필드: 클래스영역에 변수와 값이 저장되어있다. Heap 영역에서는 클래스 영역의 값을 가리키고있다


public class A {

	int m= 3;
	static int n= 5;
	
	void print() {
		System.out.println("메모리에 출력");
	}
}
