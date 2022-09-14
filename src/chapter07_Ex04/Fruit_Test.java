package chapter07_Ex04;


class Fruit{
	//1. field
	String name; // 과일 이름
	String colour; // 과일 색깔
	int conunt; //과일 갯수
	int sugarcontent; //과일의 당도
	
	
	
	
	Fruit () { 
		this.name = name;
		
		
	}
	
	void Banana(String name,String colour) {

	System.out.println(name);
	
	name= "banana";
	
	}
	
	
	//2. 생성자
	//3. show() : 필드의 값을 모두 출력하는 메소드
	
	//4. getter / setter 메소드
	
	show () {
		System.out.println(name+":");
		
	}
	
	
}





public class Fruit_Test {

	public static void main(String[] args) {

		//1. banana 객체생성 후  필드에 기본값을 직접 입력후 / 직접 출력
		
		//2. apple 객체 : 생성자를 사용해서 4개의 필드에 초기값 할당. show()출력
		
		//3. strawberry : setter를 사용해서 4개의 필드에 값할당.
		
		
		
	}

}
