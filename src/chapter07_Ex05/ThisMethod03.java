package chapter07_Ex05;

class Book {
	
	String bookName;	//책 이름
	String author;
	
	Book() {
		bookName= "책이름 없음";	//this() 메소드 : 생성자 호출
		author= "작자미상";		//this 키워드 : 자신의 객체의 필드, 메소드를 가르킬때 사용.
	}
	
	Book(String bookName) {
		this();
		this.bookName = bookName;
	}
	Book(String bookName, String author){
	this(bookName);
	this.author = author;
	
	}
	
	void print () {
		
		System.out.println("책의 이름은 :" + bookName);
		System.out.println("책의 저자는 :" + author);
	}
}


public class ThisMethod03 {

	
	
	public static void main(String[] args) {
	
		//기본 생성자 호출
		System.out.println("==");
		Book book1 = new Book(); //기본 생성자 호출
		book1.print();
		
		
		System.out.println("====매개변수가 1개인 생성자 호출");
		Book book2 = new Book("심청전");
		book2.print();
		
		System.out.println("====매개변수가 2개인 생성자 호출");
		Book book3 = new Book("홍길동전", "허균");
		book3.print();
		
		//4. 매개변수 2갸인 생성자 호출 ("어린왕자", "생텍쥐베리")
		System.out.println("==매개변수가 2개인 생성자 호출");
		Book book4 = new Book("어린왕자", "생텍쥐베리");
		book4.print();
		
		
		
		//5. 매개변수가 2개인 생성자 호출 ("프청천떵")
		System.out.println("==매개변수가 1개인 생성자 호출");
		Book book5 = new Book("프청청뗭")
		book5.print();
		
	
	
	}
}
