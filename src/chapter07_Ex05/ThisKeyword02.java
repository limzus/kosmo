package chapter07_Ex05;

//반드시 this keyword를 사용해야하는 경우:

// - 생성자, 매서드의 매개변수이름, 필드이름이 동일한 경우 필드 이름에 this를 명시해야한다.


class AA {
	int m; //0
	int n; //0
	 
	void init(int m, int n) { // this key를 명시하지않는 경우
		m=m;	//3개의 m 모두 지역변수.
		n=n;
		
		
	}
}
class BB {
	int m;
	int n;
	
	void init(int m, int n) { //this 키를 명시한 경우
		this.m=m; //this.m: 필드, m: 지역변수
		this.n=n;
	}
}



public class ThisKeyword02 {
	public static void main(String[] args) {
		
		AA aa= new AA(); // 기본생성자 호출.
		
		aa.init(10, 20);
		System.out.println(aa.m);//0
		System.out.println(aa.n);//0
		
		BB bb= new BB();
		bb.init(10,20);
		System.out.println(aa.m);
	}

}
