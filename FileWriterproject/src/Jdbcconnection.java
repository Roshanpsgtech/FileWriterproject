import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.Which DB used//
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.connection url 
		Connection cn = DriverManager.getConnection("jdbc:mysql://root@localhost/testing");
		//3.Connection Statement 
		Statement stt = cn.createStatement();
		
		//4.ResultSet
		ResultSet result = stt.executeQuery("Select * from table");
		
		while(result.next())
		{
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
			
		}
		

	}

}
