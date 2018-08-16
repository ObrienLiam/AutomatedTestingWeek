import java.awt.event.*;
import java.awt.*;

public class EventOp implements ActionListener{
	
	TextField T1, T2, T3;
	Button Bp, Bs, Bm, Bd;
	
	public EventOp (TextField t1, TextField t2, TextField t3, Button b1, Button b2, Button b3, Button b4)
	{
		T1 = t1; T2 = t2; T3 = t3; Bp = b1; Bs = b2; Bm = b3; Bd = b4;
	}
	
	public void actionPerformed(ActionEvent x)
	{
		int No1, No2, No3; Button btn;
		
		No1 = Integer.parseInt(T1.getText());
		No2 = Integer.parseInt(T2.getText());
		
		btn = (Button)x.getSource();
		
		if (btn == Bp)
		{
			No3 = No1 + No2;
			T3.setText(Integer.toString(No3));
		}
		if (btn == Bs)
		{
			No3 = No1 - No2;
			T3.setText(Integer.toString(No3));
		}
		if (btn == Bm)
		{
			No3 = No1 * No2;
			T3.setText(Integer.toString(No3));
		}
		if (btn == Bd)
		{
			No3 = No1 / No2;
			T3.setText(Integer.toString(No3));
		}
	}

}
