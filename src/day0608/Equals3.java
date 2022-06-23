package day0608;

import java.util.Scanner;

public class Equals3 {

	public static void main(String[] args) {
		
		String id = "green";
		String pw = "1234";
		
		// 사용자에게 id와 pw를 입력받아
		// 모두 동일하게 입력하면 '로그인 성공'
		// 아니면 '로그인 실패'로 표시하기
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("아이디를 입력하세요. > ");
		String inputId = s.next();
		System.out.print("비밀번호를 입력하세요. > ");
		String inputPw = s.next();

		if (id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		// equals를 사용하지 않으면 주소값이 비교가 되어 각각 다른 주소값으로 저장이 되어 있어 로그인 실패로나옴
		// 주소값이 아닌 저장되어있는 '값으로 비교'를 하고 싶으면 equals를 사용
		// equals의 괄호 안에는 비교할 대상을 넣으면됨
		
		s.close();
	}

}
