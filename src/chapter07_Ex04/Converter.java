package chapter07_Ex04;

class Iwannaprice {
	double origin;
	double effects;
	Iwannaprice() {}
	

	Iwannaprice(double origin,double effects) {
		this.origin=origin;
		this.effects=effects;
		
	}
	
	void show() {
		System.out.println(origin + "," + effects);
	}

	
	
	
	
}


import java.util.Scanner;

public class Converter { // 환율을 계산하는 클래스
	//1. 필드
	Scanner sc= new Scanner(System.in);
	
	
	
	
	
	
	double rate = sc.nextDouble();//환율을 저장하는 변수 : 1$ = 1,377.30

	
	
	static void DollartoKWR() { 
		ne
		
	}
	
	
	
	//2. 메소드 생성 (달러를 인풋받아서 원화를 반환하는 메소드), 메소드 이름: toKWR()
	
	//3. 메소드 생성 (원화를 인풋받아서 달러를 반환하는 메소드), 메소드 이름: toDollar()
	
	//4. setRate() 메소드 생성 : setter를 사용해서 rate 필드에 값을 할당.
		
	
	public static void main(String[] args) {
		//네이버를 검색해서 오늘 환율을 알아와서
		//객체 생성후 스캐너로 환율을 인풋받아서 setRate() 메소드에 저장후
		//원화 100만원 ===> 몇$인지 출력
		//달러 $100 ===> 몇만원인지 출력
		
		//완료시간 : 13시 10분까지
		
		

	}

}
