import java.awt.*;
import java.awt.event.*;

public class EventView implements ActionListener {
	
	static TextField rn1, rn2, rn3, rn4, nm1, nm2, nm3, nm4, mr1, mr2, mr3, mr4;
	static int pointer;
	
	public EventView () 
	{
		pointer = 0;
	}
	
	public void actionPerformed (ActionEvent x)
	{
		Frame view = new Frame();
		
		Panel P1, P2, P3;
		
		P1 = new Panel();
		P2 = new Panel();
		P3 = new Panel();
		
		GridLayout grid1 = new GridLayout(1,3);
		GridLayout grid2 = new GridLayout(4,3);
		
		
		Label lRegno, lName, lMark;
		
		Button bBack, bNext, bRefresh;
		
		lRegno = new Label("RegNo");
		lName = new Label("Name");
		lMark = new Label("Mark");
		
		bBack = new Button("<<");
		bNext = new Button(">>");
		bRefresh = new Button("Refresh");
		
		rn1 = new TextField(5);
		rn2 = new TextField(5);
		rn3 = new TextField(5);
		rn4 = new TextField(5);
		
		nm1 = new TextField(5);
		nm2 = new TextField(5);
		nm3 = new TextField(5);
		nm4 = new TextField(5);
		
		mr1 = new TextField(5);
		mr2 = new TextField(5);
		mr3 = new TextField(5);
		mr4 = new TextField(5);
		
		CloseEvent close = new CloseEvent(view);
		EventRefresh ref = new EventRefresh();
		
		bRefresh.addActionListener(ref);
		bBack.addActionListener(ref);
		bNext.addActionListener(ref);
		
		P1.setLayout(grid1);
		P2.setLayout(grid2);
		P3.setLayout(grid1);
		
		P1.add(lRegno);
		P1.add(lName);
		P1.add(lMark);
		
		P2.add(rn1);
		P2.add(nm1);
		P2.add(mr1);
		P2.add(rn2);
		P2.add(nm2);
		P2.add(mr2);
		P2.add(rn3);
		P2.add(nm3);
		P2.add(mr3);
		P2.add(rn4);
		P2.add(nm4);
		P2.add(mr4);
		
		P3.add(bBack);
		P3.add(bRefresh);
		P3.add(bNext);
		
		view.add(P1,  BorderLayout.NORTH);
		view.add(P2);
		view.add(P3, BorderLayout.SOUTH);
		
		view.setVisible(true);
		view.setSize(300, 300);
		
		view.addWindowListener(close);		
		
	}
}
