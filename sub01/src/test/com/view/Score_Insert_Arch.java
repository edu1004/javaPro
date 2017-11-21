package test.com.view;

import java.awt.Container;
import java.awt.Font;

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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Score_Insert_Arch extends JFrame {

	JLabel num_lb = new JLabel("학번 : ");
	JLabel numEx_lb = new JLabel();
	JLabel name_lb = new JLabel("이름 : ");
	JLabel nameEx_lb = new JLabel();
	JLabel architecture_lb = new JLabel("Architecture : ");
	JLabel design_lb = new JLabel("Design : ");
	JLabel toeic_lb = new JLabel("TOEIC : ");
	JTextField architecture_tf = new JTextField();
	JTextField design_tf = new JTextField();
	JTextField toeic_tf = new JTextField();
	JButton update_btn = new JButton("입력");
	JButton cancel_btn = new JButton("취소");

	public Score_Insert_Arch(int stdNum) {
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
		architecture_lb.setBounds(22, 80, 107, 38);
		con.add(architecture_lb);
		architecture_tf.setBounds(119, 81, 107, 38);
		con.add(architecture_tf);
		design_lb.setBounds(244, 80, 107, 38);
		con.add(design_lb);
		design_tf.setBounds(302, 81, 107, 38);
		con.add(design_tf);
		toeic_lb.setBounds(417, 80, 107, 38);
		con.add(toeic_lb);
		toeic_tf.setBounds(489, 81, 107, 38);
		con.add(toeic_tf);

		ScoreVO scorevo = new ScoreVO();
		ScoreDAO scoredao = new ScoreDAOimpl();

		update_btn.addActionListener(new ActionListener() {
			int flag = 0;
			
			//음수, 100넘는 값 검사를 위한 변수들

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					int score_arch = Integer.parseInt(architecture_tf.getText());
					int score_des = Integer.parseInt(design_tf.getText());
					int score_toeic = Integer.parseInt(toeic_tf.getText());
					if ( score_arch > 100 || score_arch < 0 || architecture_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "(Architecture)0~100 사이의 정수를 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
					} else if (score_des > 100 || score_des < 0 || design_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "(Design)0~100 사이의 정수를 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
					} else if (score_toeic > 100 || score_toeic < 0 || toeic_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "(Toeic)0~100 사이의 정수를 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
					} else {
						scorevo.setStdNum(stdNum);
						scorevo.setStdName(nameEx_lb.getText());
						scorevo.setDeptName(vo.getDeptName());
						scorevo.setArchitecture(Integer.parseInt(architecture_tf.getText()));
						scorevo.setDesign(Integer.parseInt(design_tf.getText()));
						scorevo.setToeic(Integer.parseInt(toeic_tf.getText()));
						flag = scoredao.insertScore(scorevo);
						
					}
					
				} catch (NumberFormatException e2) {

					JOptionPane.showMessageDialog(null, "정수를 입력하세요.");

				}
				if (flag == 1) {
					dispose();
					JOptionPane.showMessageDialog(null, "등록되었습니다.");
					new Score_SelectAll();
					
				} else {
					System.out.println("scoreinsertArch실패");
				}
			}
		});
		update_btn.setBounds(360, 139, 107, 43);
		con.add(update_btn);
		
		cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		cancel_btn.setBounds(489, 139, 107, 43);
		con.add(cancel_btn);

		setTitle("Score_Insert_Arch");
		setBounds(400, 400, 645, 270);
		setResizable(false);
		setVisible(true);
	}

}
