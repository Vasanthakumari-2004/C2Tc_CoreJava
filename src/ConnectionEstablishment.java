import java.sql.*;
public class ConnectionEstablishment {

	public static Connection conn() throws Exception 
	{
		//Establish Connection
		String url="jdbc:mysql://localhost:3306/employee_details";
		String username="root";
		String password="22222";
		Connection cc=DriverManager.getConnection(url,username,password);
		return cc;
	}
	}


