package test.com.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SelectPage extends JFrame {
	private JButton insertBtn = new JButton("insertBtn");
	private JTable jtable;
	
	public SelectPage() {
		Container con = getContentPane();
//		con.setLayout(new GridLayout(2, 1));
		con.setLayout(new BorderLayout());
		
		
		
		String[] colNames = new String[] {"NUM","ID","PW","NAME","TEL"};
		String[][] datas = new String[20][colNames.length];
		
		for (int i = 0; i < datas.length; i++) {
			datas[i] = new String[] {""+(i+1),"admin"+(i+1),"hi123456","KIM","010"};
		}
		
		
		jtable = new JTable(datas,colNames);
		
		jtable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("click..");
//				System.out.println(jtable.getSelectedRow());
				String num = datas[jtable.getSelectedRow()][0];
				System.out.println(num);
				new UpdatePage(num);
			}
		});
		
		con.add(new JScrollPane(jtable),"Center");
		
		
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new InsertPage();
			}
		});
		con.add(insertBtn,"South");
		
		setTitle("Select Page");
		setBounds(500, 0, 400, 300);
		setVisible(true);
	}

}
