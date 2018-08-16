import java.awt.event.*;
import java.awt.*;

public class EventEntry implements ActionListener {
	
	
	
	public void actionPerformed (ActionEvent x)
	{
		Frame add = new Frame();
		GridLayout grid = new GridLayout(6,2);
		CloseEvent close = new CloseEvent(add);
		
		Label lReg, lName, lMark;
		TextField tReg, tName, tMark;
		Button bSend;
		
		lReg = new Label("RegNo:");
		lName = new Label("Name: ");
		lMark = new Label("Mark: ");
		
		tReg = new TextField(20);
		tName = new TextField(20);
		tMark = new TextField(20);
		
		bSend = new Button("Send");
		
		EventSave saving = new EventSave(tReg, tName, tMark);
		
		bSend.addActionListener(saving);
		
		add.setLayout(grid);
		add.add(lReg);
		add.add(tReg);
		add.add(lName);
		add.add(tName);
		add.add(lMark);
		add.add(tMark);
		
		for (int i = 0; i<3; i++)
		{
			Label blank = new Label();
			add.add(blank);
		}
		
		add.add(bSend);
		
		add.addWindowListener(close);
		
		add.setVisible(true);
		add.setSize(350, 200);
	}

}
