package day0608;

class Member {
	public String id;
	
	Member () {}
	
	public Member(String id) {
		this.id = id;
	}
	
	
	// 주소값이 아닌 값을 비교하고 싶으면 오버라이딩 사용
	// -> API에 object를 치고 equals의 선언부를 가져오면됨 (public boolean equals(Object obj) -> 선언부)
	public boolean equals(Object obj) {	// 형변환이 가능한지 instanceof로 확인
		if (!(obj instanceof Member))	// = Object형의 obj가 Member타입으로 형변환이 가능하다면
			return false;				// -> 형변환이 불가능하다면 리턴으로인해 코드를 빠져나간다.라는 뜻
		
			Member m = (Member)obj;		// obj를 Member타입으로 형변환
			return this.id == m.id;
			
			// Object에선 id의 값이 없기 때문에 obj가 Member타입으로 형변환이 가능한지 instansof로 확인
			// 선언부에서 Object 자료형을 들고오면 모든 자식들이 상속을 받을 수 있음
		}
}


public class Equals2 {

	public static void main(String[] args) {
		
		Member mem1 = new Member("blue");
		Member mem2 = new Member("blue");
		Member mem3 = new Member("red");
		
		if (mem1.equals(mem2)) {
			System.out.println("mem1과 mem2는 동일합니다.");
		} else {
			System.out.println("mem1과 mem2는 동일하지 않습니다.");
		} // 각각의 주소값이 다르기 때문에 동일하지 않다고 나옴
		
		if (mem1.equals(mem3)) {
			System.out.println("mem1과 mem3는 동일합니다.");
		} else {
			System.out.println("mem1과 mem3는 동일하지 않습니다.");
		} // 각각의 주소값이 다르기 때문에 동일하지 않다고 나옴
		
		
		// 주소값이 아닌 값을 비교하고 싶으면 오버라이딩 사용
		// -> API에 object를 치고 equals의 선언부를 가져오면됨
		
		
		
		
		

	}

}
