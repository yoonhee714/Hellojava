package com.yedam.bookSearch;

public class Book {

		private int id;
		private String title;
		private String author;
		private int year;
		private String isbn;
		
		//생성자
		public Book() {};
		
		public Book(int id, String title,String library, String author, String isbn) {
			super(); //부모클래스
			this.id = id;
			this.title = title;
			this.author = author;
			this.year = year;
			this.isbn = isbn;
			
		}
		// getter, setter 생성
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getisbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
	
	}


