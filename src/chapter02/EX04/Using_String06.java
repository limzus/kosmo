package chapter02.EX04;

import java.util.Arrays;

public class Using_String06 {

	public static void main(String[] args) {

		//String의 다양한 메소드
		//5. 문자열 수정 (toloercase(), toUppercase() )
		//				소문자로 변환	대문자로 변환
	
		String str1 = "Java study";
		System.out.println(str1.toLowerCase()); //소문자로 출력
		System.out.println(str1.toLowerCase()); //대문자로 출력
		System.out.println("============================");
		//replace(원본,수정) //원본을 수정으로 변환해라
		String str2 = str1.replace("study", "공부");
		
		
		System.out.println(str1.replace("study", "공부"));
		System.out.println(str1);
		System.out.println(str2);
		
		//substring () : 글자를 잘라서 출력 (0,5) , 0은 포함, 5 미포함
		System.out.println(str1.substring(0, 5)); //index 0~ index5앞까지 잘라라
			//Java
		System.out.println(str1.substring(3,8)); //3은 포함, 8은 미포함
			//a Stu
		System.out.println(str1.substring(5));  //index 5 방부터 뒤로 모두 지움
				//study
				
				////split() : 특정문자를 기준으로 잘라서 배열에 저장 <==
				//	/ - 공백
				String[] strArr1 = "abc/def-ghi jkl".split("/|-| ");
	
				for (int i=0 ; i <strArr1.length; i++) {
					System.out.println(strArr1[i] + " ");
				}
				for (String k : strArr1) {
					System.out.println(k+" ");
					
				}
					System.out.println();
					System.out.println(Arrays.toString(strArr1));
					
				//공백을 기준으로 잘라서 뱌욜애 저장후 출력 : for, Enhanced for, Arrays.toString()
					//나중에 해보자.
					String[] a = "오늘은 날씨가 매우 맑습니다. 참 화창한 날씨입니다.".split(" ");
					
					for(int b=0; a.length>b; ++b  ) { 
					 
					}
							
				
					
					//trim() :좌우의 공백을 제거
					System.out.println("   abc    ".trim());
					
					//6. 문자열 비교 ( == ) 
					String str3 = new String ("Java");
					String str4 = new String ("Java");
					String str5 = new String ("Java");
					
					System.out.println(str3==str4); //false <======주소를 비교
					System.out.println(str4==str5); //flase
					System.out.println(str5==str6); //false
					System.out.println("===============");
					// equals() : Heap메모리에 값을 비교
					System.out.println(str3.equals(str4)); //true
					System.out.println(str4.equals(str5)); //false
					System.out.println(str4.equalsIgnoreCase(str5)); //true
	}

}
