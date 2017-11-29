package xiangmu1;


import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui {
	
	JPanel	panel = new JPanel();
	JFrame frame = new JFrame();
	Container  contentpane = frame.getContentPane();
	JTextField tf = new JTextField(15);
	public void show1(){		
	panel.add(tf);
	
	contentpane.add(panel, BorderLayout.NORTH);
	frame.setSize(300, 200);
	frame.setVisible(true);
			}	
}
