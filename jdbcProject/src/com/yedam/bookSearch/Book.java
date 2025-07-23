package com.yedam.bookSearch;

public class Book {

		private int id;
		private String title;
		private String library;
		private String author;
		private int year;
		private int subject;
		private String isbn;
		
		//생성자
		public Book() {};
		
		public Book(int id, String title,String library, String author, String isbn) {
			super(); //부모클래스
			this.id = id;
			this.title = title;
			this.library = library;
			this.author = author;
			this.year = year;
			this.subject = subject;
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
		public String getLibrary() {
			return library;
		}
		public void setLibrary(String library) {
			this.library = library;
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
		public int getSubject() {
			return subject;
		}
		public void setSubject(int subject) {
			this.subject = subject;
		}
		public String getisbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
	
	}


