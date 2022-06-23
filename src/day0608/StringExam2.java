package day0608;

import java.util.Scanner;

public class StringExam2 {

	public static void main(String[] args) {
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String num = "1234567890";
		
		System.out.print("영문 또는 숫자를 입력하세요 > ");
		Scanner s = new Scanner(System.in);
		String print = s.next();			// 사용자 (내)가 입력할 값 지정
		String temp = print.toLowerCase();	// 대문자 표시
		
		int alphaIdx = alpha.indexOf(temp);
		int numIdx = num.indexOf(temp);
		// indexOf를 사용할 땐 int형으로 사용
		
		System.out.print("입력받은 내용 : " + print);
		
		if (alphaIdx != -1) {
			// alphaIdx가 리턴할 값이 -1이 아니면 (리턴할 값이 없으면) == 문자라면
			System.out.println("는 문자입니다.");
		} else if (numIdx != -1){
			System.out.println("은 숫자입니다.");
		} else {
			System.out.println("을 다시 확인하세요.");
		}
		
		s.close();
	}

}
