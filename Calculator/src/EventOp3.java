import java.awt.event.*;
import java.awt.*;
import static java.lang.Math.sqrt;

public class EventOp3 implements ActionListener {
	
	TextField T1;

	static String oper = null, val="0";
	static boolean error = false;

	public EventOp3 (TextField t1)
	{
		T1 = t1;
		
	}
	public void actionPerformed (ActionEvent x)
	{
		float No1, No2, No3, count;
		Button btn;
		String lop;
		
		count = (T1.getText()).length() - (T1.getText()).replace(".", "").length();
				
		if (count > 1 || error == true)
		{
			T1.setText("Error");
			error = true;
			No1 = 0;
			No2 = 0;
		}
		else 
		{
		No1 = Float.parseFloat(val);
		No2 = Float.parseFloat(T1.getText());			
		}		
		
		btn = (Button) x.getSource();
		lop = btn.getLabel();	
		
		
		if (No1 != 0 & error==false)
		{
			
			switch (oper)
			{
			case "+" :
				No3 = (float) No1 + No2;
				break;
			case "-" :
				No3 = (float) No1 - No2;
				break;
			case "x" :
				No3 = (float) No1 * No2;
				break;
			case "/" :
				if (No2 == 0)
					{
					T1.setText("Error");
					No3 = 0;
					}
				else No3 = (float) No1 / No2;
				break;
			case "%" :
				No3 = (float) No2 * 100;
				break;
			case "^1/2" : 
				No3 = (float) Math.sqrt(No2);
				break;
			case "^2" : 
				No3 = (float) No2 * No2;
				break;
			case "AC" :
				
			default:
				No3 = No1;
				T1.setText("");
			}
			
			if (lop != "=")	T1.setText("");			
			else T1.setText(Float.toString(No3));
			
			val = Float.toString(No3);
		}
		

		if (No1==0 & error==false)
		{
			val = T1.getText();
			T1.setText("");
		}
		oper = lop;
		if (oper == "AC")
		{
			val = "0";
			oper = null;
			T1.setText("");
		}
		
		
		
	}
}
