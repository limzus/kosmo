package chapter08_Ex01;

public class Using_Package01 {

	public static void main(String[] args) {
		
		//A 클래스와 같은 패키지안에 존재하기때문에 import없이 바로 접근이 가능.
		System.out.println("A클래스 접근(public)==");
		A a = new A(); 
		a.print();
	
		System.out.println(a.m);	//접근 가능
		System.out.println(a.n);	//접근 가능
		a.print();	//접근 가능
	
	
	
	}
}
