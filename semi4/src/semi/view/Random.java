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

public class Random extends JFrame {
	private JButton random = new JButton("Random");
	private JButton void1 = new JButton("");
	private JButton void2 = new JButton("");
	private JButton void3 = new JButton("");
	private JButton void4 = new JButton("");
	private JButton close = new JButton("�ݱ�");
	public Random() {

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

		contentPane.add(random);
		contentPane.add(void1);
		contentPane.add(void2);
		contentPane.add(void3);
		contentPane.add(void4);

		random.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(random.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("Random");
		setBounds(250, 0, 1000, 110);
		setVisible(true);
	}

}
