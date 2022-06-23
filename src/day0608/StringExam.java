package day0608;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 > ");
		String word = s.nextLine(); // nextLine : 공백을 포함하여 입력을 받음
		String arr [] = word.split(" ");
		// split을 사용할 땐 String 배열변수명 [] 으로 작성
		// split : 공백을 기준으로 각각의 값을 넣을 수 있음
		
		for (int i=0; i<arr.length; i++) { // 배열변수의 길이만큼
			System.out.print(arr[i] + ", ");
		} // 배열을 이용해 split을 활용하는 것이기 때문에 for문으로 값 출력
		
		System.out.printf("\n총 %d개의 단어가 있습니다.", arr.length);
		
		s.close();
	}

}
