package gui_1;
import javax.swing.*;
import java.awt.*;

public class gui_1 extends JFrame{
	
	gui_1(){
		
		setTitle("Open Challenge 9");
		Container contentPane = getContentPane();
		
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JButton("Open"));
		contentPane.add(new JButton("Read"));
		contentPane.add(new JButton("Close"));
		
		JPanel cPanel = new JPanel();
		cPanel.setLayout(null);
		
		JLabel a = new JLabel("hello");
		a.setSize(100,20);
		a.setLocation(100,10);
		
		JLabel b = new JLabel("JAVA");
		b.setSize(100, 20);
		b.setLocation(20, 200);
		
		JLabel c = new JLabel("Love");
		c.setSize(100, 20);
		c.setLocation(200, 150);
		
		cPanel.add(a);
		cPanel.add(b);
		cPanel.add(c);
		
		setSize(300,400);
		setVisible(true);
		
		/*
		super("Open Chhallenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new NorthPanel(), BorderLayout.NORTH);
		add(new CenterPanel(), BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		*/
	}
	/*
	class CenterPanel extends JPanel{
		public CenterPanel() {
			setLayout(null);
			
			JLabel a = new JLabel("Hello");
			a.setSize(100, 100);
			a.setLocation(100, 10);
			
			JLabel b = new JLabel("JAVA");
			b.setSize(100, 20);
			b.setLocation(20, 200);
			
			JLabel c = new JLabel("Love");
			c.setSize(100, 20);
			c.setLocation(200, 150);
			
			add(a);
			add(b);
			add(c);
		}
	}
	class NorthPanel extends JPanel{
		public NorthPanel() {
			setLayout(null);
			
			Container contentPane = getContentPane();
			contentPane.setBackground(Color.LIGHT_GRAY);
			contentPane.setLayout(new FlowLayout());

			contentPane.add(new JButton("Open"));
			contentPane.add(new JButton("Read"));
			contentPane.add(new JButton("Close"));
		}
	}
	*/
	public static void main(String[] args) {
	new gui_1();
	}
}

