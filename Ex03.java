package practice;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열
		// 정수 1,2,3,4,5를 배열로 선언하기
		// 1. new 연산자 없이 {}만 이용해서 배열생성 array1
		// 2. 길이가 5인 정수배열을 생성 후(array2) index를 사용해서
		// 배열의 각 요소에 정수 1,2,3,4,5넣기
		// 3. array1 배열의 요소를 for문으로 출력하기
		//    array2 배열의 요소를 향상된 for문으로 출력하기
		
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = new int[5];
		array2[0]=1;
		array2[1]=2;
		array2[2]=3;
		array2[3]=4;
		array2[4]=5;
//		for(int i=0; i<=array1.length; i++) {
//			System.out.println("array1["+i+"] : "+ array1[i]);
//		}
		for(int i : array2) {
			System.out.println(i);
		}
		
		// System.out.printf("", args)
		// printf("서식문자열", 값1, 값2...)
		// 첫번째 문자열 형식대로 내용 출력
		// %d 는 정수
		// %f 는 실수
		// %c 는 문자
		// %s 는 문자열
		// System.out.printf("이름 : %s\n나이 : %d", "홍길동", 20);
	}

}
