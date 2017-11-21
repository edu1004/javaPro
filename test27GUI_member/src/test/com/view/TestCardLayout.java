package test.com.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestCardLayout extends JFrame {
	
	CardLayout cards = new CardLayout(0, 0);
	JPanel panel = new JPanel();
	public TestCardLayout() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(700, 0, 500, 400);
		
		
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(cards);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "AbsXXX");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		panel_2.add(chckbxNewCheckBox);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, "OpeXXX");
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_3.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_3.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(panel_1, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cards.show(panel, "AbsXXX");
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cards.show(panel, "OpeXXX");
			}
		});
		panel_1.add(btnNewButton_1);
		setVisible(true);
	}


}
