import java.awt.*;

public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame main = new Frame();
		GridLayout Grid = new GridLayout(9,3);
		
		Button Bent, Bview, Bedit, Bdel;
		
		Bent = new Button("Entry");
		Bview = new Button("View");
		Bedit = new Button("Edit");
		Bdel = new Button("Delete");
		
		EventEntry ent = new EventEntry();
		EventDelete del = new EventDelete();
		EventView view = new EventView();
		EventUpdate upd = new EventUpdate();
		
		Bent.addActionListener(ent);
		Bdel.addActionListener(del);
		Bview.addActionListener(view);
		Bedit.addActionListener(upd);
		
		main.setLayout(Grid);
		for (int i = 0; i < 4; i ++)
		{
			Label blanklabel = new Label();
			main.add(blanklabel);
		}
		main.add(Bent);
		for (int i = 0; i < 5; i ++)
		{
			Label blanklabel = new Label();
			main.add(blanklabel);
		}
		main.add(Bview);
		for (int i = 0; i < 5; i ++)
		{
			Label blanklabel = new Label();
			main.add(blanklabel);
		}
		main.add(Bedit);
		for (int i = 0; i < 5; i ++)
		{
			Label blanklabel = new Label();
			main.add(blanklabel);
		}
		main.add(Bdel);
		for (int i = 0; i < 4; i ++)
		{
			Label blanklabel = new Label();
			main.add(blanklabel);
		}
		
		CloseEvent close = new CloseEvent(main);
		main.addWindowListener(close);
		
		main.setVisible(true);
		main.setSize(400, 600);
		
		
		
		
	}

}
