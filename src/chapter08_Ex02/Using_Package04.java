package chapter08_Ex02;

//import시 *를 사용하는 경우 : 해당 패키지의 모든 클래스를 import
//	//하위의 패키지는 적용되지않는다.
//	//*: 패키지의 모든 클래스만 적용
import chapter08_Ex01.*;	//그 패키지의 모든 클래스만 적용. 하위 패키지는 적용되지 않는다.

public class Using_Package04 {

	public static void main(String[] args) {
		
		//	A 클래스 객체 생성
		A a = new A ();
		//B B = new b ();	//외부 클래스에서 접근불가 (default)
		C c = new C ();

		//D d = new D (); 	comm하위의 패키지는 import가 적용되지않는다.
	}

}
