package chap06;

import java.util.Scanner;

public class StudentDao {
	//학생데이터 생성
	//필드
	Scanner sc = new Scanner(System.in);
	//생성자: 기본 생성자 => 컴파일 자동생성
	//메소드
	Student[] stData(int n){
		Student[] students = new Student[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("%d번째 학생 이름>",i+1);
			String name = sc.nextLine();
			
			System.out.printf("%d번째 학생 국어 점수>",i+1);
			int kor = Integer.parseInt(sc.nextLine());
			
			System.out.printf("%d번째 학생 영어 점수>",i+1);
			int eng = Integer.parseInt(sc.nextLine());
			
			System.out.printf("%d번째 학생 수학 점수>",i+1);
			int math = Integer.parseInt(sc.nextLine());
			
			students[i] = new Student(name, kor, eng, math);
		
//				new Student("홍길동", 100,100,100),	
//				new Student("강길동", 90,90,90),
//				new Student("이길동", 100,50,100),
//				new Student("황길동", 100,40,100),
//				new Student("고길동", 70,100,80),
//				new Student("김길동", 90,100,60),	
//				new Student("박길동", 90,80,90),
//				new Student("윤길동", 100,50,70),
//				new Student("장길동", 100,40,78),
//				new Student("정길동", 70,99,100)
		}
		return students;
	}
	
}
