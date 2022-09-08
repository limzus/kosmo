package chapter06_Ex01;

import chapter02.EX06.Student;

public class Student_Test {

	public static void main(String[] args) {
		//객체는 반드시 main메소드에서 생성해야한다.
		Student Lee = new Student (80,99,70, "Lee");
		
		//같은 패키지 내부의 클래스는 import없이 바로 호출이 가능하다.
		Student Hong = new Student (88, 99, 77, "Hong");
		Hong.call();
		//
		Student Song = new Student (80, 60, 99, "song");
		
		Lee.call();

	}

}
