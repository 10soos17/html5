package study19_dbLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginSVC {
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
			Connection conn = DriverManager.getConnection(url, "javalink", "javalink");
			System.out.println("Connection Success!");
		} catch (SQLException e) {
			System.out.println("주소및 id,pw가 다릅니다.");
		}
	}
	
	public User login(String id, String passwd) {
		User user=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			String sql="SELECT * FORM member WHERE id='"+id+"' AND" + 
						"passwd = '" + passwd + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println(rs);
			
			if(rs != null) {
				user = new User(rs.getString(1),rs.getString(2),rs.getString("name"),
						rs.getInt("age"),rs.getString(5),rs.getString(6));
				
				System.out.println("아이디 : "+rs.getString(1)+
						           ",비밀번호 : "+rs.getString(2)+
						           ",이름: "+rs.getString("name")+
						           ",나이: "+rs.getString("age")+
						           ",주소: "+rs.getString(5)+
						           ",이메일: "+rs.getString(6)
						);
				
			}
			
		}catch(SQLException se) {

		}
		finally {
			try {
				
			}catch(Exception e) {
				
			}
		}
		return user;
	}

}
