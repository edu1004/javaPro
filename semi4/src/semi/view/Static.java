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

public class Static extends JFrame {
	private JButton static1 = new JButton("static");
	private JButton staticm = new JButton("static ����� ���");
	private JButton void2 = new JButton("");
	private JButton void3 = new JButton("");
	private JButton void4 = new JButton("");
	private JButton close = new JButton("�ݱ�");
	public Static() {

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

		contentPane.add(static1);
		contentPane.add(staticm);
		contentPane.add(void2);
		contentPane.add(void3);
		contentPane.add(void4);

		static1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(static1.getText());
			}
		});

		staticm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(staticm.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("Type");
		setBounds(250, 0, 1000, 110);
		setVisible(true);
	}

}
