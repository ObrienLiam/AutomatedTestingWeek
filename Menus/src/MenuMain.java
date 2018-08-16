import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame F = new JFrame("Hello");
		
		JPanel P1 = new JPanel();
		
		//JButton btn = new JButton("Button");
		JTextField T1, T2, T3;
		JLabel L1, L2, L3;
		
		L1 = new JLabel("No1:");
		L2 = new JLabel("No2:");
		L3 = new JLabel("Result:");
		
		T1 = new JTextField(5);
		T2 = new JTextField(5);
		T3 = new JTextField(5);
		
		
		P1.setLayout(new GridLayout(1,6));
		
//		P1.add(btn);
		P1.add(L1);
		P1.add(T1);
		P1.add(L2);
		P1.add(T2);
		P1.add(L3);
		P1.add(T3);
		
		JMenuBar Bar = new JMenuBar();
		JMenu menu1 = new JMenu("Operation 1");
		JMenu menu2 = new JMenu("Operation 2");
		JMenuItem m1 = new JMenuItem("Addition");
		JMenuItem m2 = new JMenuItem("Subtraction");
		JMenuItem m3 = new JMenuItem("Multiplication");
		JMenuItem m4 = new JMenuItem("Division");
		
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x)
			{
				int f1, f2, tot;
				f1 = Integer.parseInt(T1.getText());
				f2 = Integer.parseInt(T2.getText());
				tot = f1 + f2;
				T3.setText(Integer.toString(tot));
			}
		});
		
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x)
			{
				int f1, f2, tot;
				f1 = Integer.parseInt(T1.getText());
				f2 = Integer.parseInt(T2.getText());
				tot = f1 - f2;
				T3.setText(Integer.toString(tot));
			}
		});
		
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x)
			{
				int f1, f2, tot;
				f1 = Integer.parseInt(T1.getText());
				f2 = Integer.parseInt(T2.getText());
				tot = f1 * f2;
				T3.setText(Integer.toString(tot));
			}
		});
		
		m4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x)
			{
				int f1, f2, tot;
				f1 = Integer.parseInt(T1.getText());
				f2 = Integer.parseInt(T2.getText());
				tot = f1 / f2;
				T3.setText(Integer.toString(tot));
			}
		});
		
		menu1.add(m1);
		menu1.add(m2);
		menu2.add(m3);
		menu2.add(m4);
		
		Bar.add(menu1);
		Bar.add(menu2);
		
		F.setJMenuBar(Bar);
		
		F.add(P1);
		
		F.setVisible(true);
		F.setSize(400, 100);
	}

}
