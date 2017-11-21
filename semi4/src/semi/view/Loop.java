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

public class Loop extends JFrame{
	private JButton forBtn = new JButton("For");
	private JButton whileBtn = new JButton("While");
	private JButton breakBtn = new JButton("Break");
	private JButton continueBtn = new JButton("Continue");
	private JButton close = new JButton("´Ý±â");
	private JButton voidBtn = new JButton("");

	public Loop() {

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

		contentPane.add(forBtn);
		contentPane.add(whileBtn);
		contentPane.add(breakBtn);
		contentPane.add(continueBtn);
		contentPane.add(voidBtn);

		forBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(forBtn.getText());
			}
		});

		whileBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(whileBtn.getText());
			}
		});
		breakBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(breakBtn.getText());
			}
		});
		continueBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(continueBtn.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("Loop");
		setBounds(250, 0, 1000, 110);
		setVisible(true);
	}
}
