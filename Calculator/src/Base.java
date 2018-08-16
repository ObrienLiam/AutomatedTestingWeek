
import java.awt.*;

public class Base {

	public static void main(String[] args) {

		Frame Win = new Frame("Calculator");
		
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		
		P2.setLayout(new GridLayout(4,4));
	
		TextField T1;
		Button Ba, Bs, Bm, Bd;
		Button B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, Bpt, Beq;
		Button Bper, Broot, Bsq, Bcl;
		
		T1 = new TextField(50);
		T1.setEnabled(false);
		
		Ba = new Button("+");
		Bs = new Button("-");
		Bm = new Button("x");
		Bd = new Button("/");
		
		Bper = new Button("%");
		Broot = new Button("^1/2");
		Bsq = new Button("^2");
		Bcl = new Button("AC");
		
		B0 = new Button("0");
		B1 = new Button("1");
		B2 = new Button("2");
		B3 = new Button("3");
		B4 = new Button("4");
		B5 = new Button("5");
		B6 = new Button("6");
		B7 = new Button("7");
		B8 = new Button("8");
		B9 = new Button("9");
		Bpt = new Button(".");
		Beq = new Button("=");
		
		EventOp3 E = new EventOp3(T1);
		EventAdd1 E2 = new EventAdd1(T1);
		
		Ba.addActionListener(E);
		Bs.addActionListener(E);
		Bm.addActionListener(E);
		Bd.addActionListener(E);
		
		B0.addActionListener(E2);
		B1.addActionListener(E2);
		B2.addActionListener(E2);
		B3.addActionListener(E2);
		B4.addActionListener(E2);
		B5.addActionListener(E2);
		B6.addActionListener(E2);
		B7.addActionListener(E2);
		B8.addActionListener(E2);
		B9.addActionListener(E2);
		Bpt.addActionListener(E2);
		
		Beq.addActionListener(E);	
		Bper.addActionListener(E);
		Broot.addActionListener(E);
		Bsq.addActionListener(E);
		Bcl.addActionListener(E);
		
		
		P1.add(T1);		

		P2.add(B7);
		P2.add(B8);
		P2.add(B9);
		P2.add(Bd);
		//P2.add(Bper);
		
		P2.add(B4);
		P2.add(B5);
		P2.add(B6);		
		P2.add(Bm);		
		//P2.add(Bsq);
		
		P2.add(B1);
		P2.add(B2);
		P2.add(B3);
		P2.add(Bs);
		//P2.add(Broot);
		
		P2.add(Bpt);
		P2.add(B0);
		P2.add(Beq);
		P2.add(Ba);
		//P2.add(Bcl);
		
		
		Win.add(P1, BorderLayout.NORTH);
		Win.add(P2);
		Win.setSize(400, 400);
		Win.setVisible(true);
		

	}

}
