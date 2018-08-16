import java.awt.event.*;
import java.awt.*;

public class EventAdd1 implements ActionListener {
	
	TextField T1;
	
	public EventAdd1 (TextField t1) 
	{
		T1 = t1;
	}

	public void actionPerformed (ActionEvent x)
	{
		Button btn;
		String dig, curr;
		
		btn = (Button) x.getSource();
		dig = btn.getLabel();
		curr = T1.getText();
		
		T1.setText(curr+dig);
		
	}
}
