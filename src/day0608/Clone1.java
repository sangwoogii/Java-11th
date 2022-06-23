package day0608;

class Point {
	public int x;
	public int y;
	
	Point () {}
}

public class Clone1 {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = p1;
		p1.x = 10;
		p1.y = 20;
		System.out.println("p2.x : " + p2.x);
		System.out.println("p2.y : " + p2.y);
		
		System.out.println("c1 : " + p1);
		System.out.println("c2 : " + p2);
		
		// 두 개의 값과 주소값이 같음
	
		// 얕은복사에 대한 설명 -> 값만 복사
		
		// p1의 값을 p2로 대입 -> 두 개의 변수가 같은 주소값을 가지기 때문에 값도 같은 값을 가짐
		// p1의 값이 p2의 값으로 들어가기 때문에 p1에 저장되어있는 값은 p2번에도 그대로 저장되기 때문
	}

}
