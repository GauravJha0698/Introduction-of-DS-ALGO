import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class JdbcConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Connection con=null;
	int i=0;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","gaurav0698");
	PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?)");
	ps.setInt(1,2);
	ps.setString(2, "watches");
	ps.setInt(3, 2500);
	i=ps.executeUpdate();
	if(i>0)
	{
		System.out.println("Registered Successfully");
	}
	else
	{
		System.out.println("Data not found!!");
	}
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
