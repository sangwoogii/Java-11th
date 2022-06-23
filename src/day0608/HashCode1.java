package day0608;

public class HashCode1 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2)); // equals는 비교하는 코드
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// hashcode는 주소값을 정수형으로 반환하는 것
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		// System.identityHashCode()는 저장되어있는 객체의 주소값을 정수형으로 나타나지는 것
		
		
		// hashcode()와 System.identityHashCode()는 주소값을 정수형으로 반환한다고 생각하면 되는데
		// hashcode()는 같은 값을 가지고 System.identityHashCode()는 다른 주소값을 가진다고 생각
	}

}
