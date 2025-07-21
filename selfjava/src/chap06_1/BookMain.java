package chap06_1;

import java.util.Scanner;

public class BookMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;	
		int booksu = 0;
		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.도서수 입력 2.도서정보 등록 3.도서정보 전체조회 4.도서정보 분석 5.종료");
			System.out.println("-----------------------------------------------------------");
			
			System.out.print("선택 >");
			int selNum = Integer.parseInt(sc.nextLine());
			
			switch(selNum) {
			case 1:
				System.out.println("도서 수>");
				booksu =Integer.parseInt(sc.nextLine());
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				run = false;
			}
			
		
			
					
			
			
	}//end while
	System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
					
		
	}//end main
		
		
}//end class
