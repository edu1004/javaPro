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
		
		JLabel lblNewLabel = new JLabel("학번 : " + vo.getStdNum() + " 이름 : " + vo.getStdName() + " 님의 성적 정보를 수정하시겠습니까?");
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
		
		JButton button = new JButton("수정");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int falg = dao.updateScore(vo);
				
				
				if (falg >= 1) {
					
					JOptionPane.showMessageDialog(null, "수정되었습니다.");
					dispose();
					new Score_SelectAll();
					
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
