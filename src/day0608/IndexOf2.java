package day0608;

public class IndexOf2 {
	
	public static void emailTest(String str) { // 메서드를 만들어 확인하기 위함
		// 입력받은 값이 메일주소가 맞는지 확인하는 메서드를 작성하기 위함
		// 1. 반드시 '@'가 있어야함.
		// 2. 반드시 '.'이 있어야함.
		// 3. '@'는 '.'보다 먼저 작성되어야 함.	
		
		int at = str.indexOf("@");		// @ 위치를 찾는 변수
		int dot = str.indexOf(".");		// . 위치를 찾는 변수
		
		if (at != -1 && dot != -1 && at < dot) {
			// at가 반환할 값이 없고, dot도 반환할 값이 없고, at이 dot보다 값이 작으면 (@가 .보다 먼저 작성이된다면)
			// 출력되는 순서가 왼쪽에서부터 읽어가기 때문에 at이 dot보다 작다고 표현
			System.out.println("메일 주소가 맞습니다.");
		} else {
			System.out.println("메일 주소가 다릅니다.");
		}
	}

	public static void main(String[] args) {
		
		String email1 = "test@naver.com";
		String email2 = "testnaver.com";
		String email3 = "test@navercom";
		String email4 = "test.naver@com";
		
		emailTest(email1);
		emailTest(email2);
		emailTest(email3);
		emailTest(email4);

		
		// 값을 확인하기 위함 (클래스 메서드이기 때문에 객체생성이 따로 필요없음)
		// emailTest에는 매개변수가 있기때문에 괄호안에 바로 값을 집어 넣으면됨.
		
		

	}

}
