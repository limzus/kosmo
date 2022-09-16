package chapter10.ex06;

class Animal {
	//자식클래스에서 2개의 메소드를 오버라이딩
	//Animal 타입으로 정의, 배열에 저장후, Overriding된 메소드 출력 (for, enhanced for)
	
	
	
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
		
	}
	
}

class Tiger extends Animal {
	@Override
	void run() {
		System.out.println("어흥");
	
}
	
}	
	
}
class Eagle extends Animal {
	void eat() {
		System.out.println("대머리독수리는 동물의 사체를 먹습니다.");
}

class Fish extends Animal{
	void eat() {
		System.out.println("물고기는 사료를 먹습니다.");
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("멍멍");	
	void eat() {
			System.out.println("개는 사료를 먹습니다.");
}
class Eat{
	String arr1[] = new string
}
	
	
	
public class Using_Method_Overriding03 {
	
	public static void main(String[] args) {

	}

}
