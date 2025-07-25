package com.yedam.bookSearch;

import java.util.ArrayList;
import java.util.Scanner;

import com.yedam.bookseach.Book;

public class Main {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		BookDAO dao = new BookDAO();

		System.out.print("아이디를 입력하세요: ");
		String id = scn.nextLine();
		System.out.print("비밀번호를 입력하세요: ");
		String pw = scn.nextLine();
		System.out.println("로그인 완료!");

		while (run) {
			System.out.println("\n<도서 관리 및 검색시스템>");
			System.out.println("====================");
			System.out.println("1.도서목록");
			System.out.println("2.도서등록");
			System.out.println("3.도서수정");
			System.out.println("4.도서삭제");
			System.out.println("====================");
			System.out.println("5.저자");
			System.out.println("6.발행년도");
			System.out.println("7.국제표준도서번호(ISBN)");
			System.out.println("8.종료  ");
			System.out.println("\n선택>>  ");

			int menu = scn.nextInt();
			scn.nextLine();
			ArrayList<Book> list = null;
			int bno;
			int price;
			String title, author;

			switch (menu) {
			case 1: // 도서 제목
				list = dao.findAll("");
				System.out.println("\n·도서번호 제목    저자");
				System.out.println("====================");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(
							list.get(i).getId() + " " + list.get(i).getTitle() + " " + list.get(i).getAuthor());
				}
				break;
			case 2: // 도서 등록,
				System.out.println("도서번호>>");
				bno = scn.nextInt();
				scn.nextLine(); // 1003 엔터; 반환값이 int.
				System.out.println("도서제목>>");
				title = scn.nextLine(); // 반환값이 String
				System.out.println("도서저자>>");
				author = scn.nextLine();
				System.out.println("도서가격>>");
				price = scn.nextInt();
				scn.nextLine(); // 반환값이 int

				Book book = new Book();
				book.setId(bno);
				book.setTitle(title);
				book.setAuthor(author);
				book.setPrice(price);

				if (dao.insert(book)) {
					System.out.println("정상등록");
				} else {
					System.out.println("등록 중 오류");
				}
				break;
			case 3: // 수정
				System.out.println("도서번호>>");
				bno = scn.nextInt();
				scn.nextLine();
				System.out.println("도서가격>>");
				price = scn.nextInt();
				scn.nextLine();

				if (dao.update(bno, price)) {
					System.out.println("정상 수정");
				} else {
					System.out.println("등록 중 오류");
				}
				break;
			case 4: // 삭제
				System.out.print("> 삭제할 도서번호: ");
				bno = scn.nextInt();
				scn.nextLine();

				Book bookname = dao.findById(bno);
				boolean delete = dao.delete(bno);
				if (delete) {
					System.out.println(bno + "번의 '" + bookname.getTitle() + "' 도서가 삭제되었습니다.");
				} else {
					System.out.println("해당하는 책이 없습니다.");
				}
				break;

			case 5:
				System.out.println("저자입력>>   ");
				author = scn.nextLine();
				list = dao.findAll(author);
				System.out.println("====================");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(
							list.get(i).getId() + " " + list.get(i).getTitle() + " " + list.get(i).getAuthor());
				}
				break;
			case 6:
				System.out.println("발행년도>>   ");
				int year = scn.nextInt();
				scn.nextLine();
				list = dao.findAll(year);
				System.out.println("====================");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(
							list.get(i).getId() + " " + list.get(i).getTitle() + " " + list.get(i).getAuthor());

				}
				break;
			case 7:
				System.out.println("ISBN(13자리)>> ");
				String isbn = scn.nextLine();
				break;
			case 8:
				run = false;
				// System.out.println("\n📚 검색 결과 (" + .size() + "건):");
				// if (Book) {
				// System.out.println("검색 조건에 맞는 도서를 찾을 수 없습니다.");
				// } else {
				// for (Book book : results) {
				// book.display();
			}

		}
		System.out.println("end of program.");
	}

}
