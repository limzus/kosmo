package chapter09.Ex04;

class Student {
	
	
	int studentID = 1000;		//학생 공유ID
	String studentName;//학생 이름
	int grade;			//학년 기본값으로 4학년
	String address;		//주소: "서울"

	Student () {}
	
	Student (int StudentID) {
	this();
	this.studentID = studentID;
	}
	
	Student (int studentID, String studentName) {
		this(int studentID);
		this.studentName = studentName;
	Student (int studentID, String studentName, int grade) {
		this(int studentID, String studentName);
		this.grade = grade;
		
		
		}
	
				
		
	}
	
	
	//완료시간 : 16:45분까지
}




public class Student_Test {

	public static void main(String[] args) {
		//객체를 생성시 자동으로 학번이 1000부터 1씩 자동으로 학번이 저장되어야 한다.

		//studentID : 1000부터 학생객체를 생성할때 마다 고유한 값으로 적용되어있어야함.
		
		Student lee = new Student("이지원"); //1001
		
		
		Student hong = new Student("홍지원"); //1002
		
		Student jung = new Student("정지원"); //1003
		
		Student park = new Student("박지원"); //1004
	
		
	
	
	
	}

}
