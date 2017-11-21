package test.com.view;

import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;

import test.com.model.StudentDAO;
import test.com.model.StudentDAOimpl;
import test.com.model.StudentVO;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Std_SelectOne extends JFrame{
	private JTextField stdName_tf;
	private JTextField birth_tf;
	private JTextField tel_tf;
	private JTextField add_tf;
	private JTextField email_tf;

	public Std_SelectOne(StudentVO vo) {
		getContentPane().setLayout(null);
		
		
		StudentDAO sdao = new StudentDAOimpl(); 
		
		StudentVO svo2 = new StudentVO();
		
		
		
		JLabel stdNum_lb = new JLabel("학번");
		stdNum_lb.setBounds(31, 18, 45, 15);
		getContentPane().add(stdNum_lb);
		
		JLabel stdNum_lb2 = new JLabel("99");
		stdNum_lb2.setText(String.valueOf(vo.getStdNum()));
		stdNum_lb2.setBounds(118, 18, 57, 15);
		getContentPane().add(stdNum_lb2);
		
		JLabel dept_lb = new JLabel("과");
		dept_lb.setBounds(31, 59, 80, 15);
		getContentPane().add(dept_lb);
		
		JLabel dept_lb2 = new JLabel("New label");
		dept_lb2.setText(vo.getDeptName());
		dept_lb2.setBounds(118, 59, 158, 35);
		getContentPane().add(dept_lb2);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(31, 105, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		stdName_tf = new JTextField(vo.getStdName());
		stdName_tf.setBounds(118, 96, 154, 35);
		stdName_tf.setColumns(10);
		getContentPane().add(stdName_tf);
		
		JLabel birth_lb = new JLabel("출생일");
		birth_lb.setBounds(31, 160, 57, 15);
		getContentPane().add(birth_lb);
		
		birth_tf = new JTextField(vo.getBirth());
		birth_tf.setBounds(118, 150, 154, 35);
		getContentPane().add(birth_tf);
		birth_tf.setColumns(10);
		
		JLabel gender_lb = new JLabel("성별");
		gender_lb.setBounds(31, 214, 57, 15);
		getContentPane().add(gender_lb);
		
		JComboBox gender_cb = new JComboBox();
		gender_cb.setBounds(118, 207, 49, 28);
		if(vo.getGender().equals("남")) {
			gender_cb.addItem("남");
			gender_cb.addItem("여");
		}
			
		if(vo.getGender().equals("여")) {
			gender_cb.addItem("여");
			gender_cb.addItem("남");
		}
		
		getContentPane().add(gender_cb);
		
		JLabel tel_lb = new JLabel("전화번호");
		tel_lb.setBounds(31, 261, 57, 15);
		getContentPane().add(tel_lb);
		
		tel_tf = new JTextField(vo.getTel());
		tel_tf.setBounds(118, 251, 154, 35);
		getContentPane().add(tel_tf);
		tel_tf.setColumns(10);
		
		JLabel add_lb = new JLabel("주소");
		add_lb.setBounds(12, 306, 57, 15);
		getContentPane().add(add_lb);
		
		add_tf = new JTextField(vo.getAddress());
		add_tf.setBounds(12, 329, 260, 27);
		getContentPane().add(add_tf);
		add_tf.setColumns(10);
		
		JLabel email_lb = new JLabel("Email");
		email_lb.setBounds(12, 368, 57, 15);
		getContentPane().add(email_lb);
		
		email_tf = new JTextField(vo.getEmail());
		email_tf.setBounds(12, 395, 260, 27);
		getContentPane().add(email_tf);
		email_tf.setColumns(10);
		
		JButton update_btn = new JButton("수정");
		update_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				svo2.setStdNum(vo.getStdNum());
				svo2.setStdName(stdName_tf.getText());
				svo2.setBirth(birth_tf.getText());
				svo2.setGender((String)gender_cb.getSelectedItem());
				svo2.setTel(tel_tf.getText());
				svo2.setAddress(add_tf.getText());
				svo2.setEmail(email_tf.getText());
				
				boolean x = true;
				while (x) {
					if (stdName_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "이름을 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
						break;
						
					} else if (birth_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "출생일을 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
						break;
					} else if (tel_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "연락처를 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
						break;
					} else if (add_tf.getText().equals("")) {						
						JOptionPane.showMessageDialog(null, "주소를 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
						break;						
					} else if (email_tf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "EMail을 입력하세요.", "입력 실패", JOptionPane.WARNING_MESSAGE);
						break;
					} else {
						x = false;
						int result2 = sdao.updateStd(svo2);
						if(result2 >= 1) {
							new Std_Update_Agree(svo2, vo.getStdName());
							dispose();
						} else {
							System.out.println("update failed....");
						}
						

					}
					
				} // end while
				
				
			}
		});
		update_btn.setBounds(10, 435, 78, 67);
		getContentPane().add(update_btn);
		
		JButton delete_btn = new JButton("삭제");
		delete_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				svo2.setStdNum(Integer.parseInt(stdNum_lb2.getText()));
				svo2.setStdName(stdName_tf.getText());
				new Std_Delete_Agree(svo2, vo.getStdName());
				
				dispose();

			}
		});
		delete_btn.setBounds(102, 435, 78, 67);
		getContentPane().add(delete_btn);
		
		JButton cancel_btn = new JButton("취소");
		cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancel_btn.setBounds(194, 435, 78, 67);
		getContentPane().add(cancel_btn);
		
		setTitle("Std_SelectOne");
		setBounds(new Rectangle(250, 0, 300, 550));
		setResizable(false); // 창크기 고정
		setVisible(true);
		
	}
}
