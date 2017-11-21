package test.com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import test.com.model.ScoreDAO;
import test.com.model.ScoreDAOimpl;
import test.com.model.ScoreVO;

public class Score_Update_Agree extends JFrame {

	private JPanel contentPane;

	public Score_Update_Agree(ScoreVO vo) {
		ScoreDAO dao = new ScoreDAOimpl();
		setTitle("Score_Update_Agree");
		setBounds(100, 100, 500, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("�й� : " + vo.getStdNum() + " �̸� : " + vo.getStdName() + " ���� ���� ������ �����Ͻðڽ��ϱ�?");
		lblNewLabel.setBounds(22, 21, 430, 88);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("���");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(348, 121, 104, 37);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("����");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int falg = dao.updateScore(vo);
				
				
				if (falg >= 1) {
					
					JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.");
					dispose();
					new Score_SelectAll();
					
				} else {
					System.out.println("����");
				}
			}
		});
		button.setBounds(222, 121, 104, 37);
		contentPane.add(button);
		setResizable(false); // âũ�� ����
		setVisible(true);
	}

}
