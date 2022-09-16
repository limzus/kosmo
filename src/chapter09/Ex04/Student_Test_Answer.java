package chapter09.Ex04;

class Student


	static int serialNum = 1000;	//모든 객체에서 공유하는 필드, 객체를 생성할때마다 1씩 증가
	int studentID ;		//학생 공유ID
	String studentName;	//학생 이름
	int grade;			//학년 : 기본값으로 4학년
	String address;		//주소 : "서울"
	
	//기본 생성자
	
	Student(){
		serialNum++;	//객체를 생성시 1씩 증가
		studentID = serialNum;
		grade= 4;
		address = "서울";
	}
	
	Student (String studentName){
		this();	//기본 생성자 호출후 아래 내용 실행
		this.studentName = studentName;
	}
	
	
	void print() {
		System.out.println("stduentID : " + studentID);
		System.out.println("학생이름" +  studentName);
		System.out.println("주소" + address);
		System.out.println("학년" + grade);
		
		
	}
public class Student_Test_Answer {

	
	public static void main(String[] args) {

		//객체를 생성시 자동으로 학번이 1000부터 1씩 자동으로 학번이 저장되어야 한다.
		
		
	}

}
