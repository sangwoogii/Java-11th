package day0608;

public class Replace1 {

	public static void main(String[] args) {
		
		String oldStr = "안녕하세요 ~ 반갑습니다...";
		String newStr = oldStr.replace("안녕하세요", "Hello");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		// Replace는 문자열을 바꾸는 것
		// Replace 사용방법 -> 바꿀 객체.replace(기존글자, 바꿀글자);

	}

}
