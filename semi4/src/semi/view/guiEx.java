package semi.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class guiEx extends JFrame{
	Container conn = getContentPane();
	
	public static JPanel  conN = new JPanel();
	JPanel conW = new JPanel();
	JPanel conC = new JPanel();
	
	public guiEx(JPanel chapter) {
		
		conn.setLayout(new BorderLayout());
		
		conW = chapter;
		
		conN.setLayout(new CardLayout());
		
		conN.add(new JButton("---"));
		conN.add(new JButton("---"));
		conN.add(new JButton("---"));
		conN.add(new JButton("---"));
		conN.add(new JButton("---"));
		
		conn.add(conN, BorderLayout.NORTH);
		conn.add(conW, BorderLayout.WEST);
		conn.add(conC, BorderLayout.CENTER);
		
		setTitle("United GUI");
		setBounds(0, 0, 1300, 700);
		setVisible(true);
	}

	public static void UpdateGUI(JPanel conn) {
		// TODO Auto-generated method stub
		conN = conn;
		conn.setVisible(false);
		conn.setVisible(true);
	}

}
