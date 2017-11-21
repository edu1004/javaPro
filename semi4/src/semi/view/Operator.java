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

public class Operator extends JFrame {
	private JButton operator = new JButton("Operator");
	private JButton Btn1 = new JButton("���");
	private JButton Btn2 = new JButton("����");
	private JButton Btn3 = new JButton("��Ʈ");
	private JButton Btn4 = new JButton("��");
	private JButton Btn5 = new JButton("��");
	private JButton Btn6 = new JButton("����");
	private JButton Btn7 = new JButton("����Ʈ");
	private JButton Btn8 = new JButton("����");
	private JButton void1 = new JButton("");
	private JButton close = new JButton("�ݱ�");

	public Operator() {

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

		contentPane.add(operator);
		contentPane.add(Btn1);
		contentPane.add(Btn2);
		contentPane.add(Btn3);
		contentPane.add(Btn4);
		contentPane.add(Btn5);
		contentPane.add(Btn6);
		contentPane.add(Btn7);
		contentPane.add(Btn8);
		contentPane.add(void1);

		operator.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(operator.getText());
			}
		});

		Btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(Btn1.getText());
			}
		});

		Btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(Btn2.getText());
			}
		});

		Btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(Btn3.getText());
			}
		});

		Btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(Btn4.getText());
			}
		});

		Btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(Btn5.getText());
			}
		});

		Btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(Btn6.getText());
			}
		});

		Btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(Btn7.getText());
			}
		});

		Btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(Btn8.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("Type");
		setBounds(250, 0, 1000, 130);
		setVisible(true);
	}

}
