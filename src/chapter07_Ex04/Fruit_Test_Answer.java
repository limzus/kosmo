package chapter07_Ex04;


class Fruit{
	//1. field
	String name; // 과일 이름
	String colour; // 과일 색깔
	int count; //과일 갯수
	int sugarContent; //과일의 당도
	
	
	
	
	Fruit () {}
	Fruit(String name, String colour, int count, int sugarContent) {
		this.name=name;
		this.colour=colour;
		this.count=count;
		this.sugarContent=sugarContent;
	}
	
	
	
	//2. 생성자
	//3. show() : 필드의 값을 모두 출력하는 메소드
	
	void show() {
		System.out.println(name+","+ colour + "," + count + "," + sugarContent);
	}
	//4. getter / setter 메소드
	
	
	
	show () {
		System.out.println(name+":");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSugarContent() {
		return sugarContent;
	}
	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}
	
	
}





public class Fruit_Test_Answer {

	public static void main(String[] args) {
			//1. banana 객체생성 후  필드에 기본값을 직접 입력후 / 직접 출력	Fruit banana= new Fruit
				banana.name="banana";
				banana.colour="yellow"
				banana.count=3;
				banana.sugarContent=15
						
				System.out.println("===banana 직접출력=======");
				System.out.println(banana.name);
				System.out.println(banana.colour);
				System.out.println(banana.count);
				System.out.println(banana.sugarContent);

		
		//2. apple 객체 : 생성자를 사용해서 4개의 필드에 초기값 할당. show()출력
		Fruit apple = new Fruit();
		show () {
			
		}
				
		//3. strawberry : setter를 사용해서 4개의 필드에 값할당.
		
		
		
	}

}
