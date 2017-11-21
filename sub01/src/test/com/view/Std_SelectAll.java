package test.com.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;

import test.com.model.StudentDAO;
import test.com.model.StudentDAOimpl;
import test.com.model.StudentVO;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Std_SelectAll extends JFrame {
	StudentDAO dao = new StudentDAOimpl();
	private JTable table_1;

	public Std_SelectAll() {

		Container con = getContentPane();
		List<StudentVO> list = dao.selectAllStd();
		getContentPane().setLayout(null);

		String[] column = new String[] { "학번", "학생이름", "학과정보", "생년월일", "성별", "전화번호", "주소", "e-mail" };
		String[][] datas = new String[list.size()][column.length];
		
		for (int i = 0; i < list.size(); i++) {
			datas[i] = new String[] { String.valueOf(list.get(i).getStdNum()), list.get(i).getStdName(),
					list.get(i).getDeptName(), list.get(i).getBirth(), list.get(i).getGender(), list.get(i).getTel(),
					list.get(i).getAddress(), list.get(i).getEmail() };
		}

		// Table 만들기
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 26, 723, 563);
		getContentPane().add(scrollPane);
		table_1 = new JTable(datas, column);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(70);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(70);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(30);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(80);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(70);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(150);
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 클릭시 학번, 과, 이름을 내보내기
				StudentVO vo = new StudentVO();
				vo.setStdNum(Integer.parseInt(datas[table_1.getSelectedRow()][0]));
				vo.setStdName(datas[table_1.getSelectedRow()][1]);
				vo.setDeptName(datas[table_1.getSelectedRow()][2]);
				vo.setBirth(datas[table_1.getSelectedRow()][3]);
				vo.setGender(datas[table_1.getSelectedRow()][4]);
				vo.setTel(datas[table_1.getSelectedRow()][5]);
				vo.setAddress(datas[table_1.getSelectedRow()][6]);
				vo.setEmail(datas[table_1.getSelectedRow()][7]);

				new Std_SelectOne(vo);
				dispose();
			}
		});

		scrollPane.setViewportView(table_1);

		// 가입 버튼 생성 및 누를 때 이벤트 생성
		JButton insertBtn = new JButton("가입");
		insertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Std_Insert();
				dispose();
			}
		});
		insertBtn.setBounds(420, 601, 150, 40);
		getContentPane().add(insertBtn);

		// 취소 버튼 생성 및 누를 때 이벤트 생성
		JButton cancleBtn = new JButton("취소");
		cancleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancleBtn.setBounds(606, 601, 150, 40);
		getContentPane().add(cancleBtn);

		setBounds(new Rectangle(300, 100, 800, 700));
		setTitle("Std_SelectAll");
		setResizable(false); // 창크기 고정
		setVisible(true);
	}
}
