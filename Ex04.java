package practice;

public class Ex04 {
	
	
		// Math.random() : 0.0부터 1.0미만의 double타입의 수
		//					하나를 얻을 수 있는 메소드
	
		// Math.random() 메소드를 사용하여 주사위번호(정수) 하나를 얻을 수 있는 메소드 만들기
		// getDice

	public static int getDice() {
		
		int dice = (int)(Math.random() * 6);
		
		return dice;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myDice = getDice();
		System.out.println("나의 주사위 번호 : "+ myDice);
		
		
	}

}
