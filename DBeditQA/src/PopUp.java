import javax.swing.JOptionPane;

public class PopUp {
	
	public static void infoBox(String infoMessage)
	{
		JOptionPane.showMessageDialog(null, infoMessage, null, JOptionPane.INFORMATION_MESSAGE);
	}

}
