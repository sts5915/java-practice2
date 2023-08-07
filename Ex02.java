package practice;

import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		
		// Scanner 메소드
		// next : 공백전까지 입력한 문자열을 읽어온다
		// nextInt : 공백전까지 입력한 정수를 읽어온다
		// nextDouble : 공백전까지 입력한 실수를 읽어온다
		// nextLine : 공백포함 전체 통 문자열을 읽어온다
		
		// Scanner를 사용해서 시작값 끝값 증가값을 입력받아 합을 구하는 식을
		// for문을 사용해서 만들어보기
		int sum=0;
		int num1, num2, num3;
		
		System.out.print("시작값 입력 : ");
		num1 = scan.nextInt();
		System.out.print("끝값 입력 : ");
		num2 = scan.nextInt();
		System.out.print("증가값 입력 : ");
		num3 = scan.nextInt();
		
		for(int i=num1; i<=num2; i+=num3) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지 %d씩 증가한 값의 합 : %d\n",
				num1, num2, num3, sum);
	}

}
