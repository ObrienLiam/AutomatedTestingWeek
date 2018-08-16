import java.awt.*;

public class Window {

	public static void main(String[] args) {
		Frame Win = new Frame();
		
		FlowLayout Fl = new FlowLayout();
		
		TextField T1, T2, T3;
		Label L1, L2, L3;
		
		L1 = new Label("No 1: ");
		L2 = new Label("No 2: ");
		L3 = new Label("No 3: ");
		
		T1 = new TextField(10);
		T2 = new TextField(10);
		T3 = new TextField(10);
		
		Button B1, B2, B3, B4;
		
		B1 = new Button("+");
		B2 = new Button("-");
		B3 = new Button("x");
		B4 = new Button("/");
		
		EventAdd E1 = new EventAdd(T1, T2, T3);
		EventSubt E2 = new EventSubt(T1, T2, T3);
		EventMult E3 = new EventMult(T1, T2, T3);
		EventDiv E4 = new EventDiv(T1, T2, T3);
		
		B1.addActionListener(E1);
		B2.addActionListener(E2);
		B3.addActionListener(E3);
		B4.addActionListener(E4);
		
		Win.setLayout(Fl);
		Win.add(L1);
		Win.add(T1);
		Win.add(L2);
		Win.add(T2);
		Win.add(B1);
		Win.add(B2);
		Win.add(B3);
		Win.add(B4);
		Win.add(L3);
		Win.add(T3);
		
		Win.setSize(600, 400);
		Win.setVisible(true);
		
		

		
	}

}
