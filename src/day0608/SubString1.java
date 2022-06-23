package day0608;

public class SubString1 {

	public static void main(String[] args) {
		
		// substring 은 두 가지가 가능
		
		String s = "abcdefg";
//		String r = s.substring(3);
		// 인덱스이기 때문에 0번부터 시작, 숫자가 1개만 들어있으면 그 숫자부터 끝까지 출력
		// 위의 인덱스는 3번째 글자부터 끝까지 출력한다는 의미
		
		String r = s.substring(3, 6);
		// 모든 인덱스는 0번째부터 시작
		// '이상 (<=) 과 미만 (<)' 으로 나타나짐
		// 3번째 글자 이상부터 6번째 글자 미만까지의 글자를 나타낸다는 의미
				
		System.out.println(r);
		
		System.out.println();
		
		String ssn = "911206-1256932";

		String firstNum = ssn.substring(0, 6); // 주민번호 앞자리만 출력
		String backNum = ssn.substring(7, 14); // 주민번호 뒷자리만 출력
//		String backNum = ssn.substring(7);
		
		System.out.println(firstNum);
		System.out.println(backNum);

	}

}
