package day0608;

class CloneTest implements Cloneable { // Cloneable인터페이스를 구현한 클래스의 인스턴스만 복제할 수 있음
	public int x;
	public int y;
	
	@Override // 오른쪽마우스 source -> Clone2 오버라이딩 -> main으로가서 작성
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class Clone2 {

	public static void main(String[] args) {
		
		CloneTest c1 = new CloneTest();
		CloneTest c2 = null; // c2번이라는 참조변수만 생성해 놓은 것
		
		// 형변환 필요 -> 마우스 올리고 cast(형변환)시키기 -> 클론의 타입이 오브젝트라서 자식의 타입으로 형변환 시켜주어야함
		//		c2 = (CloneTest) c1.clone(); 
		
		try {
			c2 = (CloneTest) c1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		c1.x = 10;
		c1.y = 20;
		
		c2.x = 30;
		c2.y = 40;
		
		System.out.println("c1.x : " + c1.x + ", c1.y : " + c1.y);
		System.out.println("c2.x : " + c2.x + ", c2.y : " + c2.y);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		// 각각 다른 주소 값을 나타냄
	
		// 깊은 복사에 대한 설명 -> 메모리 자체까지 전부 복사해서 각각 새로운 값 (다른 값)을 집어넣음
		
		
		

	}

}
