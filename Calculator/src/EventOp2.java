import java.awt.event.*;
import java.awt.*;

public class EventOp2 implements ActionListener {
	
	TextField T1, T2, T3;
	
	public EventOp2 (TextField t1, TextField t2, TextField t3)
	{
		T1 = t1; T2 = t2; T3 = t3;
	}
	
	public void actionPerformed (ActionEvent x)
	{
		int No1, No2, No3;
		Button btn;
		String comp;
		
		No1 = Integer.parseInt(T1.getText());
		No2 = Integer.parseInt(T2.getText());
		
		btn = (Button) x.getSource();
		comp = btn.getLabel();
		
		switch (comp)
		{
		case "+" :
			No3 = No1 + No2;
			T3.setText(Integer.toString(No3));
			break;
		case "-" :
			No3 = No1 - No2;
			T3.setText(Integer.toString(No3));
			break;
		case "x" :
			No3 = No1 * No2;
			T3.setText(Integer.toString(No3));
			break;
		case "/" :
			No3 = No1 / No2;
			T3.setText(Integer.toString(No3));
			break;
		default:
			T3.setText("Error");
		}
		
	}

}
