import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class EventSave implements ActionListener{
	
	TextField T1, T2, T3;
	int RegNo, Mark;
	String Name;
	
	public EventSave (TextField reg, TextField name, TextField mark) 
	{
		T1 = reg;
		T2 = name;
		T3 = mark;
	}
	
	public void actionPerformed (ActionEvent x)
	{
		Button btn;
		String str;
		
		btn = (Button) x.getSource();
		str = btn.getLabel();
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection C = DriverManager.getConnection("jdbc:mysql://localhost/QA", "root", "");
			
			Statement S = C.createStatement();
			
			RegNo = Integer.parseInt(T1.getText());
			Mark = Integer.parseInt(T3.getText());
			Name = T2.getText();
			
		
			if (str == "Send")
			{
				S.executeUpdate("insert into school values ("+RegNo+",'"+Name+"',"+Mark+" )");
				PopUp.infoBox("Save Successful");
				
			}
			else if (str == "Delete")
			{
				S.executeUpdate("delete from school where RegNo = " + RegNo);
				PopUp.infoBox("Delete Successful");
			}
			else if (str == "Update")4
			{u                                                                                                                                                                
				
				S.executeUpdate("update school set name = '"+Name+"', mark="+Mark+" where RegNo="+RegNo);
				PopUp.infoBox("Update Successful");
			}
			
			S.executeQuery("commit");
			
			C.close();	
			
			
		}
		
			
		catch (Exception ex)
		{
			System.out.print(ex.toString());
		}	
				
	}

}
