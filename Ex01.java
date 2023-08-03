package practice;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// "이몽룡"과	"성춘향"은
		// 사랑하는 사이다.
		
		// 이 글을 String 변수에 담고 출력해보기
		// (이스케이프 문자사용)
		
		String str = "\"이몽룡\"과\t\"성춘향\"은\n사랑하는 사이다.";
		System.out.println(str);
		
		// 정수 65을 byte 타입 변수에 저장후 아스키 문자로 출력하기
		byte ascii = 65;
		System.out.println((char)ascii);
		
		// 다음 while문에서 한줄코드로만 작성
		// 1부터 10까지 숫자를 더하는 식 완성하기
		// 55
		int x = 0;
		int add = 0;
		while(x<10) {
			add+= ++x;
		}
		System.out.println(add);
	}

}
