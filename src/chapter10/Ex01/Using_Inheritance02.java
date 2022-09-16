package chapter10.Ex01;

import java.util.Scanner;

// 완료 시간 20분까지
class Fruit {	// 과일 <== 부모 클래스
	String name;	//과일 이름
	String colour;	//과일 색깔
	int large 		//과일의 크기
	sysout
	
	
	void eat () {
		System.out.println("모든 과일은 맛이 있습니다.");
		
	}
	void print() {
		System.out.println(name + "m" + colour + "," + large);
		
	}
	
	
	
}

class Apple {	//사과 <==자식 클래스
	//자식 클래스만 가지는 필드 1, 메소드1
	int applemass;
	
	
	Apple() {
		this.applemass= 800;
	}
	Apple(int Theapple) {
		this();
			
		this.applemass=applemass;
			
	}
			
			
	void printapple() {
		System.out.println("한개의 무게:" + applemass );
		System.out.println("사과는 무게를 4개씩 잽니다.");
		
		
	}
	
}
	//자식 클래스만 가지는 필드1, 메소드1
class Orange {	//오렌지 <== 자식 클래스
	//자식 클래스만 가지는 필드1, 메소드1
	
	int orangemass;
	
	
	Orange() {
		this.orangemass= 200;
	}
	Orange(int Theapple) {
		this();
			
		this.orangemass=orangemass;
			
	}
			
			
	void printorange() {
		System.out.println("한개의 무게:" );
		System.out.println("오렌지는 무게를 1개씩 팝니다.");
}

class Banana {	//바나나 < == 자식 클래스
	//자식 클래스만 가지는 필드 1, 메소드 1
	int banana
	
	
	
	static void printbanana() {
		System.out.println("안녕하세요. 바나나는 1다발씩 팔고있고요.");
		System.out.println("바나나는 무게를 재고있지않습니다.");
	}


}

public class Using_Inheritance02 {
Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
}
//나중에 다싷 해보자