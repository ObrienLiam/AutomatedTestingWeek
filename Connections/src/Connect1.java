import java.sql.*;

public class Connect1 {

	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection C = DriverManager.getConnection("jdbc:mysql://localhost/QA", "root", "");
			Statement S = C.createStatement();
			
			S.executeUpdate("insert into school values (140, 'Seb', 150)");			
			
			ResultSet R = S.executeQuery("select * from school");
			
			while (R.next())
			{
				System.out.print(R.getInt("RegNo"));
				System.out.print(","+R.getString("Name"));
				System.out.print(","+R.getInt("Mark"));
				System.out.println();
			}
			S.executeUpdate("commit");
		
		}
		catch(Exception x)
		{
			System.out.print(x.toString());
		}
	}
	
}
