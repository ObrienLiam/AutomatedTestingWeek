import java.awt.event.*;
import java.awt.*;

public class EventX implements ActionListener{
	
	TextField txt;
	
	public EventX (TextField t)
	{
		txt = t;
	}

	public void actionPerformed(ActionEvent x) {
		txt.setText("Hello friend");
	}
}
