package semi.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LanguagePage extends JFrame {
	private JButton java = new JButton("JAVA");
	private JButton jsp = new JButton("");
	private JButton data = new JButton("");
	private JButton close = new JButton("´Ý±â");
	public LanguagePage() {
		Container conn = getContentPane();
		conn.setLayout(new BorderLayout());
		JPanel north = new JPanel();
		north.setLayout(new FlowLayout(FlowLayout.LEFT));
		north.add(close);
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		JPanel south = new JPanel();
		south.setLayout(new FlowLayout());
		south.add(new JLabel(""));
		JPanel east = new JPanel();
		east.setLayout(new FlowLayout());
		east.add(new JLabel(""));
		JPanel west = new JPanel();
		west.setLayout(new FlowLayout());
		west.add(new JLabel(""));
		
		JPanel con = new JPanel();
		con.setLayout(new GridLayout(3, 1));

		con.add(java);
		con.add(jsp);
		con.add(data);
		java.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ChapterPage();
			}
		});

		jsp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		data.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		conn.add(north, BorderLayout.NORTH);
		conn.add(south, BorderLayout.SOUTH);
		conn.add(east, BorderLayout.EAST);
		conn.add(west, BorderLayout.WEST);
		conn.add(con, BorderLayout.CENTER);
		setTitle("Languages");
		setBounds(0, 0, 250, 400);
		setVisible(true);
	}
}
