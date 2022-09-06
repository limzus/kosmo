package ex03;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {

		//main method의 입력 매개변수 전달하기, 메소드(객체지향언어) = 함수
		//	-method(함수)의 형식: 리턴타입 method명이 온다. (입력매개변수) [실행부}
		//						void main (String[] args) [ 실행부 ]
		
		//메인 메소드의 입력 매개변수 args[i]값을 받아서 각 변수에 할당.
	
		//안녕하세요 3 5.8 <== String[] args
		String a = args[0];	//안녕하세요 args[0]
		String b = args[1];	//3 args[1]
		String c = args[2]; //5.8 args[2]
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
		//출력
		System.out.println(a); 
		System.out.println(b);
		System.out.println(c);
		
		//연산
		System.out.println(a); // 3 (String) +1 (int) = 31  (String)
		System.out.println(b); // 5.8(String) +1 (int)= 5.81(String)
	
		//숫자형식으로 되어있는 String => 정수, double형으로 변환.
						// Integer.parseInt(String 변수)
						// Double.parsedDouble(String 변수)
	
		
		
		//연산 (형변환후 연산)
		int d= Integer.parseInt(b); //b <== 문자 3
		double e = Double.parseDouble(c);	//c <== 문자형 5.8
				
		System.out.println(d); //정수3
		System.out.println(e); //실수5.8
		System.out.println("========================")
	

	}


}
