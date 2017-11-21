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

public class Inner extends JFrame{
	private JButton innerBtn = new JButton("Inner");
	private JButton memberBtn = new JButton("Member");
	private JButton localBtn = new JButton("Local");
	private JButton staticBtn = new JButton("Static_inner");
	private JButton anonymousBtn = new JButton("Anonymous");
	private JButton close = new JButton("´Ý±â");
	
	public Inner() {

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

		contentPane.add(innerBtn);
		contentPane.add(memberBtn);
		contentPane.add(localBtn);
		contentPane.add(staticBtn);
		contentPane.add(anonymousBtn);

		innerBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(innerBtn.getText());
			}
		});

		memberBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(memberBtn.getText());
			}
		});
		localBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(localBtn.getText());
			}
		});
		staticBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(staticBtn.getText());
			}
		});
		anonymousBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(anonymousBtn.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("Inner Class");
		setBounds(250, 0, 1000, 110);
		setVisible(true);
	}
}
