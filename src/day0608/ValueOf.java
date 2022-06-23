package day0608;

public class ValueOf {

	public static void main(String[] args) {
		
		// int를 String으로 변환하는 방법 1 (valueOf)
		int iVal = 100;
		String strVal_1 = String.valueOf(iVal);
		System.out.println(strVal_1);
		
		// int를 String으로 변환하는 방법 2 -> int 변수에 ""를 붙여줌 (문자 + 숫자 = 문자)
		double dVal = 200.0d;
		String strVal_2 = dVal + "";
		System.out.println(strVal_2);
		
		
		double sum_1 = Integer.parseInt(strVal_1) + Double.parseDouble(strVal_2);
		// sum은 iVal과 dVal의 합계를 구하는 변수 -> int와 double의 자료형이기 때문에 sum의 자료형은 double로 한다.
		System.out.println("strVal_1 + strVal_2 = " + sum_1);

		// 요즘 많이 쓰는 방식 (parseInt 대신 valueOf 사용)
		double sum_2 = Integer.valueOf(strVal_1) + Double.valueOf(strVal_2);
		System.out.println("strVal_1 + strVal_2 = " + sum_2);
		
		
		System.out.println();
		
		
		// ※ String 클래스에서 자주 사용하는 메서드 ※
		
		// split ("문자열") : 해당 문자열을 '구분자'로 나눠 배열에 각각 값을 저장하는 메서드
		String animal = "dog, cat, bear";
		String [] arr = animal.split(","); // ,(쉼표)를 기준으로 구분함
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// join() : 여러 문자열 사이에 구분자를 넣어서 결합하는 메서드
		String str = String.join("-", arr);
		System.out.println();
		System.out.println(str);
		
	}

}
