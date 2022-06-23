package day0608;

public class ByteToString {

	public static void main(String[] args) {
		// String 생성자는 API에서 찾아보면 다 나와있음
		
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		// byte코드의 배열을 문자열로 나타내면 '아스키코드'로 출력이됨
		
		// byte 배열을 이용하여 객체 생성하기
		String str1 = new String(bytes);
		System.out.println(str1);
		// String 객체의 매개변수 자리에 byte형태의 변수 (bytes)를 넣어 배열을 문자열로 변환시켜 출력함
		
		String str2 = new String(bytes, 6, 4);
		// offset 사용, bytes 배열 중 6번째 문자부터 4글자를 출력한다는 의미
		// 배열 인덱스이기 때문에 0번째부터 시작함
		System.out.println(str2);

	}

}
