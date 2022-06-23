package day0608;

import java.io.IOException;
import java.util.Scanner;

public class StringExam3 {

	public static void main(String[] args) {
		
		System.out.print("영문 또는 숫자 입력 > ");
		
		// Scanner를 사용하는 방법
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next(); // 사용자 (내)가 입력할 값 지정
		int str = input.charAt(0);
		// String 자료형을 아스키코드로 바꾸어 주기 위해 int 값에 대입하고
		// 첫 글자 하나만 확인하는 코드
		System.out.println(str);
		
		if ((str >= 65 && str <= 90) || (str >= 97 && str <= 122)) {
			// 65 ~ 90 : 아스키코드 대문자 숫자범위
			// 97 ~ 122 : 아스키코드 소문자 숫자범위
			System.out.println("입력하신 " + (char)str + "은 문자입니다.");
		} else if (str >= 48 && str <= 57) { // 48 ~ 57 : 아스키코드 숫자범위
			System.out.println("입력하신 " + (char)str + "은 숫자입니다.");
		} else {
			System.out.println("입력한 값을 다시 확인하세요.");
		}
		
		
		
		
		
//		System.in.read(); 방법 -> try - catch문 필요
//		try {
//		 System.in.read(); : 입력한 값을 아스키코드 값으로 저장함, int형으로 작성
//			int str = System.in.read();
//			
//			if ((str >= 65 && str <= 90) || (str >= 97 && str <= 122)) {
//				System.out.println("입력하신 " + (char)str + "은 문자입니다.");
//			} else if (str >= 48 && str <= 57) {
//				System.out.println("입력하신 " + (char)str + "은 숫자입니다.");
//			} else {
//				System.out.println("입력한 값을 다시 확인하세요.");
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		scan.close();
	}

}
