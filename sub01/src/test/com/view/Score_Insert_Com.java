package test.com.view;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import test.com.model.ScoreDAO;
import test.com.model.ScoreDAOimpl;
import test.com.model.ScoreVO;
import test.com.model.StudentDAO;
import test.com.model.StudentDAOimpl;
import test.com.model.StudentVO;

public class Score_Insert_Com extends JFrame {

	JLabel num_lb = new JLabel("학번 : ");
	JLabel numEx_lb = new JLabel();
	JLabel name_lb = new JLabel("이름 : ");
	JLabel nameEx_lb = new JLabel();
	JLabel java_lb = new JLabel("Java : ");
	JLabel c_lb = new JLabel("C : ");
	JLabel toeic_lb = new JLabel("TOEIC : ");
	JTextField java_tf = new JTextField();
	JTextField c_tf = new JTextField();
	JTextField toeic_tf = new JTextField();
	JButton update_btn = new JButton("입력");
	JButton cancel_btn = new JButton("취소");

	public Score_Insert_Com(int stdNum) {
		Container con = getContentPane();
		getContentPane().setLayout(null);
		StudentDAO sdao = new StudentDAOimpl();
		StudentVO svo = new StudentVO();
		svo.setStdNum(stdNum);
		StudentVO vo = sdao.selectOneStd(svo);
		numEx_lb = new JLabel(String.valueOf(vo.getStdNum()));
		nameEx_lb = new JLabel(vo.getStdName());

		num_lb.setBounds(22, 21, 107, 38);
		con.add(num_lb);
		numEx_lb.setBounds(71, 21, 107, 38);
		con.add(numEx_lb);
		name_lb.setBounds(257, 21, 107, 38);
		con.add(name_lb);
		nameEx_lb.setBounds(302, 21, 107, 38);
		con.add(nameEx_lb);
		java_lb.setBounds(22, 80, 107, 38);
		con.add(java_lb);
		java_tf.setBounds(71, 80, 107, 38);
		con.add(java_tf);
		c_lb.setBounds(221, 80, 107, 38);
		con.add(c_lb);
		c_tf.setBounds(257, 81, 107, 38);
		con.add(c_tf);
		toeic_lb.setBounds(396, 80, 107, 38);
		con.add(toeic_lb);
		toeic_tf.setBounds(454, 81, 107, 38);
		con.add(toeic_tf);
		update_btn.setBounds(360, 139, 107, 43);

		ScoreVO scorevo = new ScoreVO();
		ScoreDAO scoredao = new ScoreDAOimpl();

		update_btn.addActionListener(new ActionListener() {
			int flag = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int score_Java = Integer.parseInt(java_tf.getText());
					int score_C = Integer.parseInt(c_tf.getText());
					int score_toeic = Integer.parseInt(toeic_tf.getText());
					if ( score_Java > 100 || score_Java < 0 || java_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "(Java)0~100 사이의 정수를 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
					} else if (score_C > 100 || score_C < 0 || c_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "(C)0~100 사이의 정수를 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
					} else if (score_toeic > 100 || score_toeic < 0 || toeic_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "(Toeic)0~100 사이의 정수를 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
					} else {
						scorevo.setStdNum(stdNum);
						scorevo.setStdName(nameEx_lb.getText());
						scorevo.setDeptName(vo.getDeptName());
						scorevo.setJava(Integer.parseInt(java_tf.getText()));
						scorevo.setC(Integer.parseInt(c_tf.getText()));
						scorevo.setToeic(Integer.parseInt(toeic_tf.getText()));
						flag = scoredao.insertScore(scorevo);
						
					}
					if (flag == 1) {
						dispose();
						JOptionPane.showMessageDialog(null, "등록되었습니다.");
						new Score_SelectAll();
					} else {
						System.out.println("scoreinsertCom실패");
					}
					
				} catch (NumberFormatException e2) {

					JOptionPane.showMessageDialog(null, "정수를 입력하세요.");

				}
			}
		});
		con.add(update_btn);
		cancel_btn.setBounds(489, 139, 107, 43);
		cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		con.add(cancel_btn);

		setTitle("Score_Insert_Com");
		setBounds(400, 400, 645, 270);
		setResizable(false);
		setVisible(true);
	}
}
