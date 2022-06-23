package day0608;

class Value {
	int value;
	
	Value () {}
	
	Value(int value) {
		this.value = value;
	}
}

// equals를 사용해 비교할 클래스 생성 

public class Equals1 {

	public static void main(String[] args) {
		
		Value v1 = new Value(10); // 매개변수가 1개 있는 생성자를 이용해 객체 생성
		Value v2 = new Value(10); // 매개변수가 1개 있는 생성자를 이용해 객체 생성
		
		// equals 사용방법 : 비교객체.equals(비교할 객체) 
		// equals 괄호안에 v1과 비교할 대상을 집어넣으면됨
		// 값이 같으면 true로 값이 다르면 false로 출력
		if (v1.equals(v2)) { 
			System.out.println("v1과 v2가 같습니다.");
		} else {
			System.out.println("v1과 v2가 다릅니다.");
		}
		
		// 출력은 결과가 다르다 : equals는 기본적으로 '주소값을 비교'하기 때문에
		//					  두 개의 객체를 생성하고 비교한 것이기 때문에 각각의 주소값이 다름
		
		//						-> 주소가 아닌 '값'을 비교를 하고 싶으면 '오버라이딩'을 사용하면 된다.
		
		
		v2 = v1;
		
		if (v1.equals(v2)) {
			System.out.println("v1과 v2가 같습니다.");
		} else {
			System.out.println("v1과 v2가 다릅니다.");
		}
		
		// 출력은 결과가 같다 : v1과 v2가 같은 주소값을 가지기 때문에 결과는 같음
	}

}
