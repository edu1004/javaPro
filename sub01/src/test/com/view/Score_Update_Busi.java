package test.com.view;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import test.com.model.ScoreDAO;
import test.com.model.ScoreDAOimpl;
import test.com.model.ScoreVO;

public class Score_Update_Busi extends JFrame {

	JLabel num_lb = new JLabel("학번 : ");
	JLabel numEx_lb = new JLabel("");
	JLabel name_lb = new JLabel("이름 : ");
	JLabel nameEx_lb = new JLabel("");
	JLabel business_lb = new JLabel("Business : ");
	JLabel marketing_lb = new JLabel("Marketing : ");
	JLabel toeic_lb = new JLabel("TOEIC : ");
	JTextField business_tf = new JTextField();
	JTextField marketing_tf = new JTextField();
	JTextField toeic_tf = new JTextField();
	JButton update_btn = new JButton("수정");
	JButton cancel_btn = new JButton("취소");

	ScoreVO scovo = new ScoreVO();
	ScoreDAO scodao = new ScoreDAOimpl();

	public Score_Update_Busi(ScoreVO vo) {
		Container con = getContentPane();
		getContentPane().setLayout(null);

		numEx_lb.setText(String.valueOf(vo.getStdNum()));
		nameEx_lb.setText(vo.getStdName());
		business_tf.setText(String.valueOf(vo.getBusiness()));
		marketing_tf.setText(String.valueOf(vo.getMarketing()));
		toeic_tf.setText(String.valueOf(vo.getToeic()));

		num_lb.setBounds(22, 21, 107, 38);
		con.add(num_lb);
		numEx_lb.setBounds(71, 21, 107, 38);
		con.add(numEx_lb);
		name_lb.setBounds(257, 21, 107, 38);
		con.add(name_lb);
		nameEx_lb.setBounds(302, 21, 107, 38);
		con.add(nameEx_lb);
		business_lb.setBounds(22, 80, 107, 38);
		con.add(business_lb);
		business_tf.setBounds(99, 80, 107, 38);
		con.add(business_tf);
		marketing_lb.setBounds(228, 80, 107, 38);
		con.add(marketing_lb);
		marketing_tf.setBounds(305, 80, 107, 38);
		con.add(marketing_tf);
		toeic_lb.setBounds(432, 80, 107, 38);
		con.add(toeic_lb);
		toeic_tf.setBounds(489, 81, 107, 38);
		con.add(toeic_tf);
		update_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					int score_busi = Integer.parseInt(business_tf.getText());
					int score_mark = Integer.parseInt(marketing_tf.getText());
					int score_toeic = Integer.parseInt(toeic_tf.getText());
					boolean x = true;
					String deptname = "";
					if(vo.getDeptName().equals("com")) {
						deptname = "컴퓨터공학과";
						vo.setDeptName(deptname);
					}else if(vo.getDeptName().equals("arch")) {
						deptname = "건축공학과";
						vo.setDeptName(deptname);
					}else if(vo.getDeptName().equals("busi")) {
						deptname = "경영학과";
						vo.setDeptName(deptname);
					}
					while(x) {
						if ( score_busi > 100 || score_busi < 0 || business_tf.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "(Business)0~100 사이의 정수를 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
							setVisible(true);
							break;
						} else if (score_mark > 100 || score_mark < 0 || marketing_tf.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "(Marketing)0~100 사이의 정수를 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
							setVisible(true);
							break;
						} else if (score_toeic > 100 || score_toeic < 0 || toeic_tf.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "(Toeic)0~100 사이의 정수를 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
							setVisible(true);
							break;
						} else {
							scovo.setDeptName(vo.getDeptName());
							scovo.setStdName(nameEx_lb.getText());
							scovo.setStdNum(Integer.parseInt(numEx_lb.getText()));
							scovo.setBusiness(Integer.parseInt(business_tf.getText()));
							scovo.setMarketing(Integer.parseInt(marketing_tf.getText()));
							scovo.setToeic(Integer.parseInt(toeic_tf.getText()));
							new Score_Update_Agree(scovo);
							dispose();
							break;
						}
						
					}
					
				} catch (NumberFormatException e2) {

					JOptionPane.showMessageDialog(null, "정수를 입력하세요.");
				}
				
			}
		});
		update_btn.setBounds(360, 139, 107, 43);
		con.add(update_btn);
		cancel_btn.setBounds(489, 139, 107, 43);
		con.add(cancel_btn);
		cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Score_SelectAll();
			}
		});

		setTitle("Score_Update_Busi");
		setBounds(400, 400, 645, 270);
		setResizable(false); // 창크기 고정
		setVisible(true);
	}
}
