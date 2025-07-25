package com.yedam.bookSearch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.yedam.app.Book;
import com.yedam.app.DBUtil;

//// 조회, 등록, 수정, 삭제
//public class BookDAO {
//	//숙제: 삭제(delete), 단건조회(findById) 작성해보기
//	
//	
//	// 수정. 매개값(int bno, int price), 반환값(boolean)
//	public boolean update(int bno, int price) {
//		Connection conn = DBUtil.getConnect();
//		String query = "update book"//
//				+ "  set price=?" //
//				+ "  where id=?";		
//		
//		try {
//			PreparedStatement stmt = conn.prepareStatement(query);
//			stmt.setInt(1, price);//? 첫번째에 값을 지정
//			stmt.setInt(2, bno);
//			
//			int r = stmt.executeUpdate(); //실행된 쿼리의 결과 count반환
//			if (r > 0) {//한건 입력되면
//				 return true;
//			}
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return false;
//	} //end of update.
//		
//		
//		
//	// 등록. 매개값(Book), 반환값(boolean)
//	public boolean insert(Book book) {
//		Connection conn = DBUtil.getConnect();
//		String query = "insert into book (id, title, author, year, isbn)"//
//				+ "values(?,?,?,?)";		
//		System.out.println(query);
//		try {
//			PreparedStatement stmt = conn.prepareStatement(query);
//			stmt.setInt(1, book.getId());
//			stmt.setString(2, book.getTitle());
//			stmt.setString(3, book.getAuthor());
//			//stmt.setInt(4, book.getYear());
//		
//			
//			int r = stmt.executeUpdate(query); //실행된 쿼리의 결과 count
//			if (r > 0) {//한건 입력되면
//				return true;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		
//		return false;
//		
//		public Book findById(int bno) {
//			Connection conn = DBUtil.getConnect();
//			String query = "select id,title,author,price " + "     from book " + "     where id = ?";
//
//			try {
//				PreparedStatement stmt = conn.prepareStatement(query);
//				stmt.setInt(1, bno);
//
//				ResultSet rs = stmt.executeQuery();
//				if (rs.next()) {
//					Book book = new Book();
//					book.setId(rs.getInt("id"));
//					book.setTitle(rs.getString("title"));
//					book.setAuthor(rs.getString("author"));
//					book.setPrice(rs.getInt("price"));
//					return book;
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			return null;
//
//		}
//
//		public boolean delete(int bno) {
//			Connection conn = DBUtil.getConnect(); // DB연결
//			String query = "delete from book " + "     where id = ?"; // SQL 쿼리
//			try {
//				PreparedStatement stmt = conn.prepareStatement(query); // PreparedStatement로 ?에 값넣
//				stmt.setInt(1, bno);
//
//				int r = stmt.executeUpdate(); // 실행
//				if (r > 0) { // r>0이면 true, 아니면 false
//					return true;
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//			return false;
//		}
//
//
//
//		
//	}
//	// 목록조회(多건)
//	public ArrayList<Book> findAll(String author) {
//		Connection conn = DBUtil.getConnect();
//		ArrayList<Book> list = new ArrayList<Book>(); // 컬렉션(Book)
//		String query = "select * from book where author = nvl(?, author) ";
//		try {
//			PreparedStatement stmt = conn.prepareStatement(query);
//			stmt.setString(1, author);
//
//			ResultSet rs = stmt.executeQuery();
//			// 반복
//			while (rs.next()) {
//				Book book = new Book();
//				book.setId(rs.getInt("id"));// id -> id 필드에 할당
//				book.setTitle(rs.getString("title")); // title -> title 필드
//				book.setAuthor(rs.getString("author"));
//				//book.setYear(rs.getInt("year"));
//				book.setPrice(rs.getInt("price"));
//				// 컬렉션에 추가
//				list.add(book);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list;
//	} // end of findAll().
//
//	public ArrayList<Book> findAll(int price) {
//		Connection conn = DBUtil.getConnect();
//		ArrayList<Book> list = new ArrayList<Book>(); // 컬렉션(Book)
//		String query = "select * from book where year = ? ";
//		try {
//			PreparedStatement stmt = conn.prepareStatement(query);
//			stmt.setInt(1, price);
//
//			ResultSet rs = stmt.executeQuery();
//			// 반복
//			while (rs.next()) {
//				Book book = new Book();
//				book.setId(rs.getInt("id"));// id -> id 필드에 할당
//				book.setTitle(rs.getString("title")); // title -> title 필드
//				book.setAuthor(rs.getString("author"));
//				//book.setYear(rs.getInt("Year"));
//				book.setPrice(rs.getInt("price"));
//				// 컬렉션에 추가
//				list.add(book);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list;
//	} // end of findAll().




//}







public class BookDAO {

	// 수정
	public boolean update(int bno, int price) {
		Connection conn = DBUtil.getConnect();
		String query = "update book set price=? where id=?";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, price);
			stmt.setInt(2, bno);
			int r = stmt.executeUpdate();
			return r > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// 등록
	public boolean insert(Book book) {
		Connection conn = DBUtil.getConnect();
		String query = "insert into book (id, title, author, price) values (?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, book.getId());
			stmt.setString(2, book.getTitle());
			stmt.setString(3, book.getAuthor());
			stmt.setInt(4, book.getPrice()); // 주의: year는 없음
			int r = stmt.executeUpdate();
			return r > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// 단건 조회
	public Book findById(int bno) {
		Connection conn = DBUtil.getConnect();
		String query = "select id, title, author, price from book where id = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, bno);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getInt("price"));
				return book;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 삭제
	public boolean delete(int bno) {
		Connection conn = DBUtil.getConnect();
		String query = "delete from book where id = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, bno);
			int r = stmt.executeUpdate();
			return r > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// 전체 조회 - 작가
	public ArrayList<Book> findAll(String author) {
		Connection conn = DBUtil.getConnect();
		ArrayList<Book> list = new ArrayList<>();
		String query = "select * from book where author = nvl(?, author)"+
		           " order by id";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, author);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getInt("price"));
				list.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 전체 조회 - 연도
	public ArrayList<Book> findAll(int year) {
		Connection conn = DBUtil.getConnect();
		ArrayList<Book> list = new ArrayList<>();
		String query = "select * from book where year = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, year);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				//book.setYear(rs.getInt("year")); // 주석 풀기 (Book에 필드 있어야 함)
				book.setPrice(rs.getInt("price"));
				list.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}





