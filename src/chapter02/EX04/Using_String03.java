package chapter02.EX04;

import java.util.Arrays;

public class Using_String03 {

	public static void main(String[] args) {
		
		// String vs 다른 참조자료형 비교
		// String에 저장된 값은 수정이 불가, 새로운 값이 생성됨
		
		//1. String (객체의 내용 변경이 불가함==> 새로운 객체 생성됨
		String str1 = new String("잘가");
		String str2 = str1;	//stack영역의 객체주소를 복사함.
		
		System.out.println(str1==str2);
		System.out.println(str1);
		System.out.println(str2);
		
		
		str1 = "안녕하세요?" ;
		System.out.println(str1);
		System.out.println(str2);;
		
		//2. 다른 참조자료형인 경우는 수정이 된다. (배열)
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 = arr1;	//arr1 참조변수의 주소를 복사해서 arr2에 저장. (stack 값을 복사)
		
		//값을 수정시
		arr1[0] = 6;
		arr1[1] = 7;
		arr1[2] = 8;
		
		str1= "안녕하세요"; //별도의 메모리 공간에 새롭게 생성함
		System.out.println(str1==str2); //false
		System.out.println(str1);
		System.out.println(str2);
		
		//주소가 같은지 확인
		System.out.println(arr1 == arr2); //stack의 주소 비교.
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		
		

		
		//물어볼것: 내가 이해했다면, String str2= new string("")을 하고서 변수의 값을 변경해주면,
		// 만약에 이것을 일상생활에 대입해보면
		// 집배원이 배달을해야할때, 우연찮게 배달을 두곳을 해야하는데, 똑같이 생긴 사람이였다. => 그렇지만 똑같이 생긴 사람에게 각각 배달을 했다면, 그것은 같은 주소에 배달한게 아니다. 두집에 배달한것이다.
	}
}


