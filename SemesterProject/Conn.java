
import java.sql.*;

public class Conn{
	    
	public Connection c;
	public Statement s;
	 
	public Conn(){
	       try{
	          Class.forName("com.mysql.jdbc.Driver");
              c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","");
	          s = c.createStatement();
	        }
	       catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	 


