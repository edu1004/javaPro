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

public class Polymorphism_ extends JFrame {
	private JButton polyBtn = new JButton("Polymorphism");
	private JButton voidBtn1 = new JButton("");
	private JButton voidBtn2 = new JButton("");
	private JButton voidBtn3 = new JButton("");
	private JButton voidBtn4 = new JButton("");
	private JButton close = new JButton("´Ý±â");
	
	public Polymorphism_() {

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

		contentPane.add(polyBtn);
		contentPane.add(voidBtn1);
		contentPane.add(voidBtn2);
		contentPane.add(voidBtn3);
		contentPane.add(voidBtn4);

		polyBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(polyBtn.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("Polymorphism");
		setBounds(250, 0, 1000, 110);
		setVisible(true);
	}
}