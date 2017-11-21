package test.com.view;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import test.com.model.ScoreDAO;
import test.com.model.ScoreDAOimpl;
import test.com.model.ScoreVO;

public class Score_SelectAll extends JFrame {
	private JTable table;
	
	
	public Score_SelectAll() {
		
		ScoreVO scovo = new ScoreVO();
		ScoreDAO scodao = new ScoreDAOimpl();
		List<ScoreVO> list = scodao.selectAllScore();
		
		String[] colNames = new String[] { "학번", "학색이름", "학과", "Business", "Marketing", "Architecture", "Design", "Java", "C", "TOEIC", "평균","등급","랭킹"};
		String[][] datas = new String[list.size()][colNames.length];
		
		for (int i = 0; i < list.size(); i++) {
			List<ScoreVO> listRank = scodao.scoreRank(list.get(i).getStdNum());
			datas[i] = new String[] {
					
					String.valueOf(list.get(i).getStdNum()),
					list.get(i).getStdName(),
					list.get(i).getDeptName(),
					String.valueOf(list.get(i).getBusiness()),
					String.valueOf(list.get(i).getMarketing()),
					String.valueOf(list.get(i).getArchitecture()),
					String.valueOf(list.get(i).getDesign()),
					String.valueOf(list.get(i).getJava()),
					String.valueOf(list.get(i).getC()),
					String.valueOf(list.get(i).getToeic()),
					String.valueOf(list.get(i).getAvg()),
					String.valueOf(list.get(i).getGrade()),
					String.valueOf(listRank.get(i).getRank())
					};
		}
	
		setTitle("Score_SelectAll");
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 25, 1100, 521);
		getContentPane().add(scrollPane);
		
		table = new JTable(datas, colNames);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String deptname = datas[table.getSelectedRow()][2];
				if (deptname.equals("컴퓨터공학과")) {
					
					scovo.setStdNum(Integer.parseInt(datas[table.getSelectedRow()][0]));
					scovo.setStdName(datas[table.getSelectedRow()][1]);
					scovo.setDeptName(datas[table.getSelectedRow()][2]);
					scovo.setBusiness(Integer.parseInt(datas[table.getSelectedRow()][3]));
					scovo.setMarketing(Integer.parseInt(datas[table.getSelectedRow()][4]));
					scovo.setArchitecture(Integer.parseInt(datas[table.getSelectedRow()][5]));
					scovo.setDesign(Integer.parseInt(datas[table.getSelectedRow()][6]));
					scovo.setJava(Integer.parseInt(datas[table.getSelectedRow()][7]));
					scovo.setC(Integer.parseInt(datas[table.getSelectedRow()][8]));
					scovo.setToeic(Integer.parseInt(datas[table.getSelectedRow()][9]));
					scovo.setAvg(Double.parseDouble(datas[table.getSelectedRow()][10]));
					scovo.setGrade(datas[table.getSelectedRow()][11]);
					scovo.setRank(Integer.parseInt(datas[table.getSelectedRow()][12]));
					
					new Score_Update_Com(scovo);
					dispose();
				} else if (deptname.equals("경영학과")) {
					
					scovo.setStdNum(Integer.parseInt(datas[table.getSelectedRow()][0]));
					scovo.setStdName(datas[table.getSelectedRow()][1]);
					scovo.setDeptName(datas[table.getSelectedRow()][2]);
					scovo.setBusiness(Integer.parseInt(datas[table.getSelectedRow()][3]));
					scovo.setMarketing(Integer.parseInt(datas[table.getSelectedRow()][4]));
					scovo.setArchitecture(Integer.parseInt(datas[table.getSelectedRow()][5]));
					scovo.setDesign(Integer.parseInt(datas[table.getSelectedRow()][6]));
					scovo.setJava(Integer.parseInt(datas[table.getSelectedRow()][7]));
					scovo.setC(Integer.parseInt(datas[table.getSelectedRow()][8]));
					scovo.setToeic(Integer.parseInt(datas[table.getSelectedRow()][9]));
					scovo.setAvg(Double.parseDouble(datas[table.getSelectedRow()][10]));
					scovo.setGrade(datas[table.getSelectedRow()][11]);
					scovo.setRank(Integer.parseInt(datas[table.getSelectedRow()][12]));
					
					new Score_Update_Busi(scovo);
					dispose();
				} else if (deptname.equals("건축공학과")) {
					
					scovo.setStdNum(Integer.parseInt(datas[table.getSelectedRow()][0]));
					scovo.setStdName(datas[table.getSelectedRow()][1]);
					scovo.setDeptName(datas[table.getSelectedRow()][2]);
					scovo.setBusiness(Integer.parseInt(datas[table.getSelectedRow()][3]));
					scovo.setMarketing(Integer.parseInt(datas[table.getSelectedRow()][4]));
					scovo.setArchitecture(Integer.parseInt(datas[table.getSelectedRow()][5]));
					scovo.setDesign(Integer.parseInt(datas[table.getSelectedRow()][6]));
					scovo.setJava(Integer.parseInt(datas[table.getSelectedRow()][7]));
					scovo.setC(Integer.parseInt(datas[table.getSelectedRow()][8]));
					scovo.setToeic(Integer.parseInt(datas[table.getSelectedRow()][9]));
					scovo.setAvg(Double.parseDouble(datas[table.getSelectedRow()][10]));
					scovo.setGrade(datas[table.getSelectedRow()][11]);
					scovo.setRank(Integer.parseInt(datas[table.getSelectedRow()][12]));
					
					new Score_Update_Arch(scovo);
					dispose();
				}
				
			}
		});
		scrollPane.setViewportView(table);
		
		JButton insertScoreBtn = new JButton("성적입력");
		insertScoreBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Std_Search();
				dispose();
			}
		});
		insertScoreBtn.setBounds(455, 578, 105, 27);
		getContentPane().add(insertScoreBtn);
		
		JButton cancleBtn = new JButton("취소");
		cancleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancleBtn.setBounds(597, 578, 105, 27);
		getContentPane().add(cancleBtn);
		
		setBounds(new Rectangle(0, 0, 1200, 700));
		setResizable(false); // 창크기 고정
		setVisible(true);
		
	}
}
