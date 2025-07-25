package com.yedam.vo;

public class Book {

	private int id;
	private String title;
	private String author;
	private int price;
	public char[] showBrief;
	public char[] showDetail;
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// 부모클래스(object)의 toString()자식이 물려받음.
	// 부모클래스의 메소드를 자식 클래스에서 재정의하는 =>override.
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public String toStr() {
		return "id: " + id + ", title:" + title + ", author:" + author + ", price:" + price;
	}
	public String showBrief() {
		return " " + id + " " + title + " " + price;
	}
	public String showDetail() {
		//도서ID :2001 제목 : 토지
		//저자 : 박경리 가격: 15000원
		String formatStr = "도서ID: " + id + "  제목: " + title;
		formatStr += "\n저자:   " + author + " 가격: " + price + "원"; 
		return formatStr;
		
	}
	
	
	
	
	
	
}
