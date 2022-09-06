package ex03;

import java.util.Arrays;

public class ArgumentOfMainMethod02 {

	public static void main(String[] args) {

		
		// Main method로 값 던져 주기
		
		//args.length 내용 출력하기
		System.out.println(args.length);
		
		//main Methods로 넘겨진 값을 자동으로 출력하기
		System.out.println("==for문장을 사용해서 Main Method args 출력==");
		for(int i=0 ; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
		System.out.println("==Enhanced For===");
		for(String k : args) {
			System.out.println(k+ " ");
		}
		System.out.println();
		System.out.println("-==Arrays.tostring=======");
	System.out.println(Arrays.toString(args));
	}

}
