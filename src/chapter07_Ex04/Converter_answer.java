package chapter07_Ex04;

class Converter {
	
	double rate;
	
	double toKWR(double dollar) {
		
	}
}

public class Converter_answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		//1. printf()를 사용해서 출력.
		System.out.printf("==소수점 2째 자리까지 잘라서 출력 (printf() ==");
		System.out.println("원화 100만원은 %.2f $입니다.");
		System.out.println();
		System.out.printf("100$는 %.2f원입니다.");
				//1. printf)_를 사용해서 출력.
		System.out.println();
		System.out.println("100$는 %.2f원입니다.", converter,toKRW(100));
	//2. 변수에 더블 값을 할당후 소숫점 2자리까지 변환해서 출력
		
		System.out.println("====예시=============");
	douuble per2 = 3.141592;
	//String으로 변환후 per2의 변수의 값을 소숫점 2자리까지 ㅇ출력후 다시 더블형으로 변환
	double per1 = double.parseDouble(String.format("%.2" , per2));
	System.out.println(per1);
	System.out.println("실수를 변수에 할당후 소숫점 2자리까지 자른후 더블에 저장====");
	double d2 =  converter.toDollar(1000000); //실수를 리턴받아서 d2에 할당.
	double d1 = Double.parseDouble(String.format("%.2f" d2));
	System.out.println("원화 100만원은" + d1+ "$입니다");
	double d4 = converter.toKWR(100);
	double d3= double.parsedouble(String.format("%.2f", d4, args));
	System.out.println("100$는 " + ㅇ3 + " 만원입니다. ");
	
	
	
	}
	

}


