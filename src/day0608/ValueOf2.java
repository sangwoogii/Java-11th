package day0608;

public class ValueOf2 {

	public static void main(String[] args) {
		
		// valueOf : 지정된 값을 문자열로 반환하는 것,
		//			 참조변수의 경우 toString()을 호출한 결과를 반환
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(10 + 12.5);		// 자동으로 형변환이 되어 값이 더해짐
		System.out.println(str1 + str2);	// 문자처리가 되어 각각의 str의 값을 붙힘

	}

}
