package chapter09.Ex05;

class Animal {
	String name="동물";
}
class Person extends Animal {
	String personName = "사람";
}
class Person_Person extends Person {

	String pName = "사람_사람";
}


public class Using_Polymorphism01_2 {

	public static void main(String[] args) {
		//1. Animal 객체 생성
		Animal a1=new Animal();
		System.out.println(a1.name);
		
		//2. Person 객체 생성
			// a2는 Animal타입과, Person타입을 내포하고있고, Animal타입으로 지정.
			// Animal타입의 필드, 메소드만 접근가능, Person타입으로 다운 캐스팅이 가능.
		Animal a2 = new Person();
		System.out.println(a2.name);
		
			//a2는 Person타입으로 다운캐스팅할수있다. (Animal , Person 필드, 메소드 모두 접근)
		Person p1 = (Person) a2;
		System.out.println(a2.name);
		System.out.println(p1.personName);
		
		//3. Person 객체를 PErson 타입으로 생성(Animal , Person 필드 , 메소드 모두 사용됨)
		Person p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2.personName);
			//업캐스팅
		Animal a3 = p2;	//a3는 Animal도 내포하고있고 Person을 내포하고 있고, Animal타입으로 지정이 되어있기때문에 Animal필드만 내포한다.
		System.out.println(a3.name);
			//다운캐스팅 
		Person에 p3 = (Person) a3; //p3는 Animal, Person를 내포하고 있고, Person타입으로 지정
		System.out.println(p3.name);
		System.out.println(p3.personName);
		
		//4. Person_Person, Person_person 타입을 내포하고 있고, Animal타입으로 지정
		//Animal타입의 필드와 메소드만 접근
		Animal a4 = new Person_Person();
		System.out.println(a4.name);
		
		//다운캐스팅
		Person_Person pp1 = (Person_Person) a4;
		System.out.println(pp1.name);
		System.out.println(pp1.personName);
		System.out.println(pp1.pName);
		
		//5. Person_person 객체를 Person_Person타입으로 생성
		Person_Person pp2 - new Person_Person();
	System.out.println(pp2.name);
	System.out.println(pp2.personName);
	System.out.println(pp2.pName);
	
	
	//6. Person_person객체를 Person타입으로 생성
		//p10은 Animal,
	Person p10 = new Person_Person();
	System.out.println(p10.name);
	System.out.println(p10.personName);
		
	}

}
