package test.com.view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DeletePage extends JFrame {

	private JLabel num_lb = new JLabel("99");
	private JButton deleteOK = new JButton("deleteOK");

	public DeletePage(String num) {
		System.out.println(num);
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 2));
		num_lb.setText(num); 
		con.add(num_lb);
		con.add(new JLabel("번 회원삭제?"));
		con.add(new JLabel(""));
		
		deleteOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("deleteOK"+num_lb.getText());
				new SelectPage();
			}
		});
		
		con.add(deleteOK);
		
		
		setTitle("Delete Page");
		setBounds(0, 300, 250, 100);
		setVisible(true);
		
	}
}
