package semi.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Imageimpl extends JFrame {
	String code = "code";
	JButton close = new JButton("´Ý±â");

	public Imageimpl() {

	}

	public Imageimpl(String name) {
		Container connborder = getContentPane();
		
		connborder.setLayout(new BorderLayout());

		JPanel connflow = new JPanel();
		
		connflow.setLayout(new FlowLayout(FlowLayout.LEFT));
		connflow.add(close);
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(1, 2));
		JScrollPane scrollPane = new JScrollPane(new MyPanel(name));
		JScrollPane scrollPane2 = new JScrollPane(new MyPanel(name + code));
	
		contentPane.add(scrollPane);
		contentPane.add(scrollPane2);

		connborder.add(connflow, BorderLayout.NORTH);
		connborder.add(contentPane, BorderLayout.CENTER);

		setTitle("Description");
		setBounds(250, 100, 1100, 650);
		// setSize(1300, 700);
		setVisible(true);
	}

	class MyPanel extends JPanel {

		private static final long serialVersionUID = 1L;
		String name;

		public MyPanel() {
			// TODO Auto-generated constructor stub
		}

		public MyPanel(String name) {
			this.name = "Resource/" + name + ".jpg";
		}

		public void paintComponent(Graphics g) {
			try {
				BufferedImage image = ImageIO.read(new File(name));
				Image resizeImage = image.getScaledInstance(600, image.getHeight(), BufferedImage.SCALE_DEFAULT);
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
//				ImageIcon icon = new ImageIcon(name);
//				
//				Image img = icon.getImage();
				g2d.drawImage(resizeImage, 1, 1, this);
//				g2d.drawImage(img, 1, 1,600,image.getHeight(), this);

			} catch (IOException e) {
				
			}

			

		}

		public Dimension getPreferredSize() {
			return new Dimension(600, 3000);
		}

	}

}
