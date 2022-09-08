package chpter07_ex01;

public class Using_Method04 {

	//같은 class에서 method호출
	//main method는 static키가 붙은 method
	//	//static이 붙은 method에서는 인스턴스 method를 직접 호출이 불가능하다. (객체화후 호출은 가능)
	//	//static method는 직접 호출이 가능.
	static void print() {
		System.out.println("안녕");
	}
	
	static int twice (int k) {	//인풋 값을 2배로 돌려주는 method
		return k*2;
	}
	
	static double sum (int m, double n) {	//두값을 더해서 되돌려줌
		return m + n;
	}
	
	public static void main(String[] args) {	
		// 같은 클래스 내부에서 method호출.
		
		print();	//"안녕"
		
		int a = twice (3);	//twice (3)
		System.out.println(a);
		
		double d= sum (a, 5.8);	// 11.8
		System.out.println(d);
	
	}

}
