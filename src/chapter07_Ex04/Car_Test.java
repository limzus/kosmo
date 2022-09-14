package chapter07_Ex04;

class Car{
	String company;
	String model;
	String colour;
	double maxspeed;

	//2. 생성자
	
	//3. 메소드 (show() : 필드의 값을 출력
	
	//4. 메소드 (getter / setter)
	

	Car() {}
	
	Car(String company, String model, String colour, double maxspeed) {
		this.company=company;
		this.model=model;
		this.colour=colour;
		this.maxspeed=maxspeed;
	
		
	}
	
	void show() {
		System.out.println(company + "," + model + "," + colour + "," + maxspeed);
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(double maxspeed) {
		this.maxspeed = maxspeed;
	}


}




public class Car_Test {

	
	
	public static void main(String[] args) {
		//객체 생성
		// car1이란 객체 생성 , 현대, 모델은 그랜져 <== 필드의 값을 직접 입력
		// car2이란 쌍용자동차 체어맨 <== 생성자를 값 입력/ show() 값 출력
		// car3이란 기아 k9 <== setter를 통해서 값 입력 / getter를 통해서 값 출력
		
		Car car1 = new Car();
		car1.company= "현대";
		car1.model= "그랜져";
		car1.colour= "red";
		car1.maxspeed= 200.0;
		System.out.print(car1.company);
		System.out.print(car1.model);
		System.out.print(car1.colour);
		System.out.print(car1.maxspeed);
		
		Car car2 = new Car("쌍용", "체어맨" , "blue" , 100.0 );
		
		car2.show();
			

	
		
		
		
		
	}
}
