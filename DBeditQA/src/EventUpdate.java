import java.awt.*;
import java.awt.event.*;

public class EventUpdate implements ActionListener
{	
	static Panel P2 = new Panel();
	static TextField tName, tMark;
	static Frame update;

	public void actionPerformed(ActionEvent x)
	{
		update = new Frame();
		
		GridLayout grid1 = new GridLayout(1,3);
		GridLayout grid2 = new GridLayout(3,3);
		
		CloseEvent close = new CloseEvent(update);
		
		Panel P1 = new Panel();
		
		Label lRegNo, lName, lMark;
		TextField tRegNo;
		Button bSearch, bUpdate;
		
		lRegNo = new Label("RegNo:");
		lName = new Label("Name:");
		lMark = new Label("Mark:");
		
		tRegNo = new TextField(10);
		tName = new TextField(10);
		tMark = new TextField(10);
		
		bSearch = new Button("...");
		bUpdate = new Button("Update");
		
		EventSearch search = new EventSearch(tRegNo, "Update");
		EventSave up = new EventSave(tRegNo, tName, tMark);
		
		bSearch.addActionListener(search);
		bUpdate.addActionListener(up);
		
		P1.setLayout(grid1);
		P2.setLayout(grid2);
		
		P1.add(lRegNo);
		P1.add(tRegNo);
		P1.add(bSearch);
		
		P2.add(lName);
		P2.add(tName);
		P2.add(new Label());
		P2.add(lMark);
		P2.add(tMark);
		P2.add(new Label());
		P2.add(new Label());
		P2.add(new Label());
		P2.add(bUpdate);
		
		
		update.add(P1, BorderLayout.NORTH);
		update.add(P2);
		
		P2.setVisible(false);
		
		update.setVisible(true);
		update.setSize(300, 150);
		
		update.addWindowListener(close);
		
		
	}
}
