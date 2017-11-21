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

public class String1 extends JFrame {
	private JButton string = new JButton("String");
	private JButton concat = new JButton("concat()");
	private JButton charat = new JButton("charAt()");
	private JButton indexof = new JButton("indexOf()");
	private JButton substring = new JButton("subString()");
	private JButton split = new JButton("split()");
	private JButton replace = new JButton("replace()");
	private JButton compareto = new JButton("compareTo()");
	private JButton with = new JButton("startsWtih(),endsWith()");
	private JButton stringb = new JButton("StringBuffer,StringBuilder");
	private JButton close = new JButton("´Ý±â");
	public String1() {

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
		contentPane.setLayout(new GridLayout(2, 5));

		contentPane.add(string);
		contentPane.add(concat);
		contentPane.add(charat);
		contentPane.add(indexof);
		contentPane.add(substring);
		contentPane.add(split);
		contentPane.add(replace);
		contentPane.add(compareto);
		contentPane.add(with);
		contentPane.add(stringb);

		string.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(string.getText());
			}
		});

		concat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(concat.getText());
			}
		});

		charat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(charat.getText());
			}
		});

		indexof.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(indexof.getText());
			}
		});

		substring.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(substring.getText());
			}
		});

		split.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(split.getText());
			}
		});

		replace.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(replace.getText());
			}
		});

		compareto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(compareto.getText());
			}
		});

		with.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(with.getText());
			}
		});

		stringb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(stringb.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("Type");
		setBounds(250, 0, 1000, 130);
		setVisible(true);
	}

}
