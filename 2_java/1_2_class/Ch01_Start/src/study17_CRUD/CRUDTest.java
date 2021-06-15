package study17_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Create/Read/Update/Delete
public class CRUDTest {

	Connection conn;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6_g.jar가 해당 위치에 없습니다.");
		}
	}

	public void connect() {
		try {

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(url, "java", "java");
			System.out.println("Connection Success!");
		} catch (SQLException e) {
			System.out.println("주소및 id,pw가 다릅니다.");
		}

	}
	
	public void insert() {
		Statement stmt=null;
		try {
			stmt = conn.createStatement();
			String sql = "insert into member1 values('aaa','aaa','홍길동',22,'서울시','a@a.com')";
		    int count = stmt.executeUpdate(sql);
		    if(count > 0)
		    	System.out.println("insert success!");
		    else
		    	System.out.println("insert fail!");
		} catch (SQLException e1) {
			System.out.println("insert fail!");
		}
		
		try {
			
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			
		}
	}
	public void select() {
		Statement stmt=null;
		ResultSet rs=null;
		try {
			stmt = conn.createStatement();
			String sql ="select * from member1";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("아이디 : "+rs.getString(1)+
						           ",비밀번호 : "+rs.getString(2)+
						           ",이름: "+rs.getString("name")+
						           ",나이: "+rs.getString("age")+
						           ",주소: "+rs.getString(5)+
						           ",이메일: "+rs.getString(6)
						);
			}
		} catch (SQLException e) {
			
		}finally {
			try {
			
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				
			}
		}
		
	}
	public void update() {
		Statement stmt=null;
		try {
			stmt = conn.createStatement();
			String sql = "update member1 set addr='부산시' where id='aaa'";
		    int count = stmt.executeUpdate(sql);
		    if(count > 0)
		    	System.out.println("update success!");
		    else
		    	System.out.println("update fail!");
		} catch (SQLException e1) {
			System.out.println("update fail!");
		}
		
		try {
			
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			
		}
	}
	public void delete() {
		Statement stmt=null;
		try {
			stmt = conn.createStatement();
			String sql = "delete member1 where id='aaa'";
		    int count = stmt.executeUpdate(sql);
		    if(count > 0)
		    	System.out.println("delete success!");
		    else
		    	System.out.println("delete fail!");
		} catch (SQLException e1) {
			System.out.println("delete fail!");
		}
		
		try {
			
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			
		}
	}

	public static void main(String[] args) {
		CRUDTest ct = new CRUDTest();
		ct.connect();

		ct.insert();
		ct.connect();
		ct.select();
		System.out.println("================");
		ct.connect();
		ct.update();
		ct.connect();
		ct.select();
		System.out.println("================");
		ct.connect();
		ct.delete();
		ct.connect();
		ct.select();
		System.out.println("================");

	}

}
