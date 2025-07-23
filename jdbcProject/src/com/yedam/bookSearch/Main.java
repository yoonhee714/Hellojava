package com.yedam.bookSearch;

import java.util.ArrayList;
import java.util.Scanner;

import com.yedam.app.Book;
import com.yedam.app.BookDAO;

public class Main {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		BookDAO dao = new BookDAO();
		
		System.out.print("아이디를 입력하세요: ");
        String id = scn.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        String pw = scn.nextLine();
        System.out.println("로그인 완료! 검색을 시작합니다.\n");
        
		while (run) {
			System.out.println("<도서 통합 자료 검색 시스템>");
			System.out.println("1.도서제목");
			System.out.println("2.구내도서관검색");
			System.out.println("3.저자");
			System.out.println("4.발행년도");
			System.out.println("5.주제로검색");
			System.out.println("6.국제표준도서번호(ISBN)");
			System.out.println("선택>>  ");
		
			int menu = scn.nextInt();
			switch (menu) {
			case 1: // 도서 제목
				ArrayList<Book> list = dao.findAll();
				System.out.println("도서제목");
				System.out.println("====================");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getTitle());
				}
				break;
			case 2: // 구내도서관 검색
				ArrayList<Book> list1 = dao.findAll();
				System.out.println("구내도서관");
				System.out.println("====================");
				for (int i = 0; i < list1.size(); i++) {
					System.out.println(list1.get(i).getLibrary());
				}
				break;
			case 3: 	
				System.out.println("저자입력>>");
	
				

			}
		}
	}

}
