package semi.view;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Dialog_ extends JFrame{
	
	public static void dialog(String name) {
		Frame f = new Frame("Parent");
		f.setSize(300, 150);
		Dialog select = new Dialog(f, "Menu Select");
		select.setSize(300, 100);
		select.setLocation(350, 50);
		select.setLayout(new GridLayout(3,2));
		Label void1 = new Label("");
		Label void2 = new Label("");
		Label msg = new Label("�޴��� �����ϼ���");
		Label void3 = new Label("");
		Button description = new Button("������");
//		Button exam = new Button("���躸��");
		select.add(void1);
		select.add(void2);
		select.add(msg);
		select.add(void3);
		
		select.add(description);
//		select.add(exam);
		select.setVisible(true);
		description.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Imageimpl(name);
				select.setVisible(false);
			}
		});

	}
}
