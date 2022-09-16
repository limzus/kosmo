package chapter10.ex06;

class Animal {

	int count;	//동물의 수	
	
	void run() {
	System.out.println(" 모든 동물은 달립니다.");
	System.out.println("호랑이는 달립니다.");
	
	}

	
	void eat() {
	System.out.println("모든 동물은 먹습니다.");
	System.out.println("호랑이는 달립니다.");
	
	}
}
class Tiger extends Animal{
	int count;
	
	Tiger() {
		this.count=count;
	}
	
	@Override
	void run() {
		System.out.println("호랑이는 달립니다.");
		System.out.println("호랑이는 달립니다.");
	}
	
	
	@Override
	void run() {
		System.out.println("호랑이는 달립니다.");
		System.out.println("호랑이는 달립니다.");
	}
	
}

class Fish extends Animal{
	int count;
	
	@Override
	void run() {
		System.out.println("물고기는 헤엄칩니다.");
		System.out.println("호랑이는 달립니다.");
	}
	
}

class Eagle extends Animal{
	int count;
	
	@Override
	void run() {
		System.out.println("독수리는 납니다.");
		System.out.println("호랑이는 달립니다.");
	}
	
}

class Dog extends Animal{
	int count;
	
	@Override
	void run() {
		System.out.println("개는 달립니다");
		System.out.println("호랑이는 달립니다.");
	}
	
}





public class Using_Method_Overriding03_Answer {

	public static void main(String[] args) {

			//1. 객체 생성
			// 1. 객체 생성 ( Animal 타입으로 생성)
		
		Animal a1 = new Tiger();
		Animal a2 = new Fish(10);
		Animal a3 = new Eagle(5);
		Animal a4 = new Dog50();
		Animal a5 = new Animal(70);
		
		//배열에 객체를 저장 : Animal 객체를 배열에 저장
		Animal[] arr1 = new Animal[] (a1,a2,a3,a4,a5)
		
				
		//For문을 사용해서 배열의 내용을 출력
		for (int i=0; i<arr1.length; i++) {
			//배열에 각 방에 저장된 객체를 Animal 객체에 저장
			Animal aa1 = arr1[i];
			Animal aa1 = arr1[i];
			aa1.run();	//Animal의 메소드 호출 eat() 메소드 : 오버라이딩된 메소드 출력
			aa1.eat();	//Animal의 메소드 호출 : 오버라이딩된 메소드 출력
			if (aa instanceof Tiger) {
				Tiger t1 = (tiger) aa;
				sum += t1.count;		//sum = sum+ t1.count
			}
			
			if (aa instanceof Fish) {
				Fish t1 = (Fish) aa;
				sum += t1.count;		//sum = sum+ t1.count
			}
			if (aa instanceof Eagle) {
				Eagle t1 = (Eagle) aa;
				sum += t1.count;		//sum = sum+ t1.count
			}
			if (aa instanceof Dog) {
				Dog t1 = (Dog) aa;
				sum += t1.count;		//sum = sum+ t1.count
			}
			
		
		}
		System.out.println("총 동물의 수는 : " sum);
		
		
		//Enhanced for문을 사용해서 출력
		System.out.println("==Enhanced for문을 사용해서 출력==");
		for (Animal : k) {
			k.eat
		}
		
		//객체를 배열에 저장
		int[] arr2 = new arr2[] {
		
		
			
		//For문을 사용해서 출력 : eat(), run(), 동물의 총 마리수
	
		//다운캐스팅해서 자식 필드의 count 읽어서 총 더한 값을 출력
	}

}