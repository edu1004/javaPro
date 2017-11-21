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

public class Branch extends JFrame {
	private JButton if1 = new JButton("If");
	private JButton switch1 = new JButton("Switch");
	private JButton close = new JButton("´Ý±â");
	private JButton void1 = new JButton("");
	private JButton void2 = new JButton("");
	private JButton void3 = new JButton("");

	public Branch() {

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
		contentPane.setLayout(new GridLayout(1, 5));

		contentPane.add(if1);
		contentPane.add(switch1);
		contentPane.add(void1);
		contentPane.add(void2);
		contentPane.add(void3);

		if1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(if1.getText());
			}
		});

		switch1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(switch1.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("ºÐ±â¹®");
		setBounds(250, 0, 1000, 110);
		setVisible(true);
	}

}
