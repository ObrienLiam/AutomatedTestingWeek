import java.awt.*;
import java.awt.event.*;

public class CloseEventMain extends WindowAdapter{
	
	Frame frame;
	
	public CloseEventMain(Frame sent)
	{
		frame=sent;
	}

	public void windowClosing(WindowEvent windowevent)
	{
		frame.setVisible(false);
		frame.dispose();
	}
}
