package chapter02.EX04;

import java.util.Arrays;

public class Using_String05 {

	public static void main(String[] args) {
		//String의 주요한 특징 : 다른 class에는 없는 특별한 기능
		// 1. 수정이 불가하다. ==> 새로운 값을 Heap영역에 생성.
		// 2. 리터럴로 변수의 값을 넣을 경우 동일한 문자열은 주소를 공유.
		// 3. 객체 자체를 출력할때 객체의 주소가 출력되는 것이아니고, 객체의 값이 출력.
		//		toString() 메소드가 재정이 되어있다.
		// 4. 다양한 메소드가 정의되어 있다.
		
		// 1. 문자열의 길이 (length())	: 글자수
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length());	//11자
		System.out.println(str2.length());	//13자 <=== 글자수 자바는 한글을 1Byte로 처리 다른언어는 2Byte나 3Byte
	
		//2. 문자열 검색 (charaAt(), indexOf(), LastIndexOf())
		//2-1. charAt)_ : 해당 index (방번호)의 문자를 가져옴.
		
		System.out.println(str1.charAt(0)); //H
		System.out.println(str1.charAt(4)); //O
		System.out.println(str1.charAt(6)); //J
		System.out.println(str2.charAt(3)); //세
		System.out.println(str2.charAt(0)); //!
		System.out.println("====================");
		
		//2-2. indexOf() : 해당글자에 대한 방번호를 출력, 왼쪽(처음) ==> 오른쪽(끝)
		//		LastIndexOf() : 해당 글자에 대한 방번호를 출력, 오른쪽(끝) ==> 왼쪽(처음)
		
		System.out.println(str1.indexOf('a')); 		//7 'a'문자의 방번호
		System.out.println(str1.LastindexOf('a'));	// 9
	
		//a 문자를 8번방 이후에서 부터 검색
		System.out.println(indexOf("Java")8); //9
		System.out.println(lastindexOf("Java")8); //7
	
		//"Java" 문자열의 방번호를 찾음
		System.out.println(indexOf("Java")); //6
		System.out.println(indexOf("Java")); //6
		
		System.out.println(indexOf("하세요")8); //2
		//없는 내용을 검색 -1
		System.out.println(str1.indexOf(bye));
		System.out.println(indexOf(str2.indexOf("반갑습니다")); //7
		
		//-1 : 존재하지않는 경우
		System.out.println(str2.indexOf("고맙습니다"));
		
		//3. 문자열변환 및 연결 (String.valueOf(), concat()()
		String str3 = String.valueOf(2.3);	 //double => String
		String str4 = String.valueOf(false); //boolean -> String
		
		System.out.println(str3);
		System.out.println(str4);
	
		String str5 = str3.concat(str4); // +와 같음
		System.out.println(str5);
		
		//4. 문자열 ==> byte[] )getBytes)__ , 문자열 => char[] (toCharArray())
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		byte[] arr1 = str9.getBytes(); //영문인 경우 아스키코드로 배열에 저장
		byte[] arr2 = str9.getBytes();
		
		System.out.println(Arrays.toString(arr1));	//문자의 아스키코드
		System.out.println(Arrays.toString(arr2));	//문자 =-> 숫자코드로 변환
	
		char[] arr3 = str8.toCharArray();
		char[] arr4 = str9.toCharArray();
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	
	}
	
}

