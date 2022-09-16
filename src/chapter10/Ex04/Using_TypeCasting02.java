package chapter10.Ex04;

class Aa{
	
	int a = 10;
	void a() {
		System.out.println("A class 출력");
		
	}
}

class Bb extends Aa{
	
	int b= 20;
	void b() {
		System.out.println("ㅠ class 출력");
		
	}
}
class Cc extends Bb{
	int c= 30;
	void c() {
		System.out.println("C class 출력");
		
	}
}
public class Using_TypeCasting02 {

	public static void main(String[] args) {
//  다형성 :상속 관계일때 하나의 객체가 여러 타입으로 정의해서 사용가능
		
		//1. Aa 객체를 Aa 타입으로 생성
		//aa1은  Aa타입만 내포, Aa를 타입으로 지정
		//aa1은 Aa의 필드나 메소드만 사용가능
		System.out.println("== 1. Aa aa1 = new Aa();==");
		Aa aa1= new Aa();
		System.out.println("== 2. Bb bb1 = new Bb();==");
		Bb bb1 = new Bb();
		//Aa 타입의 필드와 메소드 출력
		System.out.println(bb1.bb);
		
		
		
	
		
		
		
	}

}
