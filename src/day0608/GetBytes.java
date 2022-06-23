package day0608;

import java.io.UnsupportedEncodingException;

public class GetBytes {

	public static void main(String[] args) {
		
		// getBytes() 메서드 : 시스템의 기본 문자셋으로 인코딩된 바이트 배열을 리턴함
		
		// getBytes() 사용방법 1
		// byte[] bytes1 (변수이름) = "문자열".getBytes();
		// -> 해당 문자열이 몇 바이트를 차지하고 있는지 알려주는 메서드
		
		// getBytes() 사용방법 2
		// byte[] bytes2 = "문자열".getBytes(Charset charset); -> Charset 타입의 charset
		
		
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		// 몇 바이트를 차지하고 있는지 길이를 나타내기 때문에 length
		// utf-8로 바꾸었기 때문에 -> 한글자에 3바이트를 차지 : 총 15
		
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);
		
		System.out.println();
		
		
		try {
			byte[] bytes2 = str.getBytes("UTF-8");
			// UTF-8도 Exception(예외)이 필요 -> try-catch문 필요
			System.out.println("bytes2.length : " + bytes2.length);
			String str2 = new String(bytes1);
			System.out.println("bytes2 -> String : " + str2);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			byte[] bytes3 = str.getBytes("EUC-KR");
			// EUC-KR도 Exception(예외)이 필요 -> try-catch문 필요
			
			// EUC-KR이 원래 charset의 기본타입 (한 글자당 2바이트)
			System.out.println("bytes3.length : " + bytes3.length);
			String str3 = new String(bytes3);
			System.out.println("bytes3 -> String : " + str3);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
