import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx extends JFrame{

	JLabel la = new JLabel("hello");
	JLabel co = new JLabel();

	MouseListenerEx()
	{
		setTitle("MouseListenerEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());
		
		
		
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);
		co.setSize(100, 20);
		co.setLocation(0, 0);
		contentPane.add(co);

		setSize(200,200);
		setVisible(true);
		
	}
	/*
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
			
			String str = "( " + x + " , " + y + " )";
			co.setText(str);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	*/
	public static void main(String[] args) {
		new MouseListenerEx();
	}
	
}

class MyMouseListener implements MouseListener{
	public void mousePressed(MouseEvent e) {

		int x = e.getX();
		int y = e.getY();
		Container pain = (Container)e.getSource();
		Component [] comp = pain.getComponents();
		JLabel co = null;
		co = (JLabel)pain.findComponentAt(10,10);
		if (co != null)
		{
			String str = "( " + x + " , " + y + " )";
			co.setText(str);
		}
		JLabel la = null;
		for(Component c : comp)
		{
			if(c instanceof JLabel)
			{
				if (((JLabel)c).getText().compareTo("hello") == 0)
				{
					la = (JLabel)c;
					break;
				}
			}
		}
		if (la != null)
			la.setLocation(x,y);

	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}
