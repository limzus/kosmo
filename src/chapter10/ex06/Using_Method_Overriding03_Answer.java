package chapter10.ex06;

class Animal {

	void run() {
	System.out.println(" 모든 동물은 달립니다.");
	
	}

	void eat() {
	System.out.println("모든 동물은 먹습니다.");
	
	}
}
class Tiger extends Animal{
	@Override
	void run() {
	System.out.println("호랑이는 달립니다.");
	@Override
	void eat() {
	System.out.println("호랑이는 고기를 먹습니다.");
	}
	
}

class Fish extends Animal{
	@Override
	void run() {
		System.out.println("물고기는 헤엄칩니다.");
	}
	
}

class Eagle extends Animal{
	@Override
	void run() {
		System.out.println("독수리는 납니다.");
	}
	
}

class Dog extends Animal{
	@Override
	void run() {
		System.out.println("개는 달립니다");
	}
	
}





public class Using_Method_Overriding03_Answer {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Tiger();
		Animal a3 = new Fish();
		Animal a4 = new Eagle();
		Animal a5 = new Dog();
		
		
		//배열에 객체를 저장 : Animal 객체를 배열에 저장
		Animal[] arr1 = new Animal[] (a1,a2,a3,a4,a5)
		
				
		//For문을 사용해서 배열의 내용을 출력
		for (int i=0; i<arr1.length; i++) {
			Animal aa1 = arr1[i];
			aa1.run();	//Animal의 메소드 호출
			aa1.eat();	//Animal의 메소드 호출
		}
		
		//Enhanced for문을 사용해서 출력
		System.out.println("==Enhanced for문을 사용해서 출력==");
		for (Animal : k) {
			k.eat
			
			
		}
	
	}

}
