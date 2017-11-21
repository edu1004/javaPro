package test.com.view;

import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import test.com.model.StudentDAO;
import test.com.model.StudentDAOimpl;
import test.com.model.StudentVO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Std_Insert extends JFrame {
	private JTextField std_name_tf;
	private JTextField birth_tf;
	private JTextField tel_tf;
	private JTextField add_tf;
	private JTextField email_tf;

	public Std_Insert() {
		getContentPane().setLayout(null);// setlayout ���� ����.
		StudentDAO sdao = new StudentDAOimpl();
		JButton insertOK = new JButton("�Է�");
		JLabel std_name_lb = new JLabel("�̸�");
		std_name_lb.setBounds(31, 18, 45, 15);
		getContentPane().add(std_name_lb);

		std_name_tf = new JTextField();
		std_name_tf.setBounds(118, 5, 154, 42);
		getContentPane().add(std_name_tf);
		std_name_tf.setColumns(10);

		JLabel dept_lb = new JLabel("��");
		dept_lb.setBounds(31, 59, 45, 15);
		getContentPane().add(dept_lb);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(118, 53, 154, 27);
		comboBox.setAlignmentY(Component.TOP_ALIGNMENT);
		comboBox.setName("");
		comboBox.addItem("��ǻ�Ͱ��а�");
		comboBox.addItem("������а�");
		comboBox.addItem("�濵�а�");
		getContentPane().add(comboBox);

		JLabel birth_lb = new JLabel("�������");
		birth_lb.setBounds(31, 105, 57, 15);
		getContentPane().add(birth_lb);

		birth_tf = new JTextField();
		birth_tf.setBounds(118, 94, 154, 37);
		getContentPane().add(birth_tf);
		birth_tf.setColumns(10);

		JLabel gender_lb = new JLabel("����");
		gender_lb.setBounds(31, 148, 45, 15);
		getContentPane().add(gender_lb);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(118, 141, 49, 28);
		comboBox_1.addItem("��");
		comboBox_1.addItem("��");
		getContentPane().add(comboBox_1);

		JLabel tel_lb = new JLabel("��ȭ��ȣ");
		tel_lb.setBounds(31, 207, 69, 15);
		getContentPane().add(tel_lb);

		tel_tf = new JTextField();
		tel_tf.setBounds(118, 191, 154, 47);
		getContentPane().add(tel_tf);
		tel_tf.setColumns(10);

		JLabel add_lb = new JLabel("�ּ�");
		add_lb.setBounds(12, 257, 45, 15);
		getContentPane().add(add_lb);

		add_tf = new JTextField();
		add_tf.setBounds(12, 282, 260, 27);
		getContentPane().add(add_tf);
		add_tf.setColumns(10);

		JLabel email_lb = new JLabel("Email");
		email_lb.setBounds(12, 325, 57, 15);
		getContentPane().add(email_lb);

		email_tf = new JTextField();
		email_tf.setBounds(12, 350, 260, 27);
		getContentPane().add(email_tf);
		email_tf.setColumns(10);

		StudentVO svo = new StudentVO();
		insertOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. insert
				String depname = (String) comboBox.getSelectedItem();
				if(depname.equals("��ǻ�Ͱ��а�")) {
					depname = "com";
					svo.setDeptName(depname);
				}else if(depname.equals("������а�")) {
					depname = "arch";
					svo.setDeptName(depname);
				}else if(depname.equals("�濵�а�")) {
					depname = "busi";
					svo.setDeptName(depname);
				}
				
				svo.setStdName(std_name_tf.getText());
				svo.setBirth(birth_tf.getText());
				svo.setGender((String) comboBox_1.getSelectedItem());
				svo.setTel(tel_tf.getText());
				svo.setAddress(add_tf.getText());
				svo.setEmail(email_tf.getText());

				boolean x = true;
				while (x) {
					if (std_name_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "�̸��� �Է��ϼ���.", "�Է� ����", JOptionPane.WARNING_MESSAGE);
						break;
						
					} else if (birth_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "��������� �Է��ϼ���.", "�Է� ����", JOptionPane.WARNING_MESSAGE);
						break;
					} else if (tel_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "����ó�� �Է��ϼ���.", "�Է� ����", JOptionPane.WARNING_MESSAGE);
						break;
					} else if (add_tf.getText().equals("")) {						
						JOptionPane.showMessageDialog(null, "�ּҸ� �Է��ϼ���.", "�Է� ����", JOptionPane.WARNING_MESSAGE);
						break;						
					} else if (email_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "EMail�� �Է��ϼ���.", "�Է� ����", JOptionPane.WARNING_MESSAGE);
						break;
					} else {
						x = false;
						int result = sdao.insertStd(svo);
						if (result == 1) {
							new Std_SelectAll();
							JOptionPane.showMessageDialog(null, "�Է� ����");
							dispose();
							
						} else {
							JOptionPane.showMessageDialog(null, "�Է� ����");
						}
						
					}
					
				} // end while
								

			}
		});
		
		
		insertOK.setBounds(164, 387, 94, 53);
		getContentPane().add(insertOK);

		setTitle("Std_Insert");
		setBounds(new Rectangle(250, 0, 300, 550));
		setResizable(false); // âũ�� ����
		setVisible(true);
		// �׻� settitle->setbounds->setvisible �������.

	}
}
