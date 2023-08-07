package practice;

import java.util.Scanner;
// Student 클래스를 만든다.
// 필드는 private int studentID;
// private String name; private int age;이다
// 생성자의 매개변수로 매개값을 받아 필드를 초기화
// 필드에 대한 gettet / setter 메소드 만들기

class Student{
		private int studentId;
		private String name;
		private int age;
		
		public Student(int studentId, String name, int age) {
			this.studentId = studentId;
			this.name = name;
			this.age=age;
			
			
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}
}





public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner를 사용하여 학번, 이름, 나이를 입력받아
		// Student 인스턴스 생성하기
		// getter 메소드로 학번, 이름, 나이를 얻어 학생정보 출력하기
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 입력 : ");
		int studentId = scan.nextInt();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		Student student = new Student(studentId, name, age);
		
		System.out.println("학번 : "+student.getStudentId());
		System.out.println("이름 : "+student.getName());
		System.out.println("나이 : "+student.getAge());
	}

}
