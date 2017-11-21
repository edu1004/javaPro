package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UpdatePage extends JFrame {
	
	private JButton updateOK = new JButton("UpdateOK");
	private JButton deleteBtn = new JButton("deleteBtn");
	private JLabel num_lb = new JLabel("99");
	private JTextField id_tf = new JTextField("admin");
	private JTextField pw_tf = new JTextField("hi123456");
	private JTextField name_tf = new JTextField("KIM");
	private JTextField tel_tf = new JTextField("010");

	public UpdatePage(String num) {
		System.out.println(num);
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(6, 2));
		con.add(new JLabel("NUM"));
		num_lb.setText(num); 
		con.add(num_lb);
		con.add(new JLabel("ID"));
		con.add(id_tf);
		con.add(new JLabel("PW"));
		con.add(pw_tf);
		con.add(new JLabel("NAME"));
		con.add(name_tf);
		con.add(new JLabel("TEL"));
		con.add(tel_tf);
		con.add(deleteBtn);
		updateOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("UpdateOK");
				String num = num_lb.getText();
				System.out.println(num);
				String id = id_tf.getText();
				System.out.println(id);
				String pw = pw_tf.getText();
				System.out.println(pw);
				String name = name_tf.getText();
				System.out.println(name);
				String tel = tel_tf.getText();
				System.out.println(tel);
				
				new SelectPage();
			}
		});
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("deleteBtn");
				String num = num_lb.getText();
				System.out.println(num);
				new DeletePage(num);
			}
		});
		
		con.add(updateOK);
		
		
		setTitle("Upate Page");
		setBounds(900, 0, 250, 300);
		setVisible(true);
	}

}
