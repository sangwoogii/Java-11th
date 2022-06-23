package day0608;

public class IndexOf1 {

	public static void main(String[] args) {
		
		// IndexOf() : 매개값으로 주어진 문자열이 시작되는 위치를 반환. 반환할 값이 없으면 -1을 리턴
		
		String sub = "자바 프로그래밍";

		int loc = sub.indexOf("프로그래밍"); // 인덱스는 0번부터 시작하고 공백까지 포함해서 3번째
		System.out.println(loc);
		// 결과값이 숫자로 나와서 int형으로 선언해야함
		
		if (sub.indexOf("자바") != -1) {
			// 만약 sub에 포함되어있는 즉, 자바 프로그래밍이라는 글자에 '포함'되어 있는 자바라는 글자를 찾을 때 
			// indexOf 괄호안에는 자바라는 글자가 있는지 확인하는 것
			// 자바라는 이름 대신에 올 수 있는 즉, 반환할 값이 없기 때문에 -1이 없다면이라는 의미
			System.out.println("자바와 관련이 있군요");
		} else {
			System.out.println("자바와 관련이 없군요");
		}
	}

}