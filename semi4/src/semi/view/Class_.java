package semi.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Class_ extends JFrame{
	private JButton classBtn = new JButton("Class");
	private JButton objectBtn = new JButton("Object");
	private JButton consBtn = new JButton("Constructor");
	private JButton methodBtn = new JButton("Method");
	private JButton thisBtn = new JButton("This_super");
	private JButton close = new JButton("´Ý±â");
	
	public Class_() {

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

		contentPane.add(classBtn);
		contentPane.add(objectBtn);
		contentPane.add(consBtn);
		contentPane.add(methodBtn);
		contentPane.add(thisBtn);

		classBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(classBtn.getText());
			}
		});

		objectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(objectBtn.getText());
			}
		});
		consBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(consBtn.getText());
			}
		});
		methodBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(methodBtn.getText());
			}
		});
		thisBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog_.dialog(thisBtn.getText());
			}
		});
		conn.add(contentPane, BorderLayout.CENTER);
		conn.add(connflow, BorderLayout.SOUTH);
		setTitle("Class");
		setBounds(250, 0, 1000, 110);
		setVisible(true);
	}
}
