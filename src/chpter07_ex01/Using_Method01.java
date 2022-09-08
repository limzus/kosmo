package chpter07_ex01;


class B{
	//1. 리턴 타입이 없고(void), 입력 매개변수가 없는 method
	void print() { //출력해라 
		System.out.println("안녕");
		
	}

	//2. 리턴타입 int, 입력 매개변수없는 method
	int data() { //호출하는 곳에 정수3을 돌려줌
		
		return 3;   //3은 반드시 정수여야한다.
		
		
		
	}
	
	//3. 리턴타입 double, 입력 매개변수 2개인 method
	double summ (int a, double b) {
		return a+b;
	}
	//4. 리턴타입 없음(void) , 내부 함수를 종료함 (return;)
		//메소드 내부에서 return;을 만나면 메소드 종료
	
	void printmethod (int m) {
		if (m <= 0 || m > 12) {
							//메소종
			System.out.println("잘못된 입력입니다.");
			return;  // 메소드 종료 
			// 출력되지않는 부분 //도달할수없는 코드
				
		}else {
				System.out.println("입력한 달은" + m + "달입니다");
			}
		}
	}
	
public class Using_Method01 {
	public static void main(String[] args) {
		//method 사용
		
		//객체 생성 (b)
		B b= new B();
		b.print();
		System.out.println(b.data());
		System.out.println("======리턴 double, 입력매개변수 2개=======");
		System.out.println(b.summ(3, 5.5));
		System.out.println("==리턴이 없고 잘못된 입력이되면 메소드 종료됨");
		b.printmethod(13); //1~12달만 입력가능, 그외는 메소드 종료시킴.
		
		
		
	}
}
