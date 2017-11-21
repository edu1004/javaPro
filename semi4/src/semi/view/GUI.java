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

public class GUI extends JFrame {
	private JButton gui = new JButton("GUI");
	private JButton awt = new JButton("AWT");
	private JButton swing = new JButton("Swing");
	private JButton swingframe = new JButton("Swing프레임만들기");
	private JButton container = new JButton("컨테이너&배치");
	private JButton jbtn = new JButton("JButton");
	private JButton jradiobtn = new JButton("JRadioButton");
	private JButton jbtngroup = new JButton("JButtonGroup");
	private JButton jlabel = new JButton("JLabel");
	private JButton jtf = new JButton("JTextField");
	private JButton jtable = new JButton("JTable");
	private JButton jcheck = new JButton("JCheckBox");
	private JButton void1 = new JButton("");
	private JButton void2 = new JButton("");
	private JButton void3 = new JButton("");
	private JButton close = new JButton("닫기");
	public GUI() {

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
		contentPane.setLayout(new GridLayout(3, 5));

		contentPane.add(gui);
		contentPane.add(awt);
		contentPane.add(swing);
		contentPane.add(swingframe);
		contentPane.add(container);
		contentPane.add(jbtn);
		contentPane.add(jradiobtn);
		contentPane.add(jbtngroup);
		contentPane.add(jlabel);
		contentPane.add(jtf);
		contentPane.add(jtable);
		contentPane.add(jcheck);
		contentPane.add(void1);
		contentPane.add(void2);
		contentPane.add(void3);

		gui.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(gui.getText());
			}
		});

		awt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(awt.getText());
			}
		});

		swing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(swing.getText());
			}
		});

		swingframe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(swingframe.getText());
			}
		});

		container.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(container.getText());
			}
		});

		jbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(jbtn.getText());
			}
		});

		jradiobtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(jradiobtn.getText());
			}
		});

		jbtngroup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(jbtngroup.getText());
			}
		});

		jlabel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(jlabel.getText());
			}
		});

		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(jtf.getText());
			}
		});

		jtable.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(jtable.getText());
			}
		});

		jcheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(jcheck.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("Type");
		setBounds(250, 0, 1000, 160);
		setVisible(true);
	}

}
