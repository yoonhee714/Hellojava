package com.yedam.app;

public class Book {
	private int id;
	private String title;
	private String author;
	private String library;
	private int price;
	//생성자
	public Book() {};
	
	public Book(int id, String title, String author,String library, String isbn, int price) {
		super(); //부모클래스
		this.id = id;
		this.title = title;
		this.author = author;
		this.library = library;
		this.price = price;
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
	public String getLibrary() {
		return library;
	}
	public void setLibrary(String library) {
		this.library = library;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
