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

public class Jdbc extends JFrame {
	private JButton jdbcBtn = new JButton("Jdbc");
	private JButton voidBtn1 = new JButton("Oracledatabase");
	private JButton voidBtn2 = new JButton("Install");
	private JButton voidBtn3 = new JButton("Jdbcsequence");
	private JButton voidBtn4 = new JButton("Sqlquery");
	private JButton close = new JButton("´Ý±â");
	public Jdbc() {

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

		contentPane.add(jdbcBtn);
		contentPane.add(voidBtn1);
		contentPane.add(voidBtn2);
		contentPane.add(voidBtn3);
		contentPane.add(voidBtn4);

		jdbcBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(jdbcBtn.getText());
			}
		});
		voidBtn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(voidBtn1.getText());
			}
		});
		voidBtn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(voidBtn2.getText());
			}
		});
		voidBtn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(voidBtn3.getText());
			}
		});
		voidBtn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(voidBtn4.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("JDBC");
		setBounds(250, 0, 1000, 110);
		setVisible(true);
	}
}