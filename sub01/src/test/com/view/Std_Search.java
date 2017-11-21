package test.com.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import test.com.model.ScoreDAO;
import test.com.model.ScoreDAOimpl;
import test.com.model.ScoreVO;
import test.com.model.StudentDAO;
import test.com.model.StudentDAOimpl;
import test.com.model.StudentVO;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Std_Search extends JFrame {

	private JPanel contentPane;
	private JTextField stdNum_text = new JTextField();
	boolean isnt;

	StudentVO svo = new StudentVO();
	StudentDAO sdao = new StudentDAOimpl();
	ScoreDAO scdao = new ScoreDAOimpl();
	ScoreVO vo = new ScoreVO();

	public Std_Search() {

		setTitle("Std_Search");
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 203);
		Container con = getContentPane();

		con.setLayout(null);
		
		

		// Ȯ�� ��ư ���� �� ����
		JButton btnNewButton = new JButton("Ȯ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ���ڰ� ������ �� ���� ���� ���� ����
				String getNum = stdNum_text.getText();
				char[] gettext = new char[getNum.length()];
				for (int i = 0; i < getNum.length(); i++) {
					gettext[i] = getNum.charAt(i);
				}
				for (int j = 0; j < gettext.length; j++) {
					// �ùٸ� ���ڿ��� ����Ǿ��� �� ����
					if (gettext[j] < 47 | gettext[j] > 58) {
						isnt = false;
						break;
						// DB(VO)���� �а� �Է� ���� �� ���� â ����ϱ�.
					} else /* ���ڿ� �̿��� ������ ��� ���� �� ���� */ {
						isnt = true;
					}
				}
				if (isnt == true) {
					svo.setStdNum(Integer.parseInt(getNum));
					StudentVO svo2 = sdao.selectOneStd(svo);
					// student ���̺��� ��ȣ�� �˻��ؼ� �ִ� �� ���� �� üũ�ϴ� �κ�
					if (svo2.getStdName() != null) {
						vo.setStdNum(Integer.parseInt(getNum));
						ScoreVO voCheck = scdao.selectOneScore(vo);
						
						// score ���̺��� deptname �˻��ؼ� �ִ� �� ���� �� üũ�ϴ� �κ�
						if (voCheck.getDeptName() != null) {
							ScoreVO vo222 = new ScoreVO();
							vo222.setStdNum(Integer.parseInt(getNum));
							ScoreVO voCheck2 = scdao.selectOneScore(vo222);
 
							if (voCheck2.getDeptName().equals("com")) {
								JOptionPane.showMessageDialog(null, "������ ��ϵǾ� �ִ� ȸ���Դϴ�. ����â���� �̵��մϴ�.");
								new Score_Update_Com(voCheck);
							} else if (voCheck2.getDeptName().equals("busi")) {
								JOptionPane.showMessageDialog(null, "������ ��ϵǾ� �ִ� ȸ���Դϴ�. ����â���� �̵��մϴ�.");
								new Score_Update_Busi(voCheck);
							} else if (voCheck2.getDeptName().equals("arch")) {
								JOptionPane.showMessageDialog(null, "������ ��ϵǾ� �ִ� ȸ���Դϴ�. ����â���� �̵��մϴ�.");
								new Score_Update_Arch(voCheck);
							}
							dispose();

						} else {
							StudentVO ivo = new StudentVO();
							ivo.setStdNum(Integer.parseInt(getNum));
							StudentVO voCheck2 = sdao.selectOneStd(ivo);
							if (voCheck2.getDeptName().equals("com")) {
								new Score_Insert_Com(Integer.parseInt(stdNum_text.getText()));
							} else if (voCheck2.getDeptName().equals("busi")) {
								new Score_Insert_Busi(Integer.parseInt(stdNum_text.getText()));
							} else if (voCheck2.getDeptName().equals("arch")) {
								new Score_Insert_Arch(Integer.parseInt(stdNum_text.getText()));
							}
							dispose();
						}
					} else {
						JOptionPane.showMessageDialog(null, "���� �й��Դϴ�.");

					}

				} else {
					JOptionPane.showMessageDialog(null, "���ڴ� �� �� �����ϴ�.");
				}

			}
		});

		btnNewButton.setBounds(73, 96, 97, 23);
		con.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("���");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		btnNewButton_1.setBounds(193, 96, 97, 23);
		con.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("�й� : ");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel.setBounds(74, 34, 80, 34);
		con.add(lblNewLabel);

		stdNum_text.setBounds(131, 36, 167, 34);
		con.add(stdNum_text);
		stdNum_text.setColumns(10);
		setResizable(false); // âũ�� ����
		setVisible(true);
	}
}
