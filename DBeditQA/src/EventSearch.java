import java.awt.event.*;
import java.sql.*;
import java.awt.*;

public class EventSearch implements ActionListener{
	
	TextField tRegNo;
	String str;
	
	public EventSearch (TextField regno, String field)
	{
		tRegNo = regno;
		str = field;
	}
	
	public void actionPerformed(ActionEvent x)
	{
		
		try
		{
			int iRegNo = Integer.parseInt(tRegNo.getText());
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection C = DriverManager.getConnection("jdbc:mysql://localhost/QA", "root", "");
			
			Statement S = C.createStatement();	
			
			ResultSet R = S.executeQuery("select * from school where RegNo = " + iRegNo);
			
			if (R.next())
			{
				if (str == "Delete")
				{
					EventDelete.tMark.setText(Integer.toString(R.getInt("Mark")));
					EventDelete.tName.setText(R.getString("Name"));
					EventDelete.P2.setVisible(true);
					EventDelete.delete.pack();
				}
				else if (str == "Update")
				{
					EventUpdate.tMark.setText(Integer.toString(R.getInt("Mark")));
					EventUpdate.tName.setText(R.getString("Name"));
					EventUpdate.P2.setVisible(true);
					EventUpdate.update.pack();					
				}

				
			}
			
			R.close();  
			C.close();
			
		}
		catch (Exception ex)
		{
			System.out.print(ex.toString());
		}
	}

}
