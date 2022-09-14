package chapter09.Ex03;

//기존 클래스의 외부 클래스 생성 : 다른 패키지에서 접근이 불가능하다.
	//간단하게 외부에서는 접근이 불가능하고, 같은 패키지에서만 사용할경우 외부클래스를 사용하게 된다.
// 외부 패키지에서 A클래스를 사용하려고할때 별도의 파일로 생성해야한다.

class A{	//default 접근지정자가 생략됨. 다른 패키지에서는 접근이 불가능
	
	int m = 10;
	int n = 20;
	void print () {
		
		System.out.println(m + "," + );
	}
}

public class Using_Modifier10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
