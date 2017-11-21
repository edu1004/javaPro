package test.com.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame{
	public Home() {
		
		setBounds(200,200,700,400);
		setTitle("Home");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD559\uC0DD\uAD00\uB9AC \uBC0F \uC131\uC801\uCC98\uB9AC \uD504\uB85C\uADF8\uB7A8");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setBounds(165, 21, 345, 57);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("학생 입력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Std_Insert();
			}
		});
		btnNewButton.setBounds(110, 100, 160, 67);
		panel.add(btnNewButton);
		
		JButton button = new JButton("성적 입력");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Std_Search();
			}
		});
		button.setBounds(401, 100, 160, 67);
		panel.add(button);
		
		JButton button_1 = new JButton("학생 목록");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Std_SelectAll();
			}
		});
		button_1.setBounds(110, 188, 160, 67);
		panel.add(button_1);
		
		JButton button_2 = new JButton("성적 목록");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Score_SelectAll();
			}
		});
		button_2.setBounds(401, 188, 160, 67);
		
		panel.add(button_2);
		
		JButton btnNewButton_1 = new JButton("종료");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(547, 271, 105, 37);
		panel.add(btnNewButton_1);
		setResizable(false);
		setVisible(true);
	}
}
