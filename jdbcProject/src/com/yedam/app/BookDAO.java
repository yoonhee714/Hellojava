package com.yedam.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// 조회, 등록, 수정, 삭제
public class BookDAO {
	// 숙제: 삭제(delete), 단건조회(findById) 작성해보기

	// 수정. 매개값(int bno, int price), 반환값(boolean)
	public boolean update(int bno, int price) {
		Connection conn = DBUtil.getConnect();
		String query = "update book"//
				+ "  set price=?" //
				+ "  where id=?";

		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, price);// ? 첫번째에 값을 지정
			stmt.setInt(2, bno);

			int r = stmt.executeUpdate(); // 실행된 쿼리의 결과 count반환
			if (r > 0) {// 한건 입력되면
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	} // end of update.

	// 등록. 매개값(Book), 반환값(boolean)
	public boolean insert(Book book) {
		Connection conn = DBUtil.getConnect();
		String query = "insert into book (id, title,library, isbn, author, price)"//
				+ "values(?,?,?,?)";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, book.getId());
			stmt.setString(2, book.getTitle());
			stmt.setString(3, book.getLibrary());
			stmt.setString(4, book.getAuthor());
			stmt.setInt(5, book.getPrice());
			int r = stmt.executeUpdate(query); // 실행된 쿼리의 결과 count
			if (r > 0) {// 한건 입력되면
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	// 목록조회(多건)
	public ArrayList<Book> findAll(int year) {
		Connection conn = DBUtil.getConnect();
		ArrayList<Book> list = new ArrayList<Book>(); // 컬렉션(Book)
		String query = "select * from book where year = ? ";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select*from book");
			// 반복
			while(rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));//id -> id 필드에 할당
				book.setTitle(rs.getString("title")); //title -> title 필드
				book.setLibrary(rs.getString("library")); 
				book.setAuthor(rs.getString("author"));
				//book.setYear(rs.getString("year"));
				//book.setSubject(rs.getInt("subject"));
				//컬렉션에 추가
				list.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	} //end of findAll().
}



	