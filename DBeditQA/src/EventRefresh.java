import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class EventRefresh implements ActionListener {

	int pt;
	
	public void actionPerformed (ActionEvent x)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection C = DriverManager.getConnection("jdbc:mysql://localhost/QA", "root", "");
			
			Statement S = C.createStatement();
			
			int check = 0;
			
			
			
			ResultSet R = S.executeQuery("select * from school");
			
			Button btn;
			String res;
			
			btn = (Button) x.getSource();
			res = btn.getLabel();
			
			if (res == "<<")
			{
				EventView.pointer = EventView.pointer - 4;
			}
			else if (res == ">>")
			{
				EventView.pointer = EventView.pointer + 4;
			}
			
			for (int i = 0; i < EventView.pointer ; i++ )
			{
				R.next();
			}
			

			if (R.next())
			{
				EventView.rn1.setText(Integer.toString(R.getInt("RegNo")));
				EventView.nm1.setText(R.getString("Name"));
				EventView.mr1.setText(Integer.toString(R.getInt("Mark")));
				check = 1;
			}
			
			if (R.next())
			{
				EventView.rn2.setText(Integer.toString(R.getInt("RegNo")));
				EventView.nm2.setText(R.getString("Name"));
				EventView.mr2.setText(Integer.toString(R.getInt("Mark")));
			}

			if (R.next())
			{
				EventView.rn3.setText(Integer.toString(R.getInt("RegNo")));
				EventView.nm3.setText(R.getString("Name"));
				EventView.mr3.setText(Integer.toString(R.getInt("Mark")));				
			}

			if (R.next())
			{
				EventView.rn4.setText(Integer.toString(R.getInt("RegNo")));
				EventView.nm4.setText(R.getString("Name"));
				EventView.mr4.setText(Integer.toString(R.getInt("Mark")));				
			}
			
			if (check == 0)
			{
				EventView.pointer = EventView.pointer - 4;
			}
			


		}
		catch (Exception ex)
		{
			System.out.print(ex.toString());
		}
	}
}
