package chapter09.Ex04;

class Student02 {


//필드의 접근 제어자 : default로 구성됨 : -- 외부 클래스에서 객체를 생성후 직접 수정이 가능하다.
static int serialNum = 1000;	//모든 객체에서 공유하는 필드, 객체를 생성할때마다 1씩 증가
int studentID ;		//학생 공유ID
String studentName;	//학생 이름
int grade;			//학년 : 기본값으로 4학년
String address;		//주소 : "서울"
}
class Student03 {
	//필드의 접근 제어자는 보안을 위해서 private으로 선언할 수 있다.
//	--필드의 값을 직접적으로 수정할 수 없다.
//	--



//필드의 접근 제어자 : default로 구성됨 : -- 외부 클래스에서 객체를 생성후 직접 수정이 가능하다.
private int serialNum = 1000;	//모든 객체에서 공유하는 필드, 객체를 생성할때마다 1씩 증가
private int studentID ;		//학생 공유ID
private String studentName;	//학생 이름
private int grade;			//학년 : 기본값으로 4학년
private String address;		//주소 : "서울"
private	int month;		//값	:1~12까지만 와야한다.
	//			//
		
		
		
//필드의 접근제어자를 private으로 설정하면 외부클래스에서 접근 불가함.
	//생성자나 메소드 (Setter)를 사용해서 필드의 내용을 수정
		//원하는 값을 (제어해서) 입력을 할 수 있다.
	
	Student03 () {
		serialNum++;
		studentID = serialNum;
		grade = 4;
		address = "서울 ";
	}
	Student03(String studentName){
		this();	//기본 생성자를 다시 호출
		this.studentName = studentName;
		
	}
	
	void print() {
		System.out.println("학생Id : " + studentID);
		System.out.println("학생이름: " + studentName);
		System.out.println("학년 : " + grade);
		System.out.println("주소 : " + address);
		System.out.println(""
				+ "");
	}
	
	void setGrade (int grade) {	//setter : grade에 값을 할당하는 setter
		
		
		
		if (grade >= 1 && grade <=4) {
			this.setgrade( grade);
			
		}else {
			System.out.println("잘못된 값을 입력했습니다. 1~4까지만 입력하세요.");
			return;
		}
		
	void setMonth (int month) {	//외부 클래스에서 접근가능.
		if (month >=1 && month <=12) {
			this.month =month;
		} else {
			System.out.println("잘못된 값을 입력했습니다. 1~12까지만 입력해주세요");
			return;
				
			}
		}
	}
		
		
		this.grade = grade;
	}

public class Student_Test2 {

	public static void main(String[] args) {
		//객체 생성
		Student02 s= new Student02();
		
		//default 접근 제어자 : 동일한 패키지에 존재하는 클래스에서 필드의 값을 직접 수정.
		s.serialNum = 2000;
		s.studentId = 100;
		s.studentName = "홍길동";
		
		//객체생성
		Student03 s3 = new Student03();	//접근제어자:private
//		s3.serialNum = 2000;
//		s3.studemtName = "홍길동";
		
		//필드의 값을 직접 입력하는 경우는 넣는 값을 제어할 수없다.
		
		s3.grade = 100;
		s3.month = 200;
		s3.setGrade(4);
		s3.print();
	}

}
