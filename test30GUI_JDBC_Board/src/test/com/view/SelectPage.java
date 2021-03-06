package test.com.view;

import java.awt.Rectangle;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.com.model.BoardDAO;
import test.com.model.BoardDAOimpl;
import test.com.model.BoardVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class SelectPage extends JFrame {
	private JTable table;
	
	public SelectPage() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		BoardDAO dao = new BoardDAOimpl();
		
		List<BoardVO> list = dao.selectAll();
		System.out.println(list.size());
		final String[][] datas = new String[list.size()][5];
		for (int i = 0; i < list.size(); i++) {
			String[] row = new String[] {
					String.valueOf(list.get(i).getNum()),
					list.get(i).getTitle(),
					list.get(i).getContent(),
					list.get(i).getWriter(),
					list.get(i).getRegDate().toString()};
//			System.out.print(list.get(i).getNum()+" ");
//			System.out.print(list.get(i).getTitle()+" ");
//			System.out.print(list.get(i).getContent()+" ");
//			System.out.print(list.get(i).getWriter()+" ");
//			System.out.println(list.get(i).getRegDate());
			datas[i] = row;
		}
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String num = datas[table.getSelectedRow()][0];
				System.out.println(num);
//				new UpdatePage(num);
			}
		});
		
		table.setModel(new DefaultTableModel(datas,
			new String[] {
				"NUM", "TITLE", "CONTENT", "WRITER", "REG_DATE"
			}
		));
		scrollPane.setViewportView(table);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		
		
		
		JButton insertBtn = new JButton("insertBtn");
		insertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		getContentPane().add(insertBtn, BorderLayout.SOUTH);
		
		
		
		setBounds(new Rectangle(500, 0, 500, 300));
		setTitle("Select Page");
		setVisible(true);
	}

}
