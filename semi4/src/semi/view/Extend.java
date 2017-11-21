package semi.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Extend extends JFrame {
	private JButton extends1 = new JButton("extends(상속)");
	private JButton extendscon = new JButton("extends(상속)와 생성자");
	private JButton extendschar = new JButton("extends(상속)의 특징");
	private JButton btn1 = new JButton("접근지정자");
	private JButton void1 = new JButton("");
	private JButton close = new JButton("닫기");

	public Extend() {

		Container conn = getContentPane();
		conn.setLayout(new BorderLayout());

		JPanel connflow = new JPanel();

		connflow.setLayout(new FlowLayout(FlowLayout.LEFT));
		connflow.add(close);
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(1, 5));
		contentPane.add(extends1);
		contentPane.add(extendscon);
		contentPane.add(extendschar);
		contentPane.add(btn1);
		contentPane.add(void1);

		extends1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(extends1.getText());
			}
		});

		extendscon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(extendscon.getText());
			}
		});
		
		extendschar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(extendschar.getText());
			}
		});

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(btn1.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("Extend");
		setBounds(250, 0, 1000, 110);
		setVisible(true);
	}

}
