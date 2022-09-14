package chapter07_Ex05;

class Cartype {
	
	//this 키워드: 필드나 메서드 선언시 사용 불가.
	//	-생성자, 메서드 내부에서 필드나 메서드를 사용할때 자신의 객체 필드나 메서드를 지칭.
	//	-자신의 객체의 필드, 메서드를 가르킨다. 기본적으로 생략해서 많이 사용.
	// 반드시 사용해야할 경우: 메소드, 생성자에서 입력 매개변수 이름, 필드 이름이 동일할 경우
	//this ()	-생성자 내부에서만 사용, 반드시 첫 라인에 위치.
	//	-자신의 객체의 다른 생성자를 호출.
	//	-생성을 오버라이딩할 때, 코드를 간략하게 사용.
	
	
	
	
	String companyName;	//현대자동차
	String colour;	//검은색
	double maxspeed;	//200.0 km/h
	
	Cartype () {
		companyName="현대";	//this키를 생략시 자동으로 컴파일러가 할당.
		colour="검은색";
		maxspeed=200.0;
	
	}
	
	Cartype (String companyName) {
		this();
		this.companyName=companyName; // 매개변수 이름, 필드이름이 같을때 this. ===> 이 매개변수의 이름이 필드에 있다.
	}
	
	Cartype (String companyName, String colour) {
		this(companyName);
		this.colour=colour;
		
	}
	
	Cartype (String companyName, String colour, double maxspeed) {
		this(companyName,colour);
		this.maxspeed=maxspeed;
	}
	
	void print() {
		System.out.println(companyName+ ","+ colour+ ","+ maxspeed);
	}
	
	
	
	//생성자
	
	//필드의 모든 값을 출력 메소드(print())
}

public class ThisMethod04 {

	public static void main(String[] args) {
		//1. 매개변수 0개일때, 기본 필드의 값 출력
		Cartype a =new Cartype();
		a.print();		
		
		//2. 매개변수 1개일때, companyName만 출력, 나머지는 기본값 출력
		Cartype b =new Cartype("bmw");
		b.print();
		//3. 매개변수 2개일때 
		Cartype c=new Cartype("bmw", "orange");
		c.print();
		
		//4. 매개변수 3개일때,
		Cartype d=new Cartype("제네시스", "black", 150.0);
				d.print();
		

	}

}
