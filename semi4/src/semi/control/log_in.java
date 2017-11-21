package semi.control;

import javax.swing.*;

import semi.model.DBDAO;
import semi.view.LanguagePage;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class log_in extends JFrame {

	JLabel Message;
	JTextField ID_Input, PW_Input;
	JLabel ID_Label, PW_Label;
	String ID;
	String PW;
	DBDAO LOGIN = new DBDAO();

	public log_in() {

		LoginFrame frame = new LoginFrame();
		frame.setSize(600, 200);
		frame.setTitle("로그인 창");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int xPos = screenSize.width / 2 - frame.getSize().width / 2;
		int yPos = screenSize.height / 2 - frame.getSize().height / 2;

		frame.setLocation(xPos, yPos);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});

		frame.setVisible(true);

	}

	class LoginFrame extends JFrame {

		public LoginFrame() {

			makeScreen();
		}

		public void makeScreen() {

			setLayout(new BorderLayout());
			Message = new JLabel("");
			this.add(BorderLayout.NORTH, Message);

			Panel panel1 = new Panel();
			panel1.setLayout(new GridLayout(2, 1));
			this.add(panel1);

			Panel panel11 = new Panel();
			panel11.setLayout(new FlowLayout());

			panel1.add(BorderLayout.WEST, panel11);

			Panel mes1 = new Panel();
			ID_Label = new JLabel("ID");
			mes1.add(ID_Label);
			panel11.add(mes1);

			Panel panel11up = new Panel();
			ID_Input = new JTextField(20);
			panel11up.add(ID_Input);
			
			panel11.add(panel11up);

			Panel mes2 = new Panel();
			PW_Label = new JLabel("PW");
			mes2.add(PW_Label);
			panel11.add(mes2);

			Panel panel11down = new Panel();
			PW_Input = new JTextField(20);
			panel11down.add(PW_Input);
			
			panel11.add(panel11down);

			JPanel panel12 = new JPanel();
			panel12.setLayout(new GridLayout(2, 1));
			panel1.add(BorderLayout.SOUTH, panel12);

			JPanel panel12down = new JPanel();
			JButton blogin = new JButton(" 로그인 ");
			blogin.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ID = ID_Input.getText();
					PW = PW_Input.getText();
					
					int flag = LOGIN.Login(ID, PW);

					if (flag == 1) {
						new LanguagePage();
						setVisible(false);
					} else {
						new error_message();

					}
				}
			});

			panel12down.add(blogin);
			panel12.add(panel12down);

		}
	}

	class error_message extends JDialog {

		public error_message() {

			JLabel message = new JLabel();
			this.setTitle("Error");
			this.setSize(200, 100);

			message.setText("잘못입력하셨습니다.");

			this.add(message);

			this.setModal(true);

			this.setLocation(1000, 550);
			this.setVisible(true);

		}

	}

}
