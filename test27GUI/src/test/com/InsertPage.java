package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InsertPage extends JFrame {

	private JButton insertOK = new JButton("InsertOK");
	private JTextField id_tf = new JTextField("admin");
	private JTextField pw_tf = new JTextField("hi123456");
	private JTextField name_tf = new JTextField("KIM");
	private JTextField tel_tf = new JTextField("010");
	
	
	public InsertPage() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(5, 2));
		con.add(new JLabel("ID"));
		con.add(id_tf);
		con.add(new JLabel("PW"));
		con.add(pw_tf);
		con.add(new JLabel("NAME"));
		con.add(name_tf);
		con.add(new JLabel("TEL"));
		con.add(tel_tf);
		con.add(new JLabel(""));
		
		insertOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("insertOK");
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
		
		con.add(insertOK);
		
		
		
		
		setTitle("Inser Page");
		setBounds(250, 0, 250, 300);
		setVisible(true);
	}
	
}
