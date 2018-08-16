import java.awt.*;
import java.awt.event.*;

public class CloseEvent extends WindowAdapter{
	
	Frame frame;
	
	public CloseEvent(Frame sent)
	{
		frame=sent;
	}

	public void windowClosing(WindowEvent windowevent)
	{
		frame.setVisible(false);
		frame.dispose();
	}
}
