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

import test.com.model.StudentDAO;
import test.com.model.StudentDAOimpl;
import test.com.model.StudentVO;

public class Std_Delete_Agree extends JFrame {

	private JPanel contentPane;

	public Std_Delete_Agree(StudentVO vo, String stdName) {
		StudentDAO sdao = new StudentDAOimpl();
		setTitle("Std_Delete_Agree");
		setBounds(100, 100, 500, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("학번 : " + vo.getStdNum() + " 이름 : " + stdName + " 님의 정보를 삭제하시겠습니까?");
		lblNewLabel.setBounds(22, 21, 430, 88);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("취소");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(348, 121, 104, 37);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("삭제");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int falg = sdao.deleteStd(vo);
				
				
				if (falg >= 1) {
					dispose();
					JOptionPane.showMessageDialog(null, "삭제되었습니다.");
					new Std_SelectAll();
				} else {
					System.out.println("실패");
				}
				
			}
		});
		button.setBounds(222, 121, 104, 37);
		contentPane.add(button);
		setResizable(false); // 창크기 고정
		setVisible(true);
	}

}
