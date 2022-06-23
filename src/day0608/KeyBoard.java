package day0608;

import java.io.IOException;

public class KeyBoard {

	public static void main(String[] args) throws IOException {
		
		// 내가 작성한 글자를 컴퓨터가 똑같이 배껴쓰도록 하기 위함
		
		byte[] bytes = new byte [100];
		
		// System.in.read(); : 키보드에서 입력한 내용을 매개변수 값으로 주어진 
		//					   바이트 배열에 저장하고 읽은 바이트 수를 리턴함,
		// try - catch가 필요 -> 예외처리가 필요하다는 뜻
		
		System.out.print("입력 > ");
		int readByte = System.in.read(bytes); // 사용자가 입력한걸 저장하기 위한 변수선언
		
		String str = new String(bytes, 0, readByte);
		// 작성 방법 : 배열변수, 시작 인덱스, 입력할 변수명
		// 배열의 첫번째부터이기 때문에 0부터 키보드에 입력될 값 (readByte)까지라는 뜻
		System.out.println(str);
		
	}

}
