import java.awt.*;
import java.awt.event.*;

public class EventDelete implements ActionListener
{	
	static Panel P2 = new Panel();
	static TextField tName, tMark;
	static Frame delete;

	public void actionPerformed(ActionEvent x)
	{
		delete = new Frame();
		
		GridLayout grid1 = new GridLayout(1,3);
		GridLayout grid2 = new GridLayout(3,3);
		
		CloseEvent close = new CloseEvent(delete);
		
		Panel P1 = new Panel();
		
		Label lRegNo, lName, lMark;
		TextField tRegNo;
		Button bSearch, bDelete;
		
		lRegNo = new Label("RegNo:");
		lName = new Label("Name:");
		lMark = new Label("Mark:");
		
		tRegNo = new TextField(10);
		tName = new TextField(10);
		tMark = new TextField(10);
		
		bSearch = new Button("...");
		bDelete = new Button("Delete");
		
		EventSearch search = new EventSearch(tRegNo, "Delete");
		EventSave del = new EventSave(tRegNo, tName, tMark);
		
		bSearch.addActionListener(search);
		bDelete.addActionListener(del);
		
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
		P2.add(bDelete);
		
		
		delete.add(P1, BorderLayout.NORTH);
		delete.add(P2);
		
		P2.setVisible(false);
		
		delete.setVisible(true);
		delete.setSize(300, 150);
		
		delete.addWindowListener(close);
		
		
	}
}
