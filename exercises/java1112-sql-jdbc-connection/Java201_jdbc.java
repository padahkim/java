package java1111_jdbc;

import java.sql.Connection;//인터페이스 타입에 마우스 대면 i라고 뜸
import java.sql.DriverManager;
import java.sql.ResultSet;//인터페이스
import java.sql.SQLException;
import java.sql.Statement;//인터페이스

public class Java201_jdbc {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/shopdb?useUnicode=true&serverTimezone=UTC";
		String user = "root";
		String pass = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//드라이버로딩
			conn = DriverManager.getConnection(url, user, pass);//커넥션값을 가져올때
			System.out.println("db접속완료:"+ conn);
			
			stmt = conn.createStatement();//쿼리문을 가져올때
			
			rs = stmt.executeQuery("SELECT * FROM membertbl");//실제 쿼리문 호출
			while(rs.next()) {
				System.out.printf("%s %s %s \n", 
						//rs.getNString(1), rs.getNString(2), rs.getNString(3) 가독성이 별로라 잘안ㅆㅁ
						rs.getNString("memberid"), rs.getNString("memberName"), rs.getNString("memberAddress"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e){
		
		} finally {
			if(rs!=null) 
				try {
					rs.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			if(stmt!=null) 
				try {
					stmt.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			if(conn!=null) 
				try {
					conn.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
		}//fianl
					
	}//main

}//
