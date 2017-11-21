package semi.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ChapterPage extends JFrame {

	private JButton io = new JButton("IO");
	private JButton exception = new JButton("Exception");
	private JButton type = new JButton("Type");
	private JButton operator = new JButton("Operator");
	private JButton string = new JButton("String");
	private JButton date = new JButton("Date");
	private JButton random = new JButton("Random");
	private JButton static1 = new JButton("Static");
	private JButton branch = new JButton("분기문");
	private JButton loop = new JButton("Loop");
	private JButton array = new JButton("Array");
	private JButton collection = new JButton("Collection");
	private JButton class1 = new JButton("Class");
	private JButton inner = new JButton("Inner");
	private JButton extend = new JButton("Extend");
	private JButton abstract1 = new JButton("Abstract");
	private JButton interface1 = new JButton("Interface");
	private JButton poly = new JButton("다형성");
	private JButton jdbc = new JButton("JDBC");
	private JButton gui = new JButton("GUI");

	private JButton close = new JButton("닫기");
	public ChapterPage() {

		Container conn = getContentPane();
		conn.setLayout(new BorderLayout());
		JPanel connflow = new JPanel();
		JPanel con = new JPanel();
		connflow.setLayout(new FlowLayout(FlowLayout.LEFT));
		connflow.add(close);
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		
		con.setLayout(new GridLayout(10, 2));

		con.add(io);
		con.add(exception);
		con.add(type);
		con.add(operator);
		con.add(string);
		con.add(date);
		con.add(random);
		con.add(static1);
		con.add(branch);
		con.add(loop);
		con.add(array);
		con.add(collection);
		con.add(class1);
		con.add(inner);
		con.add(extend);
		con.add(abstract1);
		con.add(interface1);
		con.add(poly);
		con.add(jdbc);
		con.add(gui);
		io.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new IO();
			}
		});

		type.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Type1();
			}
		});

		operator.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Operator();
			}
		});

		random.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Random();
			}
		});

		branch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Branch();
			}
		});

		collection.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Collection();
			}
		});

		exception.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exception();
			}
		});

		string.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new String1();
			}
		});

		date.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Date();
			}
		});

		static1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Static();
			}
		});

		extend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Extend();
			}
		});

		abstract1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Abstract();
			}
		});

		gui.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new GUI();
			}
		});
		loop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Loop();
			}
		});

		array.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Array_();
			}
		});

		class1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Class_();
			}
		});

		inner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Inner();
			}
		});
		interface1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Interface_();
			}
		});

		poly.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Polymorphism_();
			}
		});

		jdbc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Jdbc();
			}
		});
		conn.add(connflow, BorderLayout.NORTH);
		conn.add(con, BorderLayout.CENTER);
		setTitle("Chapter");
		setBounds(0, 0, 250, 400);
		setVisible(true);
	}

}
