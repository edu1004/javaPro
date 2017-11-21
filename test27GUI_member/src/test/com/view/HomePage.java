package test.com.view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HomePage extends JFrame {
	private JButton insertBtn = new JButton("회원가입");
	private JButton selectBtn = new JButton("회원목록");
	
	
	public HomePage() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 1));
		
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("insertBtn");
				new InsertPage();
			}
		});
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("selectBtn");
				new SelectPage();
			}
		});
		
		con.add(insertBtn);
		con.add(selectBtn);
		
		setTitle("Home Page");
		setBounds(0, 0, 250, 300);
		setVisible(true);
	}

}
